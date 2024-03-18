package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {	
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		Statement statement=connection.createStatement();

		statement.execute("delete from user  where id=8");
		
		connection.close();
		
		System.out.println("data deleted successfully");
	}

}
