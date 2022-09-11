package DDTPractice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Practice_xml {
	@Test
	public void readDataFromXml(XmlTest xml ) {
		String UN=xml.getParameter("USERNAME");
		System.out.println(UN);
	}
	

}
