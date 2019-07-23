package com.cg.flightreservationsystem.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightreservationsystem.dao.LoginDao;
import com.cg.flightreservationsystem.entity.LoginEntity;
import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.UserAuthenticationService;
import com.cg.flightreservationsystem.utility.ExceptionMessagesUtils;
import com.cg.flightreservationsystem.utility.PasswordValidUtils;
import com.cg.flightreservationsystem.utility.UsernameValidUtils;

/**
 * Implementation class for UserAuthentication Interface
 * 
 * @author Aman
 *
 */
@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
	@Autowired
	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	/**
	 * Login function to check input is valid or not
	 * 
	 * @param user, role
	 * @return boolean
	 * @throws FRSException
	 */
	public boolean login(UserEntity user) throws FRSException {
		UsernameValidUtils.usernameValidation(user.getUsername());
		PasswordValidUtils.passwordValidation(user.getPassword());

		boolean result = loginDao.findUser(user);
		if (!result) {
			throw new FRSException(ExceptionMessagesUtils.MESSAGE3);

		} else
			return true;

	}

	public boolean addLoginTimestamp(String username, LocalDate inTime, Date outTime) throws FRSException {
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setUsername(username);
		loginEntity.setOutTime(outTime);
		loginEntity.setInTime(inTime);
		if(!loginDao.addLoginInstance(loginEntity)) {
			throw new FRSException("Some database error");
		}
		return true;
	}

	@Override
	public boolean addLoginTimestamp(String username, Date date, Date outTime) throws FRSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object[]> viewLoginDetail(LocalDate date) {
		return loginDao.viewLoginDetail(date);
	}

}
