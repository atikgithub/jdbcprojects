package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) throws SQLException {
		try {
			// load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first", "root", "root");
			// Establish the Statement
			Statement statement = connection.createStatement();
			//Execute the Query
			//boolean res=statement.execute("create table jdbc_first.user(id int primary key,name varchar(40),phone bigint(10),city varchar(40))");
			 boolean res = statement.execute("insert into jdbc_first.demo2 values(5,'Khan',8865332211,'gonda')");
		    //boolean res =statement.execute("update demo2 set city='mankapur' where id=1");
		    // boolean res =statement.execute("delete from  demo2  where id=4");
			
			  
			// close the Connection
			connection.close();
			System.out.println("Inserted data ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
