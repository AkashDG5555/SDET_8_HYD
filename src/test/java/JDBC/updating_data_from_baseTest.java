package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class updating_data_from_baseTest {
	
	
@Test
	public void updating_data_from_base() throws SQLException {
		Connection con = null;
		try {
			
			Driver dref= new Driver();
			
			DriverManager.registerDriver(dref);
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			
			Statement stmt = con.createStatement();
			
			int result = stmt.executeUpdate("insert into students_info(regno,firstname,middlename,lastname)values(6,'bhim','kumar','gowda')");
			
			if (result==1) 
			{
				System.out.println("Data is inserted");
			
				
			}
			else {
				System.out.println("Data not added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Connection is closed");
			
			con.close();
			
	}

}
}