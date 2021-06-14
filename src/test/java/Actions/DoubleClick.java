package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public  class DoubleClick extends ActionHandlers{
	

	@Test
	public  void doubleClickk() throws InterruptedException {

		if(Locator=="xpath") {
			WebElement trialaction =	  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		  }
		  else if(Locator=="cssSelector") {
			  WebElement trialaction =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="id") {
			  WebElement trialaction =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  if(Locator=="className") {
			  WebElement trialaction =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="tagName") {
			  WebElement trialaction =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="linkText") {
			  WebElement trialaction =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="name") {
			  WebElement trialaction =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement trialaction =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
}}
