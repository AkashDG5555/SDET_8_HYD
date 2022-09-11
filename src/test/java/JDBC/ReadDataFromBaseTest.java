package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromBaseTest {
	@Test

	public void ReadDataFromdatabase() throws SQLException {
		Connection con = null;
		try {
			Driver dref= new Driver();
			
			DriverManager.registerDriver(dref);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			Statement stmt = con.createStatement();
			
			ResultSet result = stmt.executeQuery("select * from students_inf;");
			
			while(result.next())
			{
				System.out.println(result.getString(1)+  " "+result.getString(2)+ " "+result.getString(3)+" "+result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			System.out.println("occured exception but closed the connection");
		con.close();
		
	}

	
}
}
