package com.cg.ata.project.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ata.project.exception.AccountAlreadyExistsException;
import com.cg.ata.project.exception.InvalidLogin;
import com.cg.ata.project.model.Role;
import com.cg.ata.project.model.User;
import com.cg.ata.project.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	/**************** validation ******************/

	public User validateLogin(long mobileNumber, String password,Role role) {

		User user = userRepository.validateLogin(mobileNumber, password);
		if (user != null) {
			LOG.info("Validation Done");
			return user;
		} else
			throw new InvalidLogin("Invalid Credentials");

	}

	/******************** register *******************/
	@Override
	public User registerUser(User user) {
		LOG.info(user.toString());
		Optional<User> userOptional = userRepository.findById(user.getMobileNumber());
		if (userOptional.isEmpty()) {
			return userRepository.save(user);
		} else {
			String exceptionMessage = "User with mobileNumber" + user.getMobileNumber() + " already exists.";
			throw new AccountAlreadyExistsException(exceptionMessage);
		}
	}

}
