package com.gmail.derevets.artem.elasticsearchserver.rabbitmq;

import com.datastax.driver.core.utils.UUIDs;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.derevets.artem.elasticsearchserver.elastic.UserElasticRepository;
import com.gmail.derevets.artem.elasticsearchserver.entity.User;
import lombok.extern.slf4j.Slf4j;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.UUID;

@Slf4j
@Service
@EnableRabbit
public class RabbitMqElasticListener {
    @Autowired
    private UserElasticRepository userElasticRepository;

    @RabbitListener(queues = "user-save-elastic")
    public void subscribeWorkerOne(String userExternal) throws IOException {
        log.info("User {}", userExternal);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode userJson = mapper.readTree(userExternal);
        User user = mapper.treeToValue(userJson, User.class);
        log.info("User Elastic {}", user);
        userElasticRepository.save(user);
    }
}
