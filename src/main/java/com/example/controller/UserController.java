package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public String registerUser(@Valid @RequestBody UserEntity user) {
		//System.out.println(user);
		return userService.createUser(user);
		
	}

	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody Map<String, String> requestBody) {
	    String email = requestBody.get("email");
	    String password = requestBody.get("password");
	    System.out.println(requestBody);
	   
	    return userService.login(email, password);
	}
}
