package com.rabbitsyrup.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbitsyrup.study.user.service.UserService;

@Controller
public class UserController {
 
    @Autowired
    private UserService userService;
     
    @RequestMapping(value="/test")
	public String test(Model model) throws Exception {
    	model.addAttribute("user", userService.selectUsers(null));
		return "test";
	}
}