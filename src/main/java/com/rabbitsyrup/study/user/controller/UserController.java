package com.rabbitsyrup.study.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitsyrup.study.user.service.UserService;

@RestController
public class UserController {
 
    @Autowired
    private UserService userService;
     
    @RequestMapping(value="/users")
	public List<Map<String, Object>> users(@RequestParam(value="name", defaultValue="") String name) throws Exception {
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("name", name);
    	
		return userService.selectUsers(param);
	}
}