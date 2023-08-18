package com.jsp.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Url {
	public static void main(String[] args) {
     try {
		DriverManager.registerDriver(new Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307? user=root & password=root");
		System.out.println(connection);
	} catch (SQLException e) {
	    
		e.printStackTrace();
	}
	}

}
