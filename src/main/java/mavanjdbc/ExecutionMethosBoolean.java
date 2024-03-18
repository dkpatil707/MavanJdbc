package mavanjdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecutionMethosBoolean {
	public static void main(String [] args) throws Exception {
            
		//----------------Insert query--------------------------------
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
//
//		Statement statement=connection.createStatement();
//		
//	    boolean value= statement.execute("insert into User Values(10,'dar','mumbai')");
//	    System.out.println(value); //========flase values
//
//	
//		
//		connection.close();
//		
//		System.out.println("data insert succesfully");
//		
		
	//	---------------------------Update Query-------------------------------------------

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
//	
//		Statement statement=connection.createStatement();
//
//		
//	boolean values=statement.execute("Update user set address='Bharat' where id=7");
//	System.out.println(values); //==========flase values
//
//		connection.close();
//		System.out.println("Data update Successfully");
//		
		
		//-----------------------------------Deleted query ------------------------------------------
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		Statement statement=connection.createStatement();

		boolean values=statement.execute("delete from user  where id=6");
		System.out.println(values);

		
		connection.close();
		
		System.out.println("data deleted successfully");
		
	}
}
