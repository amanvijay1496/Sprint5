package com.cg.flightreservationsystem.utility;

/**
 * Queries to fetch User data from Userdata and Admin table
 * 
 * @author Aman
 *
 */
public class DbQueryUtils {

	public static final String SELECTUSER = "select password from customer where username=?";
	public static final String SELECTADMIN = "select password from admin where username=?";
}
