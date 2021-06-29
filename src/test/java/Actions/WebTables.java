package Actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTables extends ActionUtilities {

	WebDriver driver;
	String Locator;
	String Address;
	String selector;

	WebElement element;

	
	@Test
	public String webTables() throws Exception {

		int i=1;
		int j=1;
		String colListElement="//table[@id='dataTable']//thead//tr//th";
		String rowListElement="//table[@id='dataTable']//tbody//tr";
		String webValue="//table[@id='dataTable']//tbody//tr["+j+"]//td["+i+"]";

		List<WebElement>  colList;
		List<WebElement> rowList;
		
		click();
		
		switch (selector) {
		
		 case "xpath":
	       
			 Thread.sleep(3000);
		 colList =  (List<WebElement>) driver.findElements(By.xpath(colListElement));
		System.out.println(colList.size());
	
		

		 rowList =  (List<WebElement>) driver.findElements(By.xpath(rowListElement));
		System.out.println(rowList.size());
		
		
		for( j=1;j<=rowList.size();j++) {
		for( i=1;i<=colList.size();i++) {
			
		
				String value =	driver.findElement(By.xpath(webValue)).getText();
		Thread.sleep(3000);
				System.out.println(value);
			}
			}
		  break;
		
	    case "cssSelector" :
	    	 Thread.sleep(3000);
				 colList =  driver.findElements(By.cssSelector(colListElement));
				System.out.println(colList.size());
				
				 rowList =  driver.findElements(By.cssSelector(rowListElement));
				System.out.println(rowList.size());
				
				for( j=1;j<=rowList.size();j++) {
				for( i=1;i<=colList.size();i++) {
					
				
						String value =	driver.findElement(By.cssSelector(webValue)).getText();
				Thread.sleep(3000);
						System.out.println(value);
		  }
		}
		 
		 break;
	
	  
	     case "id":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.id(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.id(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.id(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	         break;
	     case "className":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.className(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.className(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.className(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	         break;
	     case "tagName":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.tagName(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.tagName(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.tagName(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	         break;
	    
	     
	        
	     case "linkText":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.linkText(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.linkText(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.linkText(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	         break;
	         
	     case "name":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.name(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.name(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.name(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	         break;
	         
	     case "partialLinkText":
	    	 Thread.sleep(3000);
			 colList =  (List<WebElement>) driver.findElements(By.partialLinkText(colListElement));
			System.out.println(colList.size());
		
			

			 rowList =  (List<WebElement>) driver.findElements(By.partialLinkText(rowListElement));
			System.out.println(rowList.size());
			
			
			for( j=1;j<=rowList.size();j++) {
			for( i=1;i<=colList.size();i++) {
				
			
					String value =	driver.findElement(By.partialLinkText(webValue)).getText();
			Thread.sleep(3000);
					System.out.println(value);
				}
				}
	                 break;
	     default:
	         throw new Exception("locator : " + selector + " not found!!!");
	         
	             }
	 return Locator;
}

}
