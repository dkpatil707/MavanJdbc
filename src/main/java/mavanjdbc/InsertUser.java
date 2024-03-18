package mavanjdbc;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertUser {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc")
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		Statement statement=connection.createStatement();
		
		statement.execute("insert into User Values(8,'dar','mumbi')");
		
		connection.close();
		System.out.println("data insert succesfully");
	}

}
