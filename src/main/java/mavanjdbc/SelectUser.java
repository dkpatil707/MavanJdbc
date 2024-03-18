package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectUser {
	public static void main(String [] args)  throws Exception {
		//1.load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	 	//2.Establish the connection
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

	    // 3. creat a statement
		Statement statement=connection.createStatement();
		
		//4.Execute a Query 
		//ResultSet value=statement.execute("Select * from User");

		ResultSet resultset=statement.executeQuery("Select * from User Where id=19");
		//System.out.println(result);
		
	
		while(resultset.next()) {
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getString(3));	
		}

		
	
		//5.Close the Connection
		connection.close();
	    System.out.println("Data fetched succesfully");

		
		
	}
	
		
	}

