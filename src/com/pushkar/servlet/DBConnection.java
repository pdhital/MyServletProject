package com.pushkar.servlet;

import java.sql.*;

public class DBConnection {
	private static String dburl = "jdbc:mysql://localhost:3306/sakila";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String un = "localhost";
	private static String pass = "admin";
	private static Connection con = null;
	
	public static Connection getConnection(){
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dburl, un, pass);
		} catch (SQLException ex) {
			} catch (ClassNotFoundException ex) {
		
		}
		return con;
	}

}
