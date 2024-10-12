package com.example.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.entity.UserEntity;
import com.example.exceptions.UserAlreadyExistsException;
import com.example.exceptions.UserNotFoundException;
import com.example.repository.UserRepository;
import jakarta.validation.Valid;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createUser(@Valid UserEntity user) {
		Optional<UserEntity> checkExistingUser = userRepository.findByEmail(user.getEmail());
		System.out.println(user);
		System.out.println(user.getUsername());
		if (user.getUsername().length() < 2) {
			System.out.println("username must be at least 2 characters");
		}

		if (checkExistingUser.isPresent()) {
			throw new UserAlreadyExistsException("user already exists with this email");
		}

		userRepository.save(user);
		return "user registered successful";
	}

	public ResponseEntity<String> login(String email, String password) {
		Optional<UserEntity> userCheck = userRepository.findByEmail(email);

		if (userCheck.isEmpty()) {
			throw new UserNotFoundException("User not found");
		}

		UserEntity user = userCheck.get();
		if (!user.getPassword().equals(password)) {
			return new ResponseEntity<>("email or password are incorrect", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("login successful", HttpStatus.OK);
	}

}

