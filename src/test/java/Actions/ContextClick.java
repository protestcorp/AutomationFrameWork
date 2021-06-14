package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick extends ActionHandlers {


	@Test
	public void contextClick() {

		if(Locator=="xpath") {
			WebElement element =  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement element =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="id") {
			  WebElement element =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  if(Locator=="className") {
			  WebElement element =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement element =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement element =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="name") {
			  WebElement element =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement element =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }}
}
