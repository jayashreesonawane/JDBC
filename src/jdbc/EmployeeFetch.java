package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/employeedb";
		
		String user = "root";
		
		String password = "root";
		
		String sql = "SELECT * FROM EMPLOYEE";
		
		Class.forName(className);
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) 
		{
			System.out.println(resultSet.getInt(1));
			
			System.out.println(resultSet.getString("name"));
			
			System.out.println(resultSet.getDouble(3));
			
			System.out.println(resultSet.getLong("phone"));
			
			System.out.println(resultSet.getString(5));
			
			System.out.println("---------------------");
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
