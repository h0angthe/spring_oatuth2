package com.example.testsecurity.infra.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String _id;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
}
