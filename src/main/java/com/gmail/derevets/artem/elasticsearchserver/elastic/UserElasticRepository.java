package com.gmail.derevets.artem.elasticsearchserver.elastic;

import com.gmail.derevets.artem.elasticsearchserver.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserElasticRepository extends ElasticsearchRepository<User, UUID> {

    User findByEmail(String email);
}
