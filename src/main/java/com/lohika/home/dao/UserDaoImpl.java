package com.lohika.home.dao;

import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lohika.home.business.User;
import com.lohika.home.jdbc.UserRowMapper;

@Service
@Lazy
@Scope("singleton")
public class UserDaoImpl implements UserDao {

    @Autowired
    DataSource dataSource;

    @Override
    public void insertData(User user) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        if (null != user) {
            String sql = "INSERT INTO user (username, password, email )" + " VALUES ('" + user.getName() + "', '"
                    + user.getPassword() + "', '" + user.getEmail() + "');";
            jdbcTemplate.execute(sql);
        }
    }

    @Override
    public List<User> getUsersList() {
        List<User> users = new LinkedList<>();
        String sql = "SELECT * FROM user;";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        users = jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }

    @Override
    public void updateData(User user) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteData(String id) {
        if (null != id) {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            String sql = "DELETE FROM user where user.id" + id + ";";
            jdbcTemplate.update(sql);
        }
    }

    @Override
    public User getUser(String id) {
        if (null != id) {
            try {
                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
                String sql = "SELECT * FROM user where user.id=" + id + ";";
                return jdbcTemplate.query(sql, new UserRowMapper()).get(0);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("such user:" + id + " does not exists");
                return null;
            }
        } else
            return null;
    }

    @Override
    public User getUserByName(String username) {
        if (null != username) {
            try {
                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
                String sql = "SELECT * FROM user where user.username='" + username + "';";
                return jdbcTemplate.query(sql, new UserRowMapper()).get(0);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("such user:" + username + " does not exists");
                return null;
            }
        } else
            return null;
    }

}
