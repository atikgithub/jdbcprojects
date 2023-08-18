package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestBatch {

	public static void main(String[] args) throws SQLException {
		  List<User>list = new ArrayList<User>();
		  User user = new User();
		  user.setId(7);
		  user.setName("amsss");
		  user.setPhone(9876543222l);
		  
		  User user1 = new User();
		  user1.setId(8);
		  user1.setName("ssss");
		  user1.setPhone(9843543232l);
		  
		  User user2 = new User();
		  user2.setId(9);
		  user2.setName("aaaa");
		  user2.setPhone(9822222222l);
		  
		  list.add(user);
		  list.add(user1);
		  list.add(user2);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first", "root","root");
			PreparedStatement preparedStatement =connection.prepareStatement("insert into user values(?,?,?)");
			for(User u :list) {
				preparedStatement.setInt(1,u.getId());
				preparedStatement.setString(2,u.getName());
				preparedStatement.setLong(3,u.getPhone());
			    preparedStatement.addBatch();
			}
		    preparedStatement.executeBatch();
		     connection.close();
		     System.out.println("save data");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
