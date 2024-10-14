package com.example.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.exceptions.UserAlreadyExistsException;
import com.example.repository.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Updated createUser method with JSON response
    public ResponseEntity<Map<String, String>> createUser(@Valid UserEntity user) {
        Optional<UserEntity> checkExistingUser = userRepository.findByEmail(user.getEmail());
        
        Map<String, String> response = new HashMap<>();

        if (checkExistingUser.isPresent()) {
            response.put("error", "User already exists with this email");
            return new ResponseEntity<>(response, HttpStatus.CONFLICT);
        }

        // Save the new user
        userRepository.save(user);
        response.put("message", "User registered successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public ResponseEntity<Map<String, String>> login(String email, String password) {
        Optional<UserEntity> userCheck = userRepository.findByEmail(email);

        Map<String, String> response = new HashMap<>();
        
        if (userCheck.isEmpty()) {
            response.put("error", "User not found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        UserEntity user = userCheck.get();
        if (!user.getPassword().equals(password)) {
            response.put("error", "Email or password are incorrect");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        response.put("message", "Login successful");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
