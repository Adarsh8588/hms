package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadTheDataFomDataBase {

	
	public static void main(String[] args) throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","root");
		Statement stat = conn.createStatement();
		String query = "select * from HMS;";
		ResultSet result = stat.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getString(1)+"   "+result.getString(2)+"   "+result.getString(3));
		}
		conn.close();
	}

	
}
