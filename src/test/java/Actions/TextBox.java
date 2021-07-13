package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TextBox extends ActionUtilities {

	WebDriver driver;
	String selector;
	String Address;

	public void clickOnTextBox() throws Exception {
		click(selector, Address);
	}
	public void clearOnTextBox() throws Exception {
		clear(selector, Address);
	}
		public void verifyTextOnTextBox() throws Exception {
			textVerify(selector, Address);
	}
		public void copyPasteOnTextBox() throws Exception {
		//	copyPaste(selector, Address);
		}
	public void autoSuggestOnTextBox() throws Exception  {
		autoSuggetion(selector, Address);
	}
		}
	/*
	@Test
	public void clickOnTextBox() {

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
	public void clearOnTextBox() {

		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address)).clear();

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address)).clear();

		} else if (Locator == "id") {
			driver.findElement(By.id(Address)).clear();

		}
		if (Locator == "className") {
			driver.findElement(By.className(Address)).clear();

		} else if (Locator == "tagName") {
			driver.findElement(By.tagName(Address)).clear();
			;

		} else if (Locator == "linkText") {
			driver.findElement(By.linkText(Address)).clear();

		} else if (Locator == "name") {
			driver.findElement(By.name(Address)).clear();

		} else if (Locator == "partialLinkText") {
			driver.findElement(By.partialLinkText(Address)).clear();
		}
	}
	@Test
	public void verifyTextOnTextBox() {
		
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
	@Test
	public void copyPasteOnTextBox() {
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
*/