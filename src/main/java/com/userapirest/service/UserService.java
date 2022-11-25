package com.userapirest.service;

import java.util.List;
import java.util.Optional;

import com.userapirest.entity.UserEntity;

public interface UserService {
	List<UserEntity> findAllUser();	
	Optional<UserEntity> findById(Integer id);
	UserEntity saveUser(UserEntity userEntity);
	UserEntity updatUser(UserEntity userEntity);
	void deleteUser(Integer id);
	
	

}
