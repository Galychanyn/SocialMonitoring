package com.lohika.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SignUpController {

    private static final String VIEW_NAME = "signup";

//    @RequestMapping(value="/"+VIEW_NAME)
//    public String signUp() {
//       return "signup";
//    }
}
