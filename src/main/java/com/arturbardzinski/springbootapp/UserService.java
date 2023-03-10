package com.arturbardzinski.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private DatabaseConnection databaseConnection;
    @Autowired
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    public void registerUser(String name) {
        databaseConnection.addUserToDatabase(name);
    }
}
