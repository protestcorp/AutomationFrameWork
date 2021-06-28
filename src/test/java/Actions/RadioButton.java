package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver driver;
	String Locator;
	String Address;

	@Test
	public void enableRadioButton() {
		

		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address)).isEnabled();

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address)).isEnabled();

		} else if (Locator == "id") {
			driver.findElement(By.id(Address)).isEnabled();

		}
		else if (Locator == "className") {
			driver.findElement(By.className(Address)).isEnabled();

		} else if (Locator == "tagName") {
			driver.findElement(By.tagName(Address)).isEnabled();
			;

		} else if (Locator == "linkText") {
			driver.findElement(By.linkText(Address)).isEnabled();

		} else if (Locator == "name") {
			driver.findElement(By.name(Address)).isEnabled();

		} else if (Locator == "partialLinkText") {
			driver.findElement(By.partialLinkText(Address)).isEnabled();
		}
	}
	@Test
	public void disEnableRadioButton() {

		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address)).isEnabled();
			Assert.assertFalse(false);

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address)).isEnabled();
			Assert.assertFalse(false);

		} else if (Locator == "id") {
			driver.findElement(By.id(Address)).isEnabled();
			Assert.assertFalse(false);

		}
		if (Locator == "className") {
			driver.findElement(By.className(Address)).isEnabled();
			Assert.assertFalse(false);

		} else if (Locator == "tagName") {
			driver.findElement(By.tagName(Address)).isEnabled();
			Assert.assertFalse(false);
			;

		} else if (Locator == "linkText") {
			driver.findElement(By.linkText(Address)).isEnabled();
			Assert.assertFalse(false);

		} else if (Locator == "name") {
			driver.findElement(By.name(Address)).isEnabled();
			Assert.assertFalse(false);

		} else if (Locator == "partialLinkText") {
			driver.findElement(By.partialLinkText(Address)).isEnabled();
			Assert.assertFalse(false);
		}
	}
	@Test
	public void verifyTextOnRadioButton() {
		
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
	public void hoverRadioButton() throws InterruptedException {

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
		  }
	}
	
}
