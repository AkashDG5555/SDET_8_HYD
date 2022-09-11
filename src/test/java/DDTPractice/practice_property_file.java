package DDTPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class practice_property_file {
	@Test
	public void read_practice_property_test () throws Throwable {
		
		FileInputStream fis =new FileInputStream("./testdata.properties");
		
		Properties pobj= new Properties();
		
		pobj.load(fis);
		
		String URL= pobj.getProperty("url");
		String UN= pobj.getProperty("username");
		String PWD=pobj.getProperty("password") ;
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		
		
		
	}
	

}
