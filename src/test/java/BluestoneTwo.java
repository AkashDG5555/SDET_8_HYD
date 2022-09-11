

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BluestoneTwo {

	@Test
	public void Blustone_DiamondTwo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement ring = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ring).perform();
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement ele2:ele) {
			System.out.println(ele2.getText());
		}
		WebElement price = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		act.moveToElement(price).perform();
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		 List<WebElement> ele3 = driver.findElements(By.cssSelector("span[class='new-price']"));
		for (WebElement ele4:ele3) {
			System.out.println(ele4.getText());
		}
		for (int i=0;i<ele3.size();i++)
		{
			if (ele.equals(ele3)) {
				
			System.out.println("Prices are Same");
		}
		else
		{
			System.out.println("Prices are not same after Comparing");
		}
			
	}
}
}
