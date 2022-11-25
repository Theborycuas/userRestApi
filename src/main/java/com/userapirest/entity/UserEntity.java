package com.userapirest.entity;

import javax.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String userLastname;
	private String userEmail;
	private String userPassword;
	private String userAddress;
	private String userCity;
	private String userPhone;
	
	public UserEntity () {
		
	}
}
