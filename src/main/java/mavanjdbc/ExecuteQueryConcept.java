package mavanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQueryConcept {
	
	public static void main(String [] args) throws Exception {

//		//1.load and Register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	 	//2.Establish the connection
//        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
//
//	    // 3. creat a statement
//		Statement statement=connection.createStatement();
//		
//		//4.Execute a Query 
//		//ResultSet value=statement.execute("Select * from User");
//
//		ResultSet resultset=statement.executeQuery("insert into User values(7,'poo' , 'abc')");
//		//System.out.println(result);
		
		//-----------RESULT AS EXPECTION --------------------insert--------------
//		
//	
//		
//	
//		//5.Close the Connection
//		connection.close();
//	    System.out.println("Data fetched succesfully");
		
//		---------------------------------------------------------------

//		//1.load and Register the driver
//				Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			 	//2.Establish the connection
//		        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");
//
//			    // 3. creat a statement
//				Statement statement=connection.createStatement();
//				
//				//4.Execute a Query 
//				//ResultSet value=statement.execute("Select * from User");
//
//				ResultSet resultset=statement.executeQuery("Update User set name='om' where id=3");
//				//System.out.println(result);
//				
//			//----------------Get A Exception-------update-------------------
//				
//			
//				//5.Close the Connection
//				connection.close();
//			    System.out.println("Data fetched succesfully");
//==--------------------------------------------------------------------------------------------------------------------
		//1.load and Register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			 	//2.Establish the connection
		        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sql1234");

			    // 3. creat a statement
				Statement statement=connection.createStatement();
				
				//4.Execute a Query 
				//ResultSet value=statement.execute("Select * from User");

				ResultSet resultset=statement.executeQuery("Delete from User where id=19 ");
				//System.out.println(result);
				
			//Get A Exeseption---------------delete-------------------
				
			
				//5.Close the Connection
				connection.close();
			    System.out.println("Data fetched succesfully");

	}

}
