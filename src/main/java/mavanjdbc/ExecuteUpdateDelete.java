package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class ExecuteUpdateDelete {

	public static void main(String[] args)throws Exception {

		//1.load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	 	//2.Establish the connection
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

	    // 3. creat a statement
		Statement statement=connection.createStatement();
		
		//4.Execute a Query 

		int values =statement.executeUpdate("delete from User  where id=7 ");
		System.out.println(values);
		
		//Step 5 connection close
		connection.close();
		
		System.out.println("Data Dateted Succesfully with ExecuteUpdate");
		
	}

	}


