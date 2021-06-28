package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Link {
	WebDriver driver;
	String Locator;
	String Address;

	@Test
	public void clickOnLink() {

		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address)).click();

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address)).click();

		} else if (Locator == "id") {
			driver.findElement(By.id(Address)).click();

		}
		if (Locator == "className") {
			driver.findElement(By.className(Address)).click();

		} else if (Locator == "tagName") {
			driver.findElement(By.tagName(Address)).click();
			;

		} else if (Locator == "linkText") {
			driver.findElement(By.linkText(Address)).click();

		} else if (Locator == "name") {
			driver.findElement(By.name(Address)).click();

		} else if (Locator == "partialLinkText") {
			driver.findElement(By.partialLinkText(Address)).click();
		}
	}
	@Test
	public void newTabOnLink() {
		// New tab
		
		if(Locator=="xpath") {
			WebElement ele =  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement ele =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement ele = driver.findElement(By.id(Address));
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
	@Test
	public void copyPasteOnLink() {
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
	@Test
	public void linkVerify() {
		
		String Expected = null;
		
		WebElement element = driver.findElement(By.xpath(Address));

		String text = element.getText();

		System.out.println("Text obtained is" + text);

		if (text.contains(Expected)) {
			System.out.println("Expected text is obtained");
		} else {

			System.out.println("Expected text is not obtained");

		}
		}
}
