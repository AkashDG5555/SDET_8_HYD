import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iphone_price_Comparison {

	@Test
	public void FlipkardIphonePrice() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone 13");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		Set<String> win_id = driver.getWindowHandles();
		for(String id:win_id) {
			String win_title = driver.switchTo().window(id).getTitle();
			if(win_title.contains("iphone-13-midnight-128-gb")) 
			{
				driver.switchTo().window(win_title);
			}
		}
		String fprice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		
//		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();
		Set<String> awin_id = driver.getWindowHandles();
		for(String aid:awin_id)
		{
			String awin_title = driver.switchTo().window(aid).getTitle();
			if(awin_title.contains("Apple-iPhone-13-128GB-Midnigh")) {
				driver.switchTo().window(awin_title);
			}
			
		}
		String aprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		
		String fp = fprice.replaceAll("[^0-9]", "");
		String ap = aprice.replaceAll("[^0-9]", "");
		int f = Integer.parseInt(fp);
		int a = Integer.parseInt(ap);
		if(f>a)
		{
			System.out.println("More price :"+fprice);
		}
		else {
			System.out.println("less price :"+aprice);
		}
	}
	
}
