package com.gmail.derevets.artem.elasticsearchserver.elastic;


import com.gmail.derevets.artem.elasticsearchserver.entity.Message;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageElasticRepository extends ElasticsearchRepository<Message, UUID> {

    Message findMessageByChat(UUID id);

    Message findMessageById(UUID id);
}
