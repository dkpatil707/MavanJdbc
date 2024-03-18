package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionMethod {

	public static void main(String[] args) throws Exception {
		
		//step1 load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 2.Establish the connection  
		//this line diffrent
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Sql1234");
			
	    // step 3. creat a statement
		Statement statement=connection.createStatement();
		
		// step 44.Execute a Query 

		statement.execute("insert into User values(21,'gulshan','indore')");
		
		//step 5 connetion close
		connection.close();
		
		System.out.println("yes data insert successfully by using conncetion method");
	}

}
