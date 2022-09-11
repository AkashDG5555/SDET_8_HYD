import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindColor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String color = driver.findElement(By.xpath("//h2[@class='_8eso']")).getCssValue("color");
		System.out.println(color);
	}
}
