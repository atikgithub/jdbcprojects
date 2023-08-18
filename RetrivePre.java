package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class RetrivePre {

	public static void main(String[] args) {
		 try {
				DriverManager.registerDriver(new Driver());
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first? user=root & password=root");
				PreparedStatement preparedStatement =connection.prepareStatement("select * from user");
				//preparedStatement.setInt(1,2);
				
				boolean res =preparedStatement.execute();
				connection.close();
				System.out.println("update data");
				System.out.println(res);
			} catch (SQLException e) {
			    
				e.printStackTrace();
			}
	}

}
