package com.cruiser.secureDemo.entity;


import com.cruiser.secureDemo.Common.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
@Builder
@Data
public class Users {

    @Id
    private String id;
    private String username;
    private String password;
    private Roles role;

}
