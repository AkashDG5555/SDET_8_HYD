import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Test
	public void makemytrip() {



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

		for (int i=0;i<12;i++) {

			try {
				driver.findElement(By.xpath("//div[@aria-label='Fri Feb 03 2023']")).click();
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
	}


}

