package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class loadAndRegsitterDriverConcept {

	public static void main(String[] args) throws Exception {

		//a.load the Driver
		Driver driver=new Driver();
		
		//b/Register the Driver
		DriverManager.registerDriver(driver);
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
		Statement statement=connection.createStatement();
    	statement.execute("insert into User Values(99,'Sakshi','Maharashtra')");
		connection.close();
		System.out.println("Data insert sussysfully with load and registering the driver explicitily ");
		
	}

}
