package mavanjdbc;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class CollableStatementSelect {

	public static void main(String[] args) throws Exception {

		System.out.println("plase enter your id");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		CallableStatement callablestatement=connection.prepareCall("call selectUser(?)");
		callablestatement.setInt(1, id);
		
		ResultSet resultSet=callablestatement.executeQuery();
		while(resultSet.next()) {
			
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));

			
		}
		

		
	}

}
