package com.jsp.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class GetConnection {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			FileInputStream fileInputStream= new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307",properties);
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
