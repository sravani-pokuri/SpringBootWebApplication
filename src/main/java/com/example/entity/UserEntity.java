package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private Long id;
	
	@Column(nullable = false)
	@NotEmpty(message = "username cannot be empty")
	private String username;
	
	@NotEmpty(message = "password cannot be empty")
	@Size(min = 6, message = "password size must be at least 6 characters long")
	private String password;
	
	@Email(message = "invalid email format")
	@NotEmpty(message = "email cannot be empty")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	public UserEntity(Long id, @NotEmpty(message = "username cannot be empty") String username,
			@NotEmpty(message = "password cannot be empty") @Size(min = 6, message = "password size must be at least 6 characters long") String password,
			@Email(message = "invalid email format") @NotEmpty(message = "email cannot be empty") String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	
	
}
