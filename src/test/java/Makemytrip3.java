import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makemytrip3 {
	
  @Test(dataProvider="provideMeData")
	public void Makemytrip3(String src, String dest) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.id("fromCity")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();

		driver.findElement(By.id("toCity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Fri Sep 16 2022']")).click();

		
		
	}
  
  @DataProvider
  
	public Object[][]provideMeData() {
		
		Object [][] obj=new Object[3][2];
		
		obj [0][0]="BKK";
		obj [0][1]="BLR";
		
		obj [1][0]="NYC";
		obj [1][1]="BOM";
		
		obj [2][0]="LON";
		obj [2][1]="PNQ";
		return obj;

}
}
