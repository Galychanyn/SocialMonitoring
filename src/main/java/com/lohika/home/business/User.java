package com.lohika.home.business;

import org.springframework.stereotype.Component;

@Component
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    
    public User(int id, String username, String password, String email) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public User() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return username;
    }
    public void setName(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + username + ", password=" + password + ", email=" + email + "]";
    }
    
}
