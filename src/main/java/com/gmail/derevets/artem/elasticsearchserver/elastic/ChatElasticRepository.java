package com.gmail.derevets.artem.elasticsearchserver.elastic;

import com.gmail.derevets.artem.elasticsearchserver.entity.Chat;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ChatElasticRepository extends ElasticsearchRepository<Chat, UUID> {

    Chat findByParticipantContains(UUID id);

    Optional<Chat> findById(UUID id);
}
