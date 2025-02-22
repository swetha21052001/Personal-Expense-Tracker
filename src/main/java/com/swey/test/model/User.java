package com.swey.test.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
@Data
public class User{
    @Id
    private String id;
    private String name;
    private String email;
}
