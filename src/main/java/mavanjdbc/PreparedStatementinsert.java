package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;




public class PreparedStatementinsert{

	public static void main(String[] args) throws Exception {
		
		
		
		//1.load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establish the connection
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		Scanner scanner = new Scanner (System.in);
		System.out.print("please enter your id");
		int id = scanner.nextInt();
		
		System.out.print("please enter your name");
		String name=scanner.next();
		
		System.out.print("please enter your address");
		String address=scanner.next();

		

//		//3. creat a statement
		
		PreparedStatement prepareStatement =connection.prepareStatement("insert into User values(?,?,?)") ;
		prepareStatement.setInt(1, id);
	    prepareStatement.setString(2,name);
	    prepareStatement.setString(3,address);
		
	    prepareStatement.execute();
	
		connection.close();
		
		System.out.print("data insert successfully with PS");
		
		


	}

	
}