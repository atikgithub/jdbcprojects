package com.jsp.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		// load or Register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first","root","root");

			// Establish the Statement
			Statement statement = connection.createStatement();
			//Execute the Statement
			boolean res=statement.execute("create table jdbc_first.user(id int primary key,name varchar(40),phone bigint(10))");
			
			
			//close the Connecton
			connection.close();
			System.out.println("Table Created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}