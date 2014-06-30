package com.lohika.home.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lohika.home.dao.UserDao;

@Service
@Lazy
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public void insertData(User user) {
        userDao.insertData(user);
    }

    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }

    @Override
    public void updateData(User user) {
        userDao.updateData(user);
    }

    @Override
    public void deleteData(String id) {
        userDao.deleteData(id);
    }

    @Override
    public User getUser(String id) {
        return userDao.getUser(id);
    }

    @Override
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }

}
