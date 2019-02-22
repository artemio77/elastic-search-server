package com.gmail.derevets.artem.elasticsearchserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "contact", type = "contact")
public class Contact extends BaseEntity<UUID> {


    private List<UUID> participant;

    private boolean approved;
}
