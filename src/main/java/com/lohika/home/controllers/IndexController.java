package com.lohika.home.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lohika.home.business.User;
import com.lohika.home.business.UserService;
import com.lohika.home.data.DataHolder;

/**
 * Servlet implementation class Index
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static final String VIEW_NAME = "index";

    @Autowired
    UserService userService;
    @Autowired
    DataHolder dataHolder;

    @RequestMapping(value = "/" + VIEW_NAME)
    public String index() {
        return VIEW_NAME;
    }

    @RequestMapping(value = "/signin")
    public ModelAndView login(@RequestParam Map<String, String> map, ModelMap model, HttpSession session, 
            HttpServletResponse response)
            throws IOException {
        String errorMsg = null;

        System.out.println(map + "===========");
        String username = map.get("name_login");
        String password = map.get("pass_login");
        if (username == null || password == null) {
            errorMsg = "you input incorrect data, please check you data";
            model.addAttribute("errorMsg", errorMsg);
            ModelAndView mav = new ModelAndView("signup", model);
            response.sendError(0, "fuck");
            return mav;
        }
        User user = userService.getUserByName(username);
        if (null == user) {
            errorMsg = "such user doesn't exists";
            model.addAttribute("errorMsg", errorMsg);
            System.out.println("-----------------");
            ModelAndView mav = new ModelAndView("redirect:/signup", model);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("fuck");
            return mav;
        } else {
            if (!user.getPassword().contentEquals(password)) {
                model.addAttribute("errorMsgLogin", "you input incorrect password");
                ModelAndView mav = new ModelAndView("index", model);
                System.out.println(password + "-----------------------");
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().println("fuckcuck");
                return mav;
            } else {
                for (User user2 : dataHolder.getUserSessions().values()) {
                    if (user2.getName().equals(username)) {
                        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                        response.getWriter().println("fuckcuck");
                        model.addAttribute("errorMsgLogin", "such user already logged");
                        ModelAndView mav = new ModelAndView("index", model);
                        return mav;
                    }
                }
                dataHolder.getUserSessions().put(session, user);
                model.addAttribute("errorMsgLogin", "such user already logged");
                ModelAndView mav = new ModelAndView("index", model);
                return mav;
            }
        }
    }
}
