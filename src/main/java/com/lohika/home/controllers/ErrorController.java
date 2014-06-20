package com.lohika.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

    protected static final String VIEW_NAME = "error-404";
    
    @RequestMapping(value="/"+VIEW_NAME, method = RequestMethod.GET)
    public String error() {
       return VIEW_NAME;
    }
}
