package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatement_save {
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		Scanner scanner = new Scanner (System.in);
		System.out.print("plases enter mobile Company");
		String Company = scanner.next();
		
		
		System.out.print("plases enter mobile Model");
		String name = scanner.next();

		
		PreparedStatement prepareStatement =connection.prepareStatement("inser into User values(?,?)") ;
		prepareStatement.setString(1, Company);
		prepareStatement.setString(2,name);
		
		prepareStatement.execute();
		
		connection.close();
		
		System.out.println("Mobile data save Successfully");
		
	}

}
