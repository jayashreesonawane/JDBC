package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
	// 1. load or register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	// 2. Establish Connection
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		
	// 3. Create Statements
		
		Statement statement= connection.createStatement();
		
	// 4. Execute statement
		
		int count = statement.executeUpdate("INSERT INTO EMPLOYEE VALUES(4,'HRITIKA',80000,9876065431,'THANE'),(5,'HRITIK',70000,9879564213,'BHVANDI')");
		
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
