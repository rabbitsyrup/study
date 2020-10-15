package com.rabbitsyrup.study.user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	List<Map<String, Object>> selectUsers(Map<String, Object> map) throws Exception;
}
