package com.rabbitsyrup.study.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitsyrup.study.user.dao.UserDAO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
    public List<Map<String, Object>> selectUsers(Map<String, Object> map) throws Exception {
        return userDAO.selectUsers(map);
    }
}