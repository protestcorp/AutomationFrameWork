package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste extends ActionHandlers {

	@Test
	public void copyPaste() {
		// Copy and paste any info
		String source = null ;
		 String destination = null;
		if(Locator=="xpath") {
			WebElement sourcetext = driver.findElement(By.xpath(source));
			WebElement destinationtext = driver.findElement(By.xpath(destination));
			Actions action = new Actions(driver);
			action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
			action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement sourcetext =   driver.findElement(By.cssSelector(source));
			  WebElement destinationtext =   driver.findElement(By.cssSelector(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement sourcetext =   driver.findElement(By.id(source));
			  WebElement destinationtext =   driver.findElement(By.id(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  if(Locator=="className") {
			  WebElement sourcetext =   driver.findElement(By.className(source));
			  WebElement destinationtext =   driver.findElement(By.className(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement sourcetext =   driver.findElement(By.tagName(source));
			  WebElement destinationtext =   driver.findElement(By.tagName(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement sourcetext =   driver.findElement(By.linkText(source));
			  WebElement destinationtext =   driver.findElement(By.linkText(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="name") {
			  WebElement sourcetext =   driver.findElement(By.name(source));
			  WebElement destinationtext =   driver.findElement(By.name(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement sourcetext =   driver.findElement(By.partialLinkText(source));
			  WebElement destinationtext =   driver.findElement(By.partialLinkText(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
}
}