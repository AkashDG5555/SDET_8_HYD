package GenericLibrary;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	/**
	 * author Akash Kumar
	 * @return 
	 */
	
	public static int generateRandomNumber()
	{
		Random r=new Random();
		int random = r.nextInt(2000);
		return random;
}
	public static String datee() {
		Date currentDate= new Date();
		String date=	currentDate.toString();
		System.out.println(date);


		String arr[]=	date.split(" ");
		String date1 =arr[2];
		String month = arr[1];
		String year= arr[5];
		return date1+" "+month+" "+year;

	}
}