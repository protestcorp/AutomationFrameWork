package Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Project.FrameWork.Base;

public class MouseAction extends Base{
	WebDriver driver;
	
	@Test
	public void LaunchingBrowser() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
/*	
	@Test
	public void hoverActionn() throws InterruptedException {

		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
	}
	}
	/*
	@Test
	public void doubleClick() throws InterruptedException {

		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		WebElement trialaction = driver.findElement(By.id("nav-global-location-popover-link"));
		Actions action = new Actions(driver);
		action.doubleClick(trialaction).perform();
		Thread.sleep(3000);
	}
	/*
	@Test
	public void dragAndDrop() throws InterruptedException {
	
		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
		WebElement To=driver.findElement(By.xpath("//*[@class='placeholder']"));	  
	//http://demo.guru99.com/test/drag_drop.html
        Actions action=new Actions(driver);					
      
        	Thread.sleep(3000);
        
        action.dragAndDrop(From, To).build().perform();
        Thread.sleep(3000);
	}
	
	@Test
	public void clickAndHold()throws InterruptedException {
	
		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
		//https://selenium08.blogspot.com/2020/01/click-and-hold.html
		   Actions action = new Actions(driver); 
	Thread.sleep(3000);
		   action.moveToElement(titleC);
		   Thread.sleep(3000);
		   action.clickAndHold().perform(); 
	}
	*/
	/*
	@Test
	public void contextClick() {

		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		action.contextClick(element).perform();
	}
	@Test
	public void scrollAction() {

		if(Locator=="xpath") {
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.findElement(By.partialLinkText(Address));
		  }
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
*/
}
