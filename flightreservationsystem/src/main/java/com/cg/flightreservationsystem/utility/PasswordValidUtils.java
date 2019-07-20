package com.cg.flightreservationsystem.utility;

import com.cg.flightreservationsystem.exception.FRSException;

public class PasswordValidUtils {

	public static boolean passwordValidation(String password) throws FRSException {
		// Regex for String: password should be alphanumeric with 3 to 15 character
		// length
		if (!password.matches("^.{8,}$")) {
			throw new FRSException(ExceptionMessagesUtils.MESSAGE5);
		} else {

			if (!password.matches("^.*[a-z].*$")) {
				throw new FRSException(ExceptionMessagesUtils.MESSAGE7);
			}

			if (!password.matches("^.*[0-9].*$")) {
				throw new FRSException(ExceptionMessagesUtils.MESSAGE8);
			}
			if (!password.matches("^.*[#?!@$%^&*-].*$")) {
				throw new FRSException(ExceptionMessagesUtils.MESSAGE9);
			}
			if (!password.matches("^.*[A-Z].*$")) {
				throw new FRSException(ExceptionMessagesUtils.MESSAGE6);
			}

			else
				return true;
		}
	}
}
