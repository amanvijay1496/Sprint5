package com.cg.flightreservationsystem.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.UserAuthenticationService;

@RestController
public class LoginRestController {
	@Autowired
	private UserAuthenticationService userAuth;

	public void setUserAuth(UserAuthenticationService userAuth) {
		this.userAuth = userAuth;
	}
	
	private static final Logger log = LoggerFactory.getLogger(LoginRestController.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public String checkUser(@RequestBody UserEntity user) throws FRSException {
		log.info("Store: Check user method started");
		
		userAuth.login(user);
		// Added Login Timestamp in Database
		userAuth.addLoginTimestamp(user.getUsername(), new Date(), new Date());
		String Role="";
		if(user.getRoleid() == 1) {
			Role = "Admin";
		}
		else Role="User";
		log.info("Store: Check user method End");
		return "Hello "+ Role+ ", You Have Successfully Logged In";
	}


}
