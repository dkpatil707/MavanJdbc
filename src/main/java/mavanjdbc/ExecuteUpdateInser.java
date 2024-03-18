package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateInser {

	public static void main(String[] args) throws Exception {
		//1.load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	 	//2.Establish the connection
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

	    // 3. creat a statement
		Statement statement=connection.createStatement();
		
		//4.Execute a Query 
		//ResultSet value=statement.execute("Select * from User");

		int values =statement.executeUpdate("insert into User values(175,'Tina','Jalgaon')");
		System.out.println(values);
		
		connection.close();
		
		System.out.println("Data insert Succesfully with ExecuteUpdate");
		
	}

}
