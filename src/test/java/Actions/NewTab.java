package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import StepDefinitions.StepDefnition;

public class NewTab extends ActionHandlers{  
	String Locator = null;
	String Address = null;

	@Test
	public void newTab() 
	{
		// New tab
		
		if(Locator=="xpath") {
			
		    try{
		        WebDriverWait wait = new WebDriverWait(driver, 5);
		        WebElement ele =  driver.findElement(By.xpath(Address));
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		    Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		    }
		    catch(Exception e)
		    {
		    Assert.assertTrue(false);
		    }
		    }
		
			
			
		  }
		  else if(Locator=="cssSelector") {
			  WebElement ele =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement ele = driver.findElement(By.id(Address));
			  System.out.println("qwertyuio");
				Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  if(Locator=="className") {
			  WebElement ele =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement ele =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement ele =	  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="name") {
			  WebElement ele =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement ele =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }

	}
}
