package com.codewithmosh.store.dtos;

import lombok.Data;

//encapsulates the data needed to register a user
// This class is used to transfer data between the client and the server

@Data
public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
}
