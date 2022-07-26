package com.cg.ata.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ata.project.model.Role;
import com.cg.ata.project.model.User;
import com.cg.ata.project.service.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImp use;

	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
    /********************register*******************/
	
	@PostMapping("user/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		LOG.info(user.toString());
		return new ResponseEntity<User>(use.registerUser(user), HttpStatus.CREATED);
	}
	
	/*******************user login********************************/
	
	@GetMapping("user/validation")
	public ResponseEntity<User> validtaeLogin(@RequestParam("mno") long mno,@RequestParam("pass") String pass,@RequestParam("role")Role role){
	return new ResponseEntity<>(use.validateLogin(mno, pass,role),HttpStatus.OK);
	
	}

	
}

