package com.cg.flightreservationsystem.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.UserAuthenticationService;

@RestController
@RequestMapping(value = "/login")
public class LoginRestController {
	@Autowired
	private UserAuthenticationService userAuth;

	public void setUserAuth(UserAuthenticationService userAuth) {
		this.userAuth = userAuth;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json")
	public String checkUser(@RequestBody UserEntity user) throws FRSException {
		System.out.println(user);
		userAuth.login(user);
		// Here add login timestamp in login_details table
		userAuth.addLoginTimestamp(user.getUsername(), new Date(), new Date());
		return "Hello User, You Have Successfully Logged In";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST, consumes = "application/json")
	public String checkAdmin(@Valid @RequestBody UserEntity user) throws FRSException {

		userAuth.login(user);

		return "Hello Admin, You Have Successfully Logged In";
	}

}
