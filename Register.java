package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Register {

	public static void main(String[] args) {
		// Register the Driver
		try {
	         Driver driver = new Driver();
	         DriverManager.registerDriver(driver);
			// Establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307","root","root");
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
