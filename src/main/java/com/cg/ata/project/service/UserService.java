package com.cg.ata.project.service;

import com.cg.ata.project.exception.InvalidLogin;
import com.cg.ata.project.model.Role;
import com.cg.ata.project.model.User;

public interface UserService {
	
       public User validateLogin(long mobileNumber,String password,Role role) throws InvalidLogin;
		public User registerUser(User user);

	}
