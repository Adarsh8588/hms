package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.Query;
import com.mysql.cj.jdbc.Driver;

public class WriteTheDataToDataBase {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","root");
		Statement stat = con.createStatement();
		String query="insert into HMS values('adarsh','253898','arkalgud')";
		int result=stat.executeUpdate(query);
			con.close();
	}

}
