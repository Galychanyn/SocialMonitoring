package com.lohika.home.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lohika.home.business.User;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserExtractor extractor = new UserExtractor();
        return extractor.extractData(rs);
    }

}
