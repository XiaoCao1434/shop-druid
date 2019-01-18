package com.xcky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcky.entity.User;
import com.xcky.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/list")
	public List<User> findAllUser() {
		List<User> list = userRepository.findAll();
		return list;
	}
}
