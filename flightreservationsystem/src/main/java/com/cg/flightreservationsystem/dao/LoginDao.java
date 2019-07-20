package com.cg.flightreservationsystem.dao;

import com.cg.flightreservationsystem.entity.LoginEntity;
import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;

public interface LoginDao {

	public boolean findUser(UserEntity user) throws FRSException;

	public boolean addLoginInstance(LoginEntity loginEntity);
}
