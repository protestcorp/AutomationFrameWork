package Actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import CucumberOptionsss.DataXMLHandler;
import Project.FrameWork.Base;

public class ActionUtilities  extends Base{
	protected WebDriver driver;
	WebElement Locator;
//	String Address;
//	String selector = null;
	WebElement element;

	@Test
	public WebElement newTab(String selector, String Address) throws Exception {
	  
	
		// New tab
		WebElement ele;

		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		

		switch (selector) {
		case "xpath":
			try {

				ele = driver.findElement(By.xpath(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}

			break;
		case "cssSelector":
			try {

				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}

			break;
		case "id":
			try {

				ele = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}

			break;
		case "className":

			try {
				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {
				ele = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {
				ele = driver.findElement(By.linkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {
				ele = driver.findElement(By.name(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {
				ele = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}

		return Locator;
	}
	/*
	 * 
	 * WebElement ele = driver.findElement(By.id("nav-link-accountList")); Actions
	 * action = new Actions(driver);
	 * action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).
	 * build().perform();
	 */

	@Test
	public WebElement copyPaste(String selector, String source,String destination ) throws Exception {
		// Copy and paste any info
	//	String source = null;
	//	String destination = null;
		WebElement sourcetext;
		WebElement destinationtext;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		WebElement Source;
		WebElement Destination;

		switch (selector) {
		case "id":
			try {
				sourcetext = driver.findElement(By.id(source));
				destinationtext = driver.findElement(By.id(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "xpath":

			try {
				sourcetext = driver.findElement(By.xpath(source));
				destinationtext = driver.findElement(By.xpath(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {
				sourcetext = driver.findElement(By.className(source));
				destinationtext = driver.findElement(By.className(destination));
				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {

				sourcetext = driver.findElement(By.cssSelector(source));
				destinationtext = driver.findElement(By.cssSelector(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {
				sourcetext = driver.findElement(By.tagName(source));
				destinationtext = driver.findElement(By.tagName(destination));
				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {
				sourcetext = driver.findElement(By.linkText(source));
				destinationtext = driver.findElement(By.linkText(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {
				sourcetext = driver.findElement(By.name(source));
				destinationtext = driver.findElement(By.name(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {
				sourcetext = driver.findElement(By.partialLinkText(source));
				destinationtext = driver.findElement(By.partialLinkText(destination));

				Source = wait.until(ExpectedConditions.elementToBeClickable(sourcetext));
				Destination = wait.until(ExpectedConditions.elementToBeClickable(destinationtext));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return Locator;
	}

	/*
	 * WebElement sourcetext = driver.findElement(By.xpath("<>")); WebElement
	 * destinationtext = driver.findElement(By.xpath("<>")); Actions action = new
	 * Actions(driver); action.keyDown(sourcetext,
	 * Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
	 * action.keyDown(destinationtext,
	 * Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
	 */
	//
	/*
	@Test
	public String upperCase() throws Exception {
		// write text's in CAP's
		String sendkeys = null;
		WebElement ele;

		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 2);

		switch (selector) {
		case "xpath":

			try {

				ele = driver.findElement(By.xpath(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {

				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				ele = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				ele = driver.findElement(By.className(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {
				ele = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {
				ele = driver.findElement(By.linkText(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {
				ele = driver.findElement(By.name(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {
				ele = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys(sendkeys).build().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return Locator;
	}
	/*
	 * WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	 * 
	 * Actions action = new Actions(driver); action.moveToElement(ele).
	 * click().keyDown(Keys.SHIFT).sendKeys("protest"). build().perform();
	 */

	@Test
	public void hover(String selector, String Address) throws Exception {

		WebElement ele;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 2);

		switch (selector) {
		case "xpath":

			try {

				ele = driver.findElement(By.xpath(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {
				ele = driver.findElement(By.cssSelector(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				ele = driver.findElement(By.id(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				ele = driver.findElement(By.className(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {

				ele = driver.findElement(By.tagName(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {

				ele = driver.findElement(By.linkText(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {

				ele = driver.findElement(By.name(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {

				ele = driver.findElement(By.partialLinkText(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}

	}
	/*
	 * WebElement ele = driver.findElement(By.id("nav-link-accountList")); Actions
	 * action = new Actions(driver); action.moveToElement(ele).perform();
	 * Thread.sleep(3000);
	 */

	@Test
	public WebElement doubleClick(String selector, String Address) throws Exception {
		WebElement trialaction;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 2);

		switch (selector) {
		case "xpath":

			try {

				trialaction = driver.findElement(By.xpath(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {

				trialaction = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				trialaction = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				trialaction = driver.findElement(By.className(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {

				trialaction = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {

				trialaction = driver.findElement(By.linkText(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {

				trialaction = driver.findElement(By.name(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {

				trialaction = driver.findElement(By.partialLinkText(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return Locator;

	}
	/*
	 * WebElement trialaction =
	 * driver.findElement(By.id("nav-global-location-popover-link")); Actions action
	 * = new Actions(driver); action.doubleClick(trialaction).perform();
	 * Thread.sleep(3000);
	 */

	@Test
	public WebElement dragAndDrop(String selector, String fromm ,String Too) throws Exception {
	//	String fromm = null;
	//	String Too = null;

		WebElement From;
		WebElement To;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		WebElement to;
		WebElement from;

		switch (selector) {
		case "xpath":

			try {

				From = driver.findElement(By.xpath(fromm));
				To = driver.findElement(By.xpath(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {
				From = driver.findElement(By.cssSelector(fromm));
				To = driver.findElement(By.cssSelector(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				From = driver.findElement(By.id(fromm));
				To = driver.findElement(By.id(Too));

				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				From = driver.findElement(By.className(fromm));
				To = driver.findElement(By.className(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {

				From = driver.findElement(By.tagName(fromm));
				To = driver.findElement(By.tagName(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {
				From = driver.findElement(By.linkText(fromm));
				To = driver.findElement(By.linkText(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {
				From = driver.findElement(By.name(fromm));
				To = driver.findElement(By.name(Too));

				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {
				From = driver.findElement(By.partialLinkText(fromm));
				To = driver.findElement(By.partialLinkText(Too));
				from = wait.until(ExpectedConditions.elementToBeClickable(From));
				to = wait.until(ExpectedConditions.elementToBeClickable(To));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return Locator;
	}
	/*
	 * WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
	 * WebElement To=driver.findElement(By.xpath("//*[@class='placeholder']"));
	 * //http://demo.guru99.com/test/drag_drop.html Actions action=new
	 * Actions(driver); Thread.sleep(3000); action.dragAndDrop(From,
	 * To).build().perform(); Thread.sleep(3000);
	 */

	@Test
	public WebElement clickAndHold(String selector, String Address) throws Exception {
		WebElement titleC;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 3);

		switch (selector) {
		case "xpath":

			try {

				titleC = driver.findElement(By.xpath(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {

				titleC = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				titleC = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				titleC = driver.findElement(By.className(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {

				titleC = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {

				titleC = driver.findElement(By.linkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {

				titleC = driver.findElement(By.name(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {

				titleC = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(titleC));

				Thread.sleep(3000);
				action.moveToElement(titleC);
				Thread.sleep(3000);
				action.clickAndHold().perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return Locator;
	}
	/*
	 * WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
	 * //https://selenium08.blogspot.com/2020/01/click-and-hold.html Actions action
	 * = new Actions(driver); Thread.sleep(3000); action.moveToElement(titleC);
	 * Thread.sleep(3000); action.clickAndHold().perform();
	 */

	@Test
	public WebElement contextClick(String selector, String Address)  {
		Actions action = new Actions(driver);

		WebElement ele;
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		switch (selector) {
		case "xpath":

			try {

				ele = driver.findElement(By.xpath(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "cssSelector":

			try {

				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":

			try {

				ele = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":

			try {

				ele = driver.findElement(By.className(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":

			try {

				ele = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":

			try {

				ele = driver.findElement(By.linkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":

			try {

				ele = driver.findElement(By.name(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":

			try {

				ele = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return Locator;
	}
	/*
	 * WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
	 * Actions action = new Actions(driver); action.contextClick(element).perform();
	 */

	@Test
	public void textVerify(String selector, String Address) throws Exception {

		String Expected = null;
		WebDriverWait wait = new WebDriverWait(driver, 3);

		WebElement ele;
		String text;

		switch (selector) {
		case "id":
			ele = driver.findElement(By.id(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "className":
			ele = driver.findElement(By.className(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "tagName":
			ele = driver.findElement(By.tagName(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "xpath":

			ele = driver.findElement(By.xpath(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "cssSelector":
			ele = driver.findElement(By.cssSelector(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "linkText":
			ele = driver.findElement(By.linkText(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "name":
			ele = driver.findElement(By.name(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		case "partialLinkText":
			ele = driver.findElement(By.partialLinkText(Address));
			element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = element.getText();

			System.out.println("Text obtained is" + text);

			if (text.contains(Expected)) {
				System.out.println("Expected text is obtained");
			} else {

				System.out.println("Expected text is not obtained");

			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
	}

    @Test
    public WebElement click(String selector, String Address) throws Exception {

 
        switch (selector) {
        case "xpath":
            driver.findElement(By.xpath(Address)).click();
            break;
            
        case "cssSelector":
            driver.findElement(By.cssSelector(Address)).click();
            break;
            
        case "id":
    //      Locator =  driver.findElement(By.id(Address));
          driver.findElement(By.id(Address)).click();
          
 

        break;
        case "className":
            driver.findElement(By.className(Address)).click();
            break;
            
        case "tagName":
            driver.findElement(By.tagName(Address)).click();
            break;

 

        case "linkText":
            driver.findElement(By.linkText(Address)).click();
            break;
            
        case "name":
            driver.findElement(By.name(Address)).click();
            break;
            
        case "partialLinkText":
            driver.findElement(By.partialLinkText(Address)).click();
        default:
             throw new Exception("locator : " + selector + " not found!!!");
             
                 }
         return Locator;
        }
    
    @Test
    public WebElement clear(String selector, String Address) throws Exception {

        switch (selector) {
        case "xpath":
            driver.findElement(By.xpath(Address)).clear();
            break;
            
        case "cssSelector":
            driver.findElement(By.cssSelector(Address)).clear();
            break;
            
        case "id":
            driver.findElement(By.id(Address)).clear();
        break;
        
        case "className":
            driver.findElement(By.className(Address)).clear();
            break;
            
        case "tagName":
            driver.findElement(By.tagName(Address)).clear();
            break;

 

        case "linkText":
            driver.findElement(By.linkText(Address)).clear();
            break;
            
        case "name":
            driver.findElement(By.name(Address)).clear();
            break;
            
        case "partialLinkText":
            driver.findElement(By.partialLinkText(Address)).clear();
         default:
             throw new Exception("locator : " + selector + " not found!!!");
             
                 }
         return Locator;
        }
    
   
	public String autoSuggetion(String selector, String Address) {


    WebElement Search; 
    String keyvalue = null; 
    String Value = null; 
    String Locator;
   
        
   
        WebDriverWait wait = new WebDriverWait(driver, 2);
        
        switch (selector) {            
       
        case "xpath":
            try {
    
        Search = driver.findElement(By.xpath(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "cssSelector":
            try {
    
        Search = driver.findElement(By.cssSelector(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "id":
            try {
    
        Search = driver.findElement(By.id(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "className":
            try {
    
        Search = driver.findElement(By.className(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "tagName":
            try {
    
        Search = driver.findElement(By.tagName(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "name":
            try {
    
        Search = driver.findElement(By.name(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
    
        case "linkText":
            try {
    
        Search = driver.findElement(By.linkText(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;

 

        case "partialLinkText":
            try {
    
        Search = driver.findElement(By.partialLinkText(Address));
        Search.click();
        Search.sendKeys(keyvalue);
        driver.findElement(By.xpath("//*[contains(text(),'"+Value+"'")).click();
        
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
                        
                
    }
        return Value;
    
}
	public WebElement sendkeys(String selector, String Address, String Data) throws Exception {
        Actions action = new Actions(driver);
        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //String selector = null;
        switch (selector) {
        case "xpath":
            try {
                ele = driver.findElement(By.xpath(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));
            //    action.contextClick(ele).perform();
                action.click(ele).perform();    
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "cssSelector":

 

            try {

 

                ele = driver.findElement(By.cssSelector(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));

 

                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "id":
            try {
                ele = driver.findElement(By.id(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));

 

                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "className":
            try {
               ele = driver.findElement(By.className(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));
                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "tagName":
            try {
                ele = driver.findElement(By.tagName(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));

                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "linkText":

            try {

                ele = driver.findElement(By.linkText(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));

                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "name":
            try {
                ele = driver.findElement(By.name(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));
                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "partialLinkText":
            try {
                ele = driver.findElement(By.partialLinkText(Address));
                ele.sendKeys(Data);
                element = wait.until(ExpectedConditions.elementToBeClickable(ele));
                //action.contextClick(ele).perform();
                action.click(ele).perform();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        default:
            throw new Exception("locator : " + selector + " not found!!!");
        }
        return Locator;
    

		
	}

}

	

