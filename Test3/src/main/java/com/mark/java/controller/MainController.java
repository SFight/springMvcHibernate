package com.mark.java.controller;

import com.mark.java.entity.User;
import com.mark.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/17 0017.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("MarK");
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("Mark", "Hello");
        result.put("Ken", "Hehe");
        result.put("Fowafolo", "fool");
        return result;
    }

    @RequestMapping("/jsonList")
    @ResponseBody
    public List<User> jsonList() {

        return userService.getAllUsernames();
    }
}
