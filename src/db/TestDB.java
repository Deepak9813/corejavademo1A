package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register the driver[load the driver]
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//getConnection(url, username, password)
	Connection con =	DriverManager.getConnection("jdbc:mysql://localhost: 3306/testdb", "root", "");
	
	//============================ insert sql ===================================================
	
//	String sql = "insert into user(username, password) values('Gita', 'gita12345')";
//	Statement stm = con.createStatement();
//	stm.execute(sql);
	
//	con.close();
	
//	System.out.println("Success");
	

	
	
	//============================= delete sql =====================================
	
//	String sql = "delete from user where id = 2";
//	Statement stm = con.createStatement();
//	stm.execute(sql);
//	
//	con.close();
//	
//	System.out.println("Successfully delete");
	
	
	
	
	//============================= update sql=================================================
	
//	String sql = "update user set password = 'test123' where id = 3 ";
//	Statement stm = con.createStatement();
//	stm.execute(sql);
//	
//	con.close();
//	
//	System.out.println("Success");
	
	
	//============================= select sql=================================================
	
	
	String sql = "Select * from user";
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery(sql);
	
	while(rs.next()) {
		System.out.println("id = "+rs.getInt("id"));
		System.out.println("UserName = "+rs.getString("username"));
		System.out.println("Password = "+rs.getString("password"));
		
		System.out.println("======================================");
	}
	
	}

}
