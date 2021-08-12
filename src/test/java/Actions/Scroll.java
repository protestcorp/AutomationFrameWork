package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Scroll extends ActionUtilities{
	
	 
     String Locator;
     WebElement Source;
     String Address;
     String selector;
     
	@Test
	public void scrollAction() {
		String value ="window.scrollBy(0,1000)";
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value);
	}


    
    
     
    public String scrollToElement() throws Exception{
        Actions actions = new Actions(driver);  
        WebDriverWait wait = new WebDriverWait(driver, 2);

 

       
		switch (selector) {
        case "xpath":
            try {
        actions.moveToElement(driver.findElement(By.xpath(Address))).build().perform();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "cssSelector":
            try {
        actions.moveToElement(driver.findElement(By.cssSelector(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "className":
            try {
        actions.moveToElement(driver.findElement(By.className(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "id":
            try {
        actions.moveToElement(driver.findElement(By.id(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "tagName":
            try {
        actions.moveToElement(driver.findElement(By.tagName(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.tagName(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "linkText":
            try {
        actions.moveToElement( driver.findElement(By.linkText(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.linkText(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "name":
            try {
        actions.moveToElement(driver.findElement(By.name(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
        case "partialLinkText":
            try {
        actions.moveToElement(driver.findElement(By.partialLinkText(Address))).build().perform();
        actions.click();
        Source = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText(Address))));
        actions.click();
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
            break;
         default:
             throw new Exception("locator : " + Locator + " not found!!!");
            
}
        return Locator;
        }
}
 



	

