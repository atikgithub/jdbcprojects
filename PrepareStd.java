package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class PrepareStd {

	public static void main(String[] args) {
		 try {
				DriverManager.registerDriver(new Driver());
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first? user=root & password=root");
				PreparedStatement preparedStatement =connection.prepareStatement("insert into user values(?,?,?)");
				preparedStatement.setInt(1,3);
				preparedStatement.setString(2,"Durgesh");
				preparedStatement.setLong(3,898978);
				boolean res =preparedStatement.execute();
				connection.close();
				System.out.println("saved the data");
				System.out.println(res);
			} catch (SQLException e) {
			    
				e.printStackTrace();
			}
	}

}
