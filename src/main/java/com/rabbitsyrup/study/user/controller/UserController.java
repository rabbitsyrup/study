package com.rabbitsyrup.study.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbitsyrup.study.user.service.UserService;

@Controller
public class UserController {
 
    @Autowired
    private UserService userService;
     
    @RequestMapping(value="/test")
	public String test(@RequestParam(value="name", defaultValue="") String name, Model model) throws Exception {
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("name", name);
    	model.addAttribute("user", userService.selectUsers(param));
		return "test";
	}
}