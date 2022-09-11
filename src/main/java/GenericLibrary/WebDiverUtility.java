package GenericLibrary;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class WebDiverUtility {
	private CharSequence PartialWinowText;
	// this method is for Maximizing the window

	public void maximixeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
}
	
	// this method is for Implicit wait
	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// this method is for Explicit wait
	
	public void waitForVisibilityOfElement(WebDriver driver, WebElement ele)
	{
		WebDriverWait wb=new WebDriverWait(driver,30);
		wb.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	// this method is used for handling DropDown
	
	public void SelectingByIndex(WebElement ele, int index)
	{
		Select se =new Select(ele);
		se.selectByIndex(index);
		
		
	}
	
	public void SelectingByValue(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	
	public void SelectingByVisible(WebElement ele, String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	//this method is for Mouse Actions
	
	public void mouseoverAction(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void mouseDobleClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele);
	}
	
	public void rightclickmouse(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele);
	}
	
	public void HandalingFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchingwindow(WebDriver driver, String PartialwindowText)
	{
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext())
		{
			String winid = it.next();
		String title = driver.switchTo().window(winid).getTitle();
		if(title.contains(PartialwindowText))
		{
			break;
			}
		}
	}
	/**
	 * @author Akash
	 * @throws Throwable
	 */
	
	public void handalingEnterButton() throws Throwable
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void takingScreenshot(WebDriver driver) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		java.io.File src = ts.getScreenshotAs(OutputType.FILE);
		java.io.File dest=new java.io.File("./screenshot");
		FileUtils.copyFile(src, dest);
	}
	
	/**
	 * this method is for sroll by using java script
	 * @author Akash
	 * @param driver
	 */
		
		public void scrollhandle(WebDriver driver) {
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("windows.ScrollBy(x,y)");
		
		
	}
		
		public void selectdatebyJS(WebDriver driver, WebElement element,String dateval) {
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].setAttribute('value',"+dateval+"');", element);
			
		}
	
}