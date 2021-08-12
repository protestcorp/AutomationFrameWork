package Actions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Project.FrameWork.Base;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.TestAnnotations;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.SupportedWebDriver;
import net.thucydides.junit.annotations.TestData;




public class ActionUtilities extends Base  {
	@Managed(driver = "chrome")
    public WebDriver driver;
	WebElement Locator;
	// String Address;
	// String selector = null;
	WebElement element;

	private static final Logger logger = LogManager.getLogger(ActionUtilities.class.getName());

	@TestData
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

				logger.error("In newtab action xpath is not functioned ");
			}
			logger.info("In newtab action xpath is functioned ");
			break;

		case "cssSelector":
			try {

				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action cssSelector is not functioned ");
			}
			logger.info("In newtab action cssSelector is functioned ");
			break;

		case "id":
			try {

				ele = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action id is not functioned ");
			}
			logger.info("In newtab action id is functioned ");
			break;

		case "className":
			try {
				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action className is not functioned ");
			}
			logger.info("In newtab action className is functioned ");
			break;

		case "tagName":
			try {
				ele = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action tagName is not functioned ");
			}
			logger.info("In newtab action tagName is functioned ");
			break;

		case "linkText":
			try {
				ele = driver.findElement(By.linkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action linkText is not functioned ");
			}
			logger.info("In newtab action linkText is functioned ");
			break;

		case "name":
			try {
				ele = driver.findElement(By.name(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action name is not functioned ");
			}
			logger.info("In newtab action name is functioned ");
			break;

		case "partialLinkText":
			try {
				ele = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			} catch (Exception e) {
				logger.error("In newtab action partialLinkText is not functioned ");
			}
			logger.info("In newtab action partialLinkText is functioned ");

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " newtab action is not functioned ");
			}
			logger.info(" " + selector + " newtab action is functioned ");
			;

		}

		return Locator;
	}

	@Test
	public WebElement copyPaste(String selector, String source, String destination) throws Exception {

		WebElement sourcetext;
		WebElement destinationtext;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 4);

		switch (selector) {
		case "id":
			try {
				sourcetext = driver.findElement(By.id(source));
				destinationtext = driver.findElement(By.id(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action id is not functioned ");
			}
			logger.info("In copyPaste action id is functioned ");
			break;

		case "xpath":
			try {
				sourcetext = driver.findElement(By.xpath(source));
				destinationtext = driver.findElement(By.xpath(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action xpath is not functioned ");
			}
			logger.info("In copyPaste action xpath is functioned ");
			break;

		case "className":
			try {
				sourcetext = driver.findElement(By.className(source));
				destinationtext = driver.findElement(By.className(destination));
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action className is not functioned ");
			}
			logger.info("In copyPaste action className is functioned ");
			break;

		case "cssSelector":
			try {

				sourcetext = driver.findElement(By.cssSelector(source));
				destinationtext = driver.findElement(By.cssSelector(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action cssSelector is not functioned ");
			}
			logger.info("In copyPaste action cssSelector is functioned ");
			break;

		case "tagName":
			try {
				sourcetext = driver.findElement(By.tagName(source));
				destinationtext = driver.findElement(By.tagName(destination));
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action tagName is not functioned ");
			}
			logger.info("In copyPaste action tagName is functioned ");
			break;

		case "linkText":
			try {
				sourcetext = driver.findElement(By.linkText(source));
				destinationtext = driver.findElement(By.linkText(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action linkText is not functioned ");
			}
			logger.info("In copyPaste action linkText is functioned ");
			break;

		case "name":
			try {
				sourcetext = driver.findElement(By.name(source));
				destinationtext = driver.findElement(By.name(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action name is not functioned ");
			}
			logger.info("In copyPaste action name is functioned ");
			break;

		case "partialLinkText":
			try {
				sourcetext = driver.findElement(By.partialLinkText(source));
				destinationtext = driver.findElement(By.partialLinkText(destination));

				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
			} catch (Exception e) {
				logger.error("In copyPaste action partialLinkText is not functioned ");
			}
			logger.info("In copyPaste action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + "In copyPaste action is not functioned ");
			}
			logger.info(" " + selector + "In copyPaste action is functioned ");

		}
		return Locator;
	}

	@Test
	public WebElement hover(String selector, String Address) throws Exception {

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
				logger.error("In hover action xpath is not functioned ");
			}
			logger.info("In hover action xpath is functioned ");
			break;

		case "cssSelector":
			try {
				ele = driver.findElement(By.cssSelector(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action cssSelector is not functioned ");
			}
			logger.info("In hover action cssSelector is functioned ");
			break;

		case "id":
			try {

				ele = driver.findElement(By.id(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action id is not functioned ");
			}
			logger.info("In hover action id is functioned ");
			break;

		case "className":
			try {

				ele = driver.findElement(By.className(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action className is not functioned ");
			}
			logger.info("In hover action className is functioned ");
			break;

		case "tagName":
			try {

				ele = driver.findElement(By.tagName(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action tagName is not functioned ");
			}
			logger.info("In hover action tagName is functioned ");
			break;

		case "linkText":
			try {

				ele = driver.findElement(By.linkText(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action linkText is not functioned ");
			}
			logger.info("In hover action linkText is functioned ");
			break;

		case "name":
			try {

				ele = driver.findElement(By.name(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action name is not functioned ");
			}
			logger.info("In hover action name is functioned ");
			break;

		case "partialLinkText":
			try {

				ele = driver.findElement(By.partialLinkText(Address));

				element = wait.until(ExpectedConditions.visibilityOf(ele));

				action.moveToElement(ele).perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In hover action partialLinkText is not functioned ");
			}
			logger.info("In hover action partialLinkText is functioned ");

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " hover action is not functioned ");
			}
			logger.info(" " + selector + " hover action is functioned ");

		}
		return Locator;
	}

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
				logger.error("In doubleClick action xpath is not functioned ");
			}
			logger.info("In doubleClick action xpath is functioned ");
			break;

		case "cssSelector":

			try {

				trialaction = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action cssSelector is not functioned ");
			}
			logger.info("In doubleClick action cssSelector is functioned ");
			break;

		case "id":

			try {

				trialaction = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action id is not functioned ");
			}
			logger.info("In doubleClick action id is functioned ");
			break;

		case "className":

			try {

				trialaction = driver.findElement(By.className(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action className is not functioned ");
			}
			logger.info("In doubleClick action className is functioned ");
			break;

		case "tagName":

			try {

				trialaction = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action tagName is not functioned ");
			}
			logger.info("In doubleClick action tagName is functioned ");
			break;

		case "linkText":

			try {

				trialaction = driver.findElement(By.linkText(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action linkText is not functioned ");
			}
			logger.info("In doubleClick action linkText is functioned ");
			break;

		case "name":

			try {

				trialaction = driver.findElement(By.name(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action name is not functioned ");
			}
			logger.info("In doubleClick action name is functioned ");
			break;

		case "partialLinkText":

			try {

				trialaction = driver.findElement(By.partialLinkText(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(trialaction));

				action.doubleClick(trialaction).perform();
				Thread.sleep(2000);
			} catch (Exception e) {
				logger.error("In doubleClick action partialLinkText is not functioned ");
			}
			logger.info("In doubleClick action partialLinkText is functioned ");

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " doubleClick action is not functioned ");
			}
			logger.info(" " + selector + " doubleClick action is functioned ");

		}
		return Locator;

	}

	@Test
	public WebElement dragAndDrop(String selector, String fromm, String Too) throws Exception {

		WebElement From;
		WebElement To;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		switch (selector) {
		case "xpath":

			try {

				From = driver.findElement(By.xpath(fromm));
				To = driver.findElement(By.xpath(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action xpath is not functioned ");
			}
			logger.info("In dragAndDrop action xpath is functioned ");
			break;

		case "cssSelector":

			try {
				From = driver.findElement(By.cssSelector(fromm));
				To = driver.findElement(By.cssSelector(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action cssSelector is not functioned ");
			}
			logger.info("In dragAndDrop action cssSelector is functioned ");
			break;

		case "id":

			try {

				From = driver.findElement(By.id(fromm));
				To = driver.findElement(By.id(Too));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action id is not functioned ");
			}
			logger.info("In dragAndDrop action id is functioned ");
			break;

		case "className":

			try {

				From = driver.findElement(By.className(fromm));
				To = driver.findElement(By.className(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action className is not functioned ");
			}
			logger.info("In dragAndDrop action className is functioned ");
			break;

		case "tagName":

			try {

				From = driver.findElement(By.tagName(fromm));
				To = driver.findElement(By.tagName(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action tagName is not functioned ");
			}
			logger.info("In dragAndDrop action tagName is functioned ");
			break;

		case "linkText":

			try {
				From = driver.findElement(By.linkText(fromm));
				To = driver.findElement(By.linkText(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action linkText is not functioned ");
			}
			logger.info("In dragAndDrop action linkText is functioned ");
			break;

		case "name":

			try {
				From = driver.findElement(By.name(fromm));
				To = driver.findElement(By.name(Too));

				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action name is not functioned ");
			}
			logger.info("In dragAndDrop action name is functioned ");
			break;

		case "partialLinkText":

			try {
				From = driver.findElement(By.partialLinkText(fromm));
				To = driver.findElement(By.partialLinkText(Too));
				Thread.sleep(3000);
				action.dragAndDrop(From, To).build().perform();
				Thread.sleep(3000);
			} catch (Exception e) {
				logger.error("In dragAndDrop action partialLinkText is not functioned ");
			}
			logger.info("In dragAndDrop action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " dragAndDrop action is not functioned ");
			}
			logger.info(" " + selector + " dragAndDrop action is functioned ");

		}
		return Locator;
	}

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
				logger.error("In clickAndHold action xpath is not functioned ");
			}
			logger.info("In clickAndHold action xpath is functioned ");
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
				logger.error("In clickAndHold action cssSelector is not functioned ");
			}
			logger.info("In clickAndHold action cssSelector is functioned ");
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
				logger.error("In clickAndHold action id is not functioned ");
			}
			logger.info("In clickAndHold action id is functioned ");
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
				logger.error("In clickAndHold action className is not functioned ");
			}
			logger.info("In clickAndHold action className is functioned ");
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
				logger.error("In clickAndHold action tagName is not functioned ");
			}
			logger.info("In clickAndHold action tagName is functioned ");
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
				logger.error("In clickAndHold action linkText is not functioned ");
			}
			logger.info("In clickAndHold action linkText is functioned ");
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
				logger.error("In clickAndHold action name is not functioned ");
			}
			logger.info("In clickAndHold action name is functioned ");
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
				logger.error("In clickAndHold action partialLinkText is not functioned ");
			}
			logger.info("In clickAndHold action partialLinkText is functioned ");

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " clickAndHold action is not functioned ");
			}
			logger.info(" " + selector + " clickAndHold action is functioned ");
		}
		return Locator;
	}

	@Test
	public WebElement contextClick(String selector, String Address) {
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
				logger.error("In contextClick action xpath is not functioned ");
			}
			logger.info("In contextClick action xpath is functioned ");
			break;

		case "cssSelector":

			try {

				ele = driver.findElement(By.cssSelector(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action cssSelector is not functioned ");
			}
			logger.info("In contextClick action cssSelector is functioned ");
			break;

		case "id":

			try {

				ele = driver.findElement(By.id(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action id is not functioned ");
			}
			logger.info("In contextClick action id is functioned ");
			break;

		case "className":

			try {

				ele = driver.findElement(By.className(Address));

				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action className is not functioned ");
			}
			logger.info("In contextClick action className is functioned ");
			break;

		case "tagName":

			try {

				ele = driver.findElement(By.tagName(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action tagName is not functioned ");
			}
			logger.info("In contextClick action tagName is functioned ");
			break;

		case "linkText":

			try {

				ele = driver.findElement(By.linkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action linkText is not functioned ");
			}
			logger.info("In contextClick action linkText is functioned ");
			break;

		case "name":

			try {

				ele = driver.findElement(By.name(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action name is not functioned ");
			}
			logger.info("In contextClick action name is functioned ");
			break;

		case "partialLinkText":

			try {

				ele = driver.findElement(By.partialLinkText(Address));
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));

				action.contextClick(ele).perform();
			} catch (Exception e) {
				logger.error("In contextClick action partialLinkText is not functioned ");
			}
			logger.info("In contextClick action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " contextClick action is not functioned ");
			}
			logger.info(" " + selector + " contextClick action is functioned ");
		}
		return Locator;
	}

	@Test
	public WebElement textVerify(String selector, String Address) throws Exception {

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
				logger.error("In textVerify action id is not functioned ");
			}
			logger.info("In textVerify action id is functioned ");
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
				logger.error("In textVerify action className is not functioned ");
			}
			logger.info("In textVerify action className is functioned ");
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
				logger.error("In textVerify action tagName is not functioned ");
			}
			logger.info("In textVerify action tagName is functioned ");
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
				logger.error("In textVerify action xpath is not functioned ");
			}
			logger.info("In textVerify action xpath is functioned ");
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
				logger.error("In textVerify action cssSelector is not functioned ");
			}
			logger.info("In textVerify action cssSelector is functioned ");
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
				logger.error("In textVerify action linkText is not functioned ");
			}
			logger.info("In textVerify action linkText is functioned ");
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
				logger.error("In textVerify action name is not functioned ");
			}
			logger.info("In textVerify action name is functioned ");
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
				logger.error("In textVerify action partialLinkText is not functioned ");
			}
			logger.info("In textVerify action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " textVerify action is not functioned ");
			}
			logger.info(" " + selector + " textVerify action is functioned ");
		}
		return Locator;

	}
	


    @Test
    public WebElement click(String selector, String Address) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement ele;
        
        Actions action = new Actions(driver);
        switch (selector) {
        case "xpath":
            try {
                ele =driver.findElement(By.xpath(Address));
                
            element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                
                action.click(ele).perform();
                
            } catch (Exception e) {
                logger.error("In click action xpath is not functioned ");
            }
            logger.info("In click action xpath is functioned ");
            break;

 

        case "cssSelector":
            try {
            ele=driver.findElement(By.cssSelector(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action cssSelector is not functioned ");
            }
            logger.info("In click action cssSelector is functioned ");
            break;

 

        case "id":
            try {
                ele =driver.findElement(By.id(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action id is not functioned ");
            }
            logger.info("In click action id is functioned ");
            break;

 

        case "className":
            try {
                ele =driver.findElement(By.className(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action className is not functioned ");
            }
            logger.info("In click action className is functioned ");
            break;

 

        case "tagName":
            try {
                ele=driver.findElement(By.tagName(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action tagName is not functioned ");
            }
            logger.info("In click action tagName is functioned ");
            break;

 

        case "linkText":
            try {
            ele=    driver.findElement(By.linkText(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action linkText is not functioned ");
            }
            logger.info("In click action linkText is functioned ");
            break;

 

        case "name":
            try {
                ele=driver.findElement(By.name(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
            } catch (Exception e) {
                logger.error("In click action name is not functioned ");
            }
            logger.info("In click action name is functioned ");
            break;

 

        case "partialLinkText":
            try {
                ele=driver.findElement(By.partialLinkText(Address));
                element= wait.until(ExpectedConditions.elementToBeClickable(ele));
                action.click(ele).perform();
                
            } catch (Exception e) {
                logger.error("In click action partialLinkText is not functioned ");
            }
            logger.info("In click action partialLinkText is functioned ");
            break;

 

        default:
            try {
                throw new Exception("locator : " + selector + " not found!!!");
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(" " + selector + " click action is not functioned ");
            }
            logger.info(" " + selector + " click action is functioned ");
        }
        return Locator;
    }

	
	@Test
	public WebElement clear(String selector, String Address) throws Exception {

		
		switch (selector) {
		case "xpath":
			try {
				driver.findElement(By.xpath(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action xpath is not functioned ");
			}
			logger.info("In clear action xpath is functioned ");
			break;

		case "cssSelector":
			try {
				driver.findElement(By.cssSelector(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action cssSelector is not functioned ");
			}
			logger.info("In clear action cssSelector is functioned ");
			break;

		case "id":
			try {
				driver.findElement(By.id(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action id is not functioned ");
			}
			logger.info("In clear action id is functioned ");
			break;

		case "className":
			try {
				driver.findElement(By.className(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action className is not functioned ");
			}
			logger.info("In clear action className is functioned ");
			break;

		case "tagName":
			try {
				driver.findElement(By.tagName(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action tagName is not functioned ");
			}
			logger.info("In clear action tagName is functioned ");
			break;

		case "linkText":
			try {
				driver.findElement(By.linkText(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action linkText is not functioned ");
			}
			logger.info("In clear action linkText is functioned ");
			break;

		case "name":
			try {
				driver.findElement(By.name(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action name is not functioned ");
			}
			logger.info("In clear action name is functioned ");
			break;

		case "partialLinkText":
			try {
				driver.findElement(By.partialLinkText(Address)).clear();
			} catch (Exception e) {
				logger.error("In clear action partialLinkText is not functioned ");
			}
			logger.info("In clear action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " clear action is not functioned ");
			}
			logger.info(" " + selector + " clear action is functioned ");
		}
		return Locator;
	}

	public String autoSuggetion(String selector, String Address) throws Exception {

		WebElement Search;
		String keyvalue = null;
		String Value = null;
		WebDriverWait wait = new WebDriverWait(driver, 2);

		switch (selector) {

		case "xpath":
			try {
				Search = driver.findElement(By.xpath(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action xpath is not functioned ");
			}
			logger.info("In autoSuggetion action xpath is functioned ");
			break;

		case "cssSelector":
			try {
				Search = driver.findElement(By.cssSelector(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action cssSelector is not functioned ");
			}
			logger.info("In autoSuggetion action cssSelector is functioned ");
			break;

		case "id":
			try {
				Search = driver.findElement(By.id(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action id is not functioned ");
			}
			logger.info("In autoSuggetion action id is functioned ");
			break;

		case "className":
			try {
				Search = driver.findElement(By.className(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action className is not functioned ");
			}
			logger.info("In autoSuggetion action className is functioned ");
			break;

		case "tagName":
			try {

				Search = driver.findElement(By.tagName(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action tagName is not functioned ");
			}
			logger.info("In autoSuggetion action tagName is functioned ");
			break;

		case "name":
			try {

				Search = driver.findElement(By.name(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action name is not functioned ");
			}
			logger.info("In autoSuggetion action name is functioned ");
			break;

		case "linkText":
			try {

				Search = driver.findElement(By.linkText(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action linkText is not functioned ");
			}
			logger.info("In autoSuggetion action linkText is functioned ");
			break;

		case "partialLinkText":
			try {

				Search = driver.findElement(By.partialLinkText(Address));
				Search.click();
				Search.sendKeys(keyvalue);
				driver.findElement(By.xpath("//*[contains(text(),'" + Value + "'")).click();

			} catch (Exception e) {
				logger.error("In autoSuggetion action partialLinkText is not functioned ");
			}
			logger.info("In autoSuggetion action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " autoSuggetion action is not functioned ");
			}
			logger.info(" " + selector + " autoSuggetion action is functioned ");

		}
		return Value;
	}

	public WebElement sendkeys(String selector, String Address, String Data) throws Exception {
		Actions action = new Actions(driver);
		WebElement ele;
		WebDriverWait wait = new WebDriverWait(driver, 3);

		switch (selector) {
		case "xpath":
			try {
				ele = driver.findElement(By.xpath(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action xpath is not functioned ");
			}
			logger.info("In sendkeys action xpath is functioned ");
			break;

		case "cssSelector":
			try {
				ele = driver.findElement(By.cssSelector(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action cssSelector is not functioned ");
			}
			logger.info("In sendkeys action cssSelector is functioned ");
			break;

		case "id":
			try {
				ele = driver.findElement(By.id(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action id is not functioned ");
			}
			logger.info("In sendkeys action id is functioned ");
			break;

		case "className":
			try {
				ele = driver.findElement(By.className(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action className is not functioned ");
			}
			logger.info("In sendkeys action className is functioned ");
			break;

		case "tagName":
			try {
				ele = driver.findElement(By.tagName(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action tagName is not functioned ");
			}
			logger.info("In sendkeys action tagName is functioned ");
			break;

		case "linkText":
			try {
				ele = driver.findElement(By.linkText(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action linkText is not functioned ");
			}
			logger.info("In sendkeys action linkText is functioned ");
			break;

		case "name":
			try {
				ele = driver.findElement(By.name(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();
			} catch (Exception e) {
				logger.error("In sendkeys action name is not functioned ");
			}
			logger.info("In sendkeys action name is functioned ");
			break;

		case "partialLinkText":
			try {
				ele = driver.findElement(By.partialLinkText(Address));
				ele.sendKeys(Data);
				element = wait.until(ExpectedConditions.elementToBeClickable(ele));
				action.click(ele).perform();

			} catch (Exception e) {
				logger.error("In sendkeys action partialLinkText is not functioned ");
			}
			logger.info("In sendkeys action partialLinkText is functioned ");
			break;

		default:
			try {
				throw new Exception("locator : " + selector + " not found!!!");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(" " + selector + " sendkeys action is not functioned ");
			}
			logger.info(" " + selector + " sendkeys action is functioned ");
		}
		return Locator;

	}



    public void AlertAccept() {
    
        WebDriverWait wait = new WebDriverWait(driver,10 );
         wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();
    }
    
    
    public boolean waitForPageLoad() {
    
        String pageLoadStatus = "";
        boolean pageWasLoaded = false;
        long startTime = System.currentTimeMillis();
        
            try {
                pageLoadStatus = this.returnDocumentStatus();    
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            if(pageLoadStatus.equals("complete")|| pageLoadStatus.equals("interactive")) {
                pageWasLoaded = true;
                System.out.print("page loaded");
            }
    
        while((!pageWasLoaded) && (!this.isTimeout(startTime,TIMEOUT_FOR_PAGE_LOAD)));
        {
            return pageWasLoaded;
        }
    }
    private final int TIMEOUT_FOR_PAGE_LOAD = 3;
    
    public String returnDocumentStatus() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        return(String)js.executeScript(url,"return document.readyState");
        
    }
    public boolean isTimeout(long originalTime , long timeoutInSeconds) {
        long wait_time = timeoutInSeconds*1000;
        long end_time = originalTime+wait_time;
        return(System.currentTimeMillis()>end_time);
    }

 

}
 



	
	
	
	

