import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip2 {

	public static void main(String[] args) {
		
		Date d=new Date();
		String str=d.toString();
		String [] s= str.split(" ");
		String day= s[0];
		String month= s[1];
		String date= s[2];
		String year= s[5];
		String current_date=day+" "+month+" "+date+" "+year;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.id("fromCity")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='BLR']")).click();

		driver.findElement(By.id("toCity")).sendKeys("New york");
		driver.findElement(By.xpath("//div[text()='NYC']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='"+current_date+"']")).click();
	}
}
