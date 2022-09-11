package DDTPractice;

import javax.xml.stream.events.XMLEvent;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXMLFile {
	@Test
	public void readDataFromXMLFile(XmlTest xml)
	{
		String url=xml.getParameter("URL");
		System.out.println(url);
		
	}

}
