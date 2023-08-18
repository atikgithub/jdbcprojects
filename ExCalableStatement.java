package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class ExCalableStatement {

	public static void main(String[] args) {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first","root","root");
			
			java.sql.CallableStatement callableStatement =connection.prepareCall("call first_jdbc(?,?,?)");
			callableStatement.setInt(1,6);
			callableStatement.setString(2,"skss");
			callableStatement.setLong(3,98765678765l);
			
			int res = callableStatement.executeUpdate();
			System.out.println("saved data"); 
			System.out.println(res);
			connection.close();
		} 
        catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
        }
	}
}