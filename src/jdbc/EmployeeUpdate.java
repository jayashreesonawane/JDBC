package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUpdate{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		
		Statement statement= connection.createStatement();
		
		int count = statement.executeUpdate("UPDATE EMPLOYEE SET NAME='RUTUJA', ADDRESS='PUNE' WHERE id='5'");
		
		if (count!=0) 
		{
			System.out.println("Data Inserted");
		} 
		else 
		{
			System.out.println("Data Not Inserted");
		}
		
	// 5. Close connection
		
		connection.close();
	}

}
