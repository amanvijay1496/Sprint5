package com.cg.flightreservationsystem.service;

import java.util.Date;

import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;

public interface UserAuthenticationService {

	public boolean login(UserEntity user) throws FRSException;
	public boolean addLoginTimestamp(String username, Date inTime, Date outTime) throws FRSException;
	
}
