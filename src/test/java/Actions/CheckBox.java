package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends ActionUtilities {
	WebDriver driver;
	String Locator;
	String Address;
	String selector;
	@Test
    public String enableRadioButton() throws Exception {
        
        
        switch (selector) {
        case "xpath":
            driver.findElement(By.xpath(Address)).isEnabled();
            break;
            
        case "cssSelector":
            driver.findElement(By.cssSelector(Address)).isEnabled();
            break;
            
        case "id":
            driver.findElement(By.id(Address)).isEnabled();
            break;
            
        case "className":
            driver.findElement(By.className(Address)).isEnabled();
            break;
            
        case "tagName":
            driver.findElement(By.tagName(Address)).isEnabled();
            break;

 

        case "linkText":
            driver.findElement(By.linkText(Address)).isEnabled();
            break;
            
        case "name":
            driver.findElement(By.name(Address)).isEnabled();

 

        case "partialLinkText":
            driver.findElement(By.partialLinkText(Address)).isEnabled();
         default:
             throw new Exception("locator : " + selector + " not found!!!");
             
                 }
         return Locator;
        }
    
    @Test
    public String disEnableRadioButton() throws Exception {


        switch (selector) {
        case "xpath":
            driver.findElement(By.xpath(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "cssSelector":
            driver.findElement(By.cssSelector(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "id":
            driver.findElement(By.id(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "className":
            driver.findElement(By.className(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "tagName":
            driver.findElement(By.tagName(Address)).isEnabled();
            Assert.assertFalse(false);
            break;

 

        case "linkText":
            driver.findElement(By.linkText(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "name":
            driver.findElement(By.name(Address)).isEnabled();
            Assert.assertFalse(false);
            break;
            
        case "partialLinkText":
            driver.findElement(By.partialLinkText(Address)).isEnabled();
            Assert.assertFalse(false);
         default:
             throw new Exception("locator : " + selector + " not found!!!");
             
                 }
         return Locator;
        }
  public String selectRadioButton() throws Exception {
        
        
        switch (selector) {
        case "xpath":
            driver.findElement(By.xpath(Address)).isSelected();
            break;
            
        case "cssSelector":
            driver.findElement(By.cssSelector(Address)).isSelected();
            break;
            
        case "id":
            driver.findElement(By.id(Address)).isSelected();
            break;
            
        case "className":
            driver.findElement(By.className(Address)).isSelected();
            break;
            
        case "tagName":
            driver.findElement(By.tagName(Address)).isSelected();
            break;

 

        case "linkText":
            driver.findElement(By.linkText(Address)).isSelected();
            break;
            
        case "name":
            driver.findElement(By.name(Address)).isSelected();

 

        case "partialLinkText":
            driver.findElement(By.partialLinkText(Address)).isEnabled();
         default:
             throw new Exception("locator : " + selector + " not found!!!");
             
                 }
         return Locator;
        }
    
    public void verifyTextOnRadioButton()  {
    	try {
			textVerify(selector, Address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       
    	
    }
    public void hoverRadioButton()  { 
    try {
		hover(selector, Address);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

        
    }
    
    }
