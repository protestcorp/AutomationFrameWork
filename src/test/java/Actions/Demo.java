package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	String Locator;
	String Address;

	@Test
	public void Loc(	String Locator,
	String Address) {

		if (Locator == "xpath") {
			driver.findElement(By.xpath(Address));

		} else if (Locator == "cssSelector") {
			driver.findElement(By.cssSelector(Address));

		} else if (Locator == "id") {
			driver.findElement(By.id(Address));

		}
		if (Locator == "className") {
			driver.findElement(By.className(Address));

		} else if (Locator == "tagName") {
			driver.findElement(By.tagName(Address));
			;

		} else if (Locator == "linkText") {
			driver.findElement(By.linkText(Address));

		} else if (Locator == "name") {
			driver.findElement(By.name(Address));

		} else if (Locator == "partialLinkText") {
			driver.findElement(By.partialLinkText(Address));
		}
	}
	@Test
	public void doubleclickaction() {
	 Loc(Locator  ,Address );
	 WebElement trialaction = (WebElement) this.driver;
		Actions action = new Actions(driver);
		action.doubleClick(trialaction).perform();
	 
	}
	@Test
	public void copyPaste() {
		// Copy and paste any info
		String source = null ;
		 String destination = null;
		
			WebElement sourcetext = driver.findElement(By.xpath(source));
			WebElement destinationtext = driver.findElement(By.xpath(destination));
			Actions action = new Actions(driver);
			action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
			action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  
}}
