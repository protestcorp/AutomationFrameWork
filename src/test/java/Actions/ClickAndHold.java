package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold extends ActionHandlers {


	@Test
	public void clickAndHold()throws InterruptedException {
	
		if(Locator=="xpath") {
			WebElement titleC =  driver.findElement(By.xpath(Address));
			 Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="cssSelector") {
			  WebElement titleC =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="id") {
			  WebElement titleC =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  if(Locator=="className") {
			  WebElement titleC =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="tagName") {
			  WebElement titleC =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="linkText") {
			  WebElement titleC =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="name") {
			  WebElement titleC =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement titleC =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }}
}
