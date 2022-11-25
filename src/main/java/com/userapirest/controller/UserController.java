package com.userapirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapirest.entity.UserEntity;
import com.userapirest.impl.UserServiceImpl;
import com.userapirest.service.UserService;



@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserEntity> findAllUser(){
		return userService.findAllUser();
	}
	
	@GetMapping("/{id}")
	public Optional<UserEntity> findUserById(@PathVariable("id") Integer id){
		return userService.findById(id);
	}
	
	
	@PostMapping
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		return userService.saveUser(userEntity);
	}
	
	@PutMapping
	public UserEntity updateuser(@RequestBody UserEntity userEntity) {
		return userService.updatUser(userEntity);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
		
}
