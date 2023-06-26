package com.example.testsecurity.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InputCreateUser {

    private String firstName;
    private String lastName;
    private String email;
    private String pass;

}