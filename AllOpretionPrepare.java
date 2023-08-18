package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AllOpretionPrepare {
public static void main(String[] args) {
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_first","root","root");
		 //PreparedStatement preparedStatement=connection.prepareStatement("create table jdbc_first.customer(id int,name varchar(40),phone long,address varchar(40))");
		  //--------------------------------------------------------------------------------------
		 //Insert Data
//		     PreparedStatement preparedStatement=connection.prepareStatement("insert into customer values(?,?,?,?)");
//			 preparedStatement.setInt(1, 3); preparedStatement.setString(2,"annu ahmad");
//			 preparedStatement.setLong(3,96874111); preparedStatement.setString(4,"Mp");
			 
		   //----------------------------------------------------------------------------
		   // Update Data
//		   PreparedStatement preparedStatement =connection.prepareStatement("update customer set name='ass' where id=?");
//		   preparedStatement.setInt(1,2);
		 //----------------------------------------------------------------------------------
		 //Delete date 
		// PreparedStatement preparedStatement =connection.prepareStatement("delete from user where id=?");
		// preparedStatement.setInt(1,3);
		 PreparedStatement preparedStatement= connection.prepareStatement("select * from customer");
		// boolean res =preparedStatement.execute();
		 ResultSet r =preparedStatement.executeQuery();
		 while(r.next()) {
			 System.out.println(r.getInt(1)+" | "+r.getString(2)+" | "+r.getInt(3)+" | "+r.getString(4));  
		 }
		 System.out.println("-----------------------------------------------------------");
		 connection.close();
		 System.out.println("Retrived data ");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
