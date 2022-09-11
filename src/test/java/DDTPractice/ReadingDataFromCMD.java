package DDTPractice;

import org.testng.annotations.Test;

public class ReadingDataFromCMD {
	@Test
	public void readingdataFromCMDTest() {
		
		String url = System.getProperty("url");
		String un = System.getProperty("username");
		String pwd=System.getProperty("password");
		
		System.out.println("URL IS"+url);
		System.out.println("USERNAME IS"+un);
		System.out.println("PASSWORD IS"+pwd);
	}

}
