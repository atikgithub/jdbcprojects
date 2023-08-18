package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DeletePre {

	public static void main(String[] args) {
		 try {
				DriverManager.registerDriver(new Driver());
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first? user=root & password=root");
				PreparedStatement preparedStatement =connection.prepareStatement("delete from user where id=?");
				preparedStatement.setInt(1,3);
				
				boolean res =preparedStatement.execute();
				connection.close();
				System.out.println("Deleted data");
				System.out.println(res);
			} catch (SQLException e) {
			    
				e.printStackTrace();
			}
	}

}
