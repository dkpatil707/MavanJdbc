package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementSelect {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

		PreparedStatement preparedStatement=connection.prepareStatement("Select * from User where id=?");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plase enter id to be seleted");
		int id= scanner.nextInt();
		
		preparedStatement.setInt(1,id);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString("address"));

		}
		connection.close();
		System.out.println("Data seleted successfully");

	}

}
