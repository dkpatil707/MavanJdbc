package mavanjdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchExecutionConcept {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		PreparedStatement preparedStatement=connection.prepareStatement("insert into User values (?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Plase enter how many of entries you want to save");
		int entries=scanner.nextInt();
		int i=0;
		while(i<entries) {
			System.out.println("enter id");
			int id=scanner.nextInt();
			
			System.out.println("enter name");
			String name=scanner.next();
			
			System.out.println("enter address");
			String address=scanner.next();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			
			
			preparedStatement.addBatch();
			
			i++;
	}
		preparedStatement.executeBatch();
		
		connection.close();
		
		System.out.println("done with batch execution");
	}
}
