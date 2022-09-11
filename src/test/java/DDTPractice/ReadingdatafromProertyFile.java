package DDTPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingdatafromProertyFile {
	
	@Test
	public void readDataFromProperty_test() throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata.properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String UN= p.getProperty("username");
		String PWD=p.getProperty("password") ;
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}

}
