package com.cg.flightreservationsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.flightreservationsystem.exception.FRSException;

/**
 * Class to set up connection for database
 * 
 * @author Aman
 *
 */
public class DbConnectionUtils {
	private static Connection con;

	/**
	 * 
	 * @return Connection
	 * @throws FRSException
	 */
	public static Connection getConnection() throws FRSException {
		try {
			if (con == null || con.isClosed()) {
				try {
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				} catch (SQLException e) {
					throw new FRSException(ExceptionMessagesUtils.MESSAGE4);
				}

			}
		} catch (SQLException e) {
			throw new FRSException(ExceptionMessagesUtils.MESSAGE4);
		}

		return con;
	}
}
