package com.arturbardzinski.springbootapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @Value("localhost")
    private String host;
    @Value("Artur")
    private String username;
    @Value("password")
    private String password;

    public void addUserToDatabase(String name) {
        System.out.println("User added to db");
    }

}
