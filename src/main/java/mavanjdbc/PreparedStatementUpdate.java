package mavanjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class PreparedStatementUpdate {

	public static void main(String[] args) throws Exception {

		
		//1.load and Register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establish the connection

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
		
		//3
		
		PreparedStatement preparedStatement=connection.prepareStatement("Update User set name=? where id=?");
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("plase enter your id to be Updated");
		int id=scanner.nextInt();
		
		
		System.out.println("plase enter name be Updated");
		String name=scanner.next();
	
		
		preparedStatement.setString(1,name);
    	preparedStatement.setInt(2,id);


		
		

		preparedStatement.execute();
		connection.close();
		
		System.out.println("Data updated successfully with ps");
		

	}

}
