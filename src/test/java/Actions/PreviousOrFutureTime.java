package Actions;


	import java.util.Calendar;

	 

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	 

	public class PreviousOrFutureTime {

	 

	                
	    int hours;
	    String value;
	    WebDriver driver;
	    WebElement locator;
	    String selector;
	    
	    
	    
	    public String getFutureOrPreviousTime() throws Exception{
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.HOUR, hours);
	        String futureOrPrevTime = cal.getTime().toString();
	        
	        
	        switch (selector) {
	         case "id":
	             locator = driver.findElement(By.id(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "xpath":
	             locator = driver.findElement(By.xpath(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "cssSelector":
	             locator = driver.findElement(By.cssSelector(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "className":
	             locator = driver.findElement(By.className(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "tagName":
	             locator = driver.findElement(By.tagName(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "linkText":
	             locator = driver.findElement(By.linkText(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "partialLinkText":
	             locator = driver.findElement(By.partialLinkText(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	         case "name":
	             locator = driver.findElement(By.name(value));
	             locator.click();
	             locator.sendKeys(futureOrPrevTime);
	             
	             break;
	              
	         default:
	             throw new Exception("locator : " + selector + " not found!!!");
	             
	                 }
	        return futureOrPrevTime;
	            }
	    }

