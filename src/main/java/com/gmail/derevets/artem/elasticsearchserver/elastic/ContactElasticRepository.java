package com.gmail.derevets.artem.elasticsearchserver.elastic;

import com.gmail.derevets.artem.elasticsearchserver.entity.Contact;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ContactElasticRepository extends ElasticsearchRepository<Contact, UUID> {

    Optional<Contact> findById(UUID id);

    Contact findByParticipantContains(UUID id);
}
