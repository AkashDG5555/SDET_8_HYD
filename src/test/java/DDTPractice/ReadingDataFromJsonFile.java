package DDTPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import okio.ByteString;

public class ReadingDataFromJsonFile {
	private static final HashMap String = null;

	@Test
	public void readingDataFromJsonone() throws IOException, ParseException 
	{
		//Step=1 convert Json Files iNTO Json Object
		FileReader fr = new FileReader("./testDataJ.Json");
		
		//step=2 convert Json Object into java object
		JSONParser jp=new JSONParser();
		Object iobj=jp.parse(fr);
		
		HashMap jobj;
		//step=3 Read data using Hashmap
		HashMap hp = (HashMap)iobj;
		String URL= (String) hp.get("url");
		System.out.println(URL);
		
		
	}
	
	

}
