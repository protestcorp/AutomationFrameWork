package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends ActionHandlers {


	@Test
	public void hoverAction() throws InterruptedException {

		if(Locator=="xpath") {
			WebElement ele =   driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		  }
		  else if(Locator=="cssSelector") {
			  WebElement ele =   driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="id") {
			  WebElement ele =   driver.findElement(By.id(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  if(Locator=="className") {
			  WebElement ele =   driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="tagName") {
			  WebElement ele =   driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="linkText") {
			  WebElement ele =   driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="name") {
			  WebElement ele =   driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement ele =   driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				Thread.sleep(3000);
		  }}
}
