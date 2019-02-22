package com.gmail.derevets.artem.elasticsearchserver.entity;

import com.gmail.derevets.artem.elasticsearchserver.entity.type.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "message", type = "message")
public class Message extends BaseEntity<UUID> {


    private MessageType messageType;

    private String text;

    private UUID chat;


}
