package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Button  extends ActionUtilities{

	WebDriver driver;
	String Locator;
	String Address;
	public void clickOnButton() throws Exception {
		click();
		
	}
	public void doubleClickOnButton() throws Exception {
		doubleClick();
		}
	
	public void hoverOnButton() throws Exception {
		hover();
	}
		
		public void contextClickOnButton() throws Exception {
			contextClick();
		}
			public void clickAndHoldOnButton() throws Exception {
				clickAndHold();
		}
			public void verifyTextOnButton() throws Exception {
				textVerify();
				
			}
			public void newTabOnButton() throws Exception {
				newTab();
			}
	}
	/*
	@Test
	public void clickOnButton() {
	
		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address)).click();

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address)).click();

		} else if (Locator == "id") {
			driver.findElement(By.id(Address)).click();

		} else if (Locator == "className") {
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

	public static void on(WebDriver driver, String Locator, String Address) {
		
		switch (Locator) {
	case "xpath": 
			try {
				WebDriverWait wait = new WebDriverWait(driver, 5);
				WebElement trialaction = driver.findElement(By.xpath(Address));
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));
				Actions action = new Actions(driver);
				action.doubleClick(element).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		}
	}

	@Test
	public void doubleClickOnButton() throws InterruptedException {

		if (Locator == "xpath") {
			WebElement trialaction = driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "cssSelector") {
			WebElement trialaction = driver.findElement(By.cssSelector(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "id") {
			WebElement trialaction = driver.findElement(By.id(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "className") {
			WebElement trialaction = driver.findElement(By.className(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "tagName") {
			WebElement trialaction = driver.findElement(By.tagName(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "linkText") {
			WebElement trialaction = driver.findElement(By.linkText(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "name") {
			WebElement trialaction = driver.findElement(By.name(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		} else if (Locator == "partialLinkText") {
			WebElement trialaction = driver.findElement(By.partialLinkText(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		}
	}

	@Test
	public void hoverOnButton() throws InterruptedException {

		if (Locator == "xpath") {
			WebElement ele = driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "cssSelector") {
			WebElement ele = driver.findElement(By.cssSelector(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "id") {
			WebElement ele = driver.findElement(By.id(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "className") {
			WebElement ele = driver.findElement(By.className(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "tagName") {
			WebElement ele = driver.findElement(By.tagName(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "linkText") {
			WebElement ele = driver.findElement(By.linkText(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "name") {
			WebElement ele = driver.findElement(By.name(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		} else if (Locator == "partialLinkText") {
			WebElement ele = driver.findElement(By.partialLinkText(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
		}
	}

	@Test
	public void contextClickOnButton() {

		if (Locator == "xpath") {
			WebElement element = driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "cssSelector") {
			WebElement element = driver.findElement(By.cssSelector(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "id") {
			WebElement element = driver.findElement(By.id(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "className") {
			WebElement element = driver.findElement(By.className(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "tagName") {
			WebElement element = driver.findElement(By.tagName(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "linkText") {
			WebElement element = driver.findElement(By.linkText(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "name") {
			WebElement element = driver.findElement(By.name(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} else if (Locator == "partialLinkText") {
			WebElement element = driver.findElement(By.partialLinkText(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		}
	}

	@Test
	public void clickAndHold() throws InterruptedException {

		if (Locator == "xpath") {
			WebElement titleC = driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "cssSelector") {
			WebElement titleC = driver.findElement(By.cssSelector(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "id") {
			WebElement titleC = driver.findElement(By.id(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "className") {
			WebElement titleC = driver.findElement(By.className(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "tagName") {
			WebElement titleC = driver.findElement(By.tagName(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "linkText") {
			WebElement titleC = driver.findElement(By.linkText(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "name") {
			WebElement titleC = driver.findElement(By.name(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		} else if (Locator == "partialLinkText") {
			WebElement titleC = driver.findElement(By.partialLinkText(Address));
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(titleC);
			Thread.sleep(3000);
			action.clickAndHold().perform();
		}
	}

	@Test
	public void verifyTextOnButton() {

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
	public void newTabOnButton() {
		// New tab

		if (Locator == "xpath") {
			WebElement ele = driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "cssSelector") {
			WebElement ele = driver.findElement(By.cssSelector(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "id") {
			WebElement ele = driver.findElement(By.id(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "className") {
			WebElement ele = driver.findElement(By.className(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "tagName") {
			WebElement ele = driver.findElement(By.tagName(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "linkText") {
			WebElement ele = driver.findElement(By.linkText(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "name") {
			WebElement ele = driver.findElement(By.name(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		} else if (Locator == "partialLinkText") {
			WebElement ele = driver.findElement(By.partialLinkText(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		}
	}
}
*/