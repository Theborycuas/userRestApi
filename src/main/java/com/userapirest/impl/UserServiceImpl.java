package com.userapirest.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.userapirest.entity.UserEntity;
import com.userapirest.repository.UserRepository;
import com.userapirest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserEntity> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(userEntity);
	}

	@Override
	public UserEntity updatUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	
	
	
}
