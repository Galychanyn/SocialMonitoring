package com.lohika.home.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.lohika.home.business.User;

public class UserExtractor implements ResultSetExtractor<User> {
    
    @Override
    public User extractData(ResultSet rs) throws SQLException, DataAccessException {
        User user = new User();
        user.setId(rs.getInt(1));
        user.setName(rs.getString(2));
        user.setPassword(rs.getString(3));
        user.setEmail(rs.getString(4));
        return user;
    }

}
