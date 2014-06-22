package com.lohika.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Servlet implementation class Index
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static final String VIEW_NAME = "index";

    @RequestMapping(value="/"+VIEW_NAME, method = RequestMethod.GET)
    public String index() {
       return VIEW_NAME;
    }
    
    @RequestMapping(value="/signup")
    public String signUp() {
       return "signup";
    }
}
