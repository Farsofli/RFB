package com.example.demo;

public class Model {


    public User getUser(String username, String password) {

        User user = new User();
        user.setUsername("SANDRA");
        user.setPassword("RFB");

        if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
            return user;
        } return null;

    }
}
