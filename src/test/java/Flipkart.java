import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {

	@Test
	public void Flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).click();
		List<WebElement> ele = driver.findElements(By.xpath(".//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
		for(WebElement x:ele) {
			String str = x.getText();
			System.out.println(str);
		}
		
	}
}
