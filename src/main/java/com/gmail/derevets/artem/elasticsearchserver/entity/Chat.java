package com.gmail.derevets.artem.elasticsearchserver.entity;

import com.gmail.derevets.artem.elasticsearchserver.entity.type.ChatType;
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
@Document(indexName = "chat", type = "chat")
public class Chat extends BaseEntity<UUID> {

    private ChatType chatType;

    private List<UUID> participant;

    private String description;
}
