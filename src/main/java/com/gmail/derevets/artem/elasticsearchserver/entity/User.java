package com.gmail.derevets.artem.elasticsearchserver.entity;

import com.gmail.derevets.artem.elasticsearchserver.entity.type.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Data
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "user", type = "user")
public class User extends BaseEntity<UUID> implements Serializable {


    private String email;

    private String firstName;

    private String lastName;

    private Role role;

    private Boolean isAccountNonLocked;

    private Boolean isAccountNonExpired;

    private Boolean isCredentialsNonLocked;

    private Boolean isEnabled;


}
