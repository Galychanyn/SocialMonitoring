package com.lohika.home.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
@RequestMapping("/")
public class HomeController {

    private static final String VIEW_NAME = "home";
    
    @RequestMapping(value = "/" + VIEW_NAME)
    public String index() {
        return VIEW_NAME;
    }
    
    @RequestMapping(value = "/check-login")
    public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        //response.getWriter().println(new Gson().toJson(user));
        HttpSession session = request.getSession();
        model.addAttribute("errorMsgLogin", "fuck");
        ModelAndView mav = new ModelAndView(VIEW_NAME, model);
        return mav;
    }
}
