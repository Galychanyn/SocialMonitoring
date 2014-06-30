package com.lohika.home.dao;

import java.util.List;

import com.lohika.home.business.User;

public interface UserDao {

    void insertData(User user);
    List<User> getUsersList();
    void updateData(User user);
    void deleteData(String id);
    User getUser(String id);
    User getUserByName(String username);
}
