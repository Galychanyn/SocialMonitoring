package com.lohika.home.data;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lohika.home.business.User;

@Component
@Scope("singleton")
public class DataHolder {
    
    private Map<HttpSession, User> userSessions = new HashMap<>();
    
    public Map<HttpSession, User> getUserSessions() {
        return userSessions;
    }
}
