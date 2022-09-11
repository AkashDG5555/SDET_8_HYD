import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tool_tip {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		 List<WebElement> list = driver.findElements(By.xpath("//nav[@class='topNav_bar is-no-scroll']/ul[@class='display-flex']/li/a"));
		for (int i = 0; i < list.size(); i++) 
		{
			String attribute = list.get(i).getAttribute("title");
			System.out.println(attribute);
		}

	}

}
