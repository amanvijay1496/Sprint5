package com.cg.flightreservationsystem.utility;

import com.cg.flightreservationsystem.exception.FRSException;

public class UsernameValidUtils {
	/**
	 * Boolean function to check whether username is valid string or not
	 * 
	 * @param username
	 * @return boolean
	 * @throws FRSException
	 */
	public static boolean usernameValidation(String username) throws FRSException {
		// Regex for String: username should be alphanumeric with 3 to 15 character
		// length
		if (!username.matches("^[A-Za-z0-9]{3,15}$")) {
			throw new FRSException(ExceptionMessagesUtils.MESSAGE2);
		} else {
			return true;
		}
	}
}
