package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {
	public static void main(String[] args) {
		//String name="buddha";
		//String address="chabahil";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/kaley";
        String query="create table student(id int, name varchar(50), address varchar(50))";
        //String query="insert into student(id, name, address) values (1,'buddha','jorpati'),(2,'rohan','sankhu'),(3,'astuk','narayantar'),(4,'sulav','chabahi'),(5,'sanjok','kathmandu')";
	//    String query="update student set address=? where name=?";	
	try{
			Connection con= DriverManager.getConnection(url, username, password);
           Statement statement=con.createStatement();
        	statement.execute(query);
	//PreparedStatement smt=con.prepareStatement(query);
			//smt.setString(1,address);
			//smt.setString(2,name);
			//smt.executeUpdate();
			//System.out.println("connected");
	  		//smt.close();
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

}

