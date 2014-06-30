package com.lohika.home.business;

import java.util.List;

public interface UserService {

    void insertData(User user);
    List<User> getUsersList();
    void updateData(User user);
    void deleteData(String id);
    User getUser(String id);
    User getUserByName(String username);
}
