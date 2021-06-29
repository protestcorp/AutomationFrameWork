package Actions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Iframe extends ActionHandlers {
	@Test
	public void iframeAction() {
	 int value=0;
	 
	driver.switchTo().frame(0);
}
	/*
	 @Test
	public String iframeAction() {
     int value=0;
     
		 
     switch (selector) {
     	case "xpath":
			driver.switchTo().frame(value);
			  driver.findElement(By.xpath(Address));
		 break;
		case "cssSelector":
			  driver.switchTo().frame(value);
			  driver.findElement(By.cssSelector(Address));
		  break;
		case "id":
			  driver.switchTo().frame(value);
			  driver.findElement(By.id(Address));
		 break;
		case "className":
			  driver.switchTo().frame(value);
			  driver.findElement(By.className(Address));
		 break;
		case "tagName":
			  driver.switchTo().frame(value);
			  driver.findElement(By.tagName(Address));
		  break;
		case "linkText":
			  driver.switchTo().frame(value);
			  driver.findElement(By.linkText(Address));
		  break;
		case "name":
			  driver.switchTo().frame(value);
			  driver.findElement(By.name(Address));
		  break;
		case "partialLinkText":
			  driver.switchTo().frame(value);
			  driver.findElement(By.partialLinkText(Address));
		  break;
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("<>"));
		default:
	         throw new Exception("locator : " + selector + " not found!!!");
	         
		 		}
		 return Locator;
		}
	 */
}
