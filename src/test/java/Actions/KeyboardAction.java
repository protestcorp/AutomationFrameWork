package Actions;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project.FrameWork.Base;

public class KeyboardAction extends Base {
	WebDriver driver;
	String Locator;
	String Address;
	
	@Test
	public void LaunchingBrowser() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void newTab() {
		// New tab
		
		if(Locator=="xpath") {
			WebElement ele =  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement ele =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement ele = driver.findElement(By.id(Address));
				Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  if(Locator=="className") {
			  WebElement ele =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement ele =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement ele =	  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="name") {
			  WebElement ele =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement ele =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		  }
	/*	  
	
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();*/
	}
	@Test
	public void copyPaste() {
		// Copy and paste any info
 String source = null ;
 String destination = null;
		if(Locator=="xpath") {
			WebElement sourcetext = driver.findElement(By.xpath(source));
			WebElement destinationtext = driver.findElement(By.xpath(destination));
			Actions action = new Actions(driver);
			action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
			action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement sourcetext =   driver.findElement(By.cssSelector(source));
			  WebElement destinationtext =   driver.findElement(By.cssSelector(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement sourcetext =   driver.findElement(By.id(source));
			  WebElement destinationtext =   driver.findElement(By.id(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  if(Locator=="className") {
			  WebElement sourcetext =   driver.findElement(By.className(source));
			  WebElement destinationtext =   driver.findElement(By.className(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement sourcetext =   driver.findElement(By.tagName(source));
			  WebElement destinationtext =   driver.findElement(By.tagName(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement sourcetext =   driver.findElement(By.linkText(source));
			  WebElement destinationtext =   driver.findElement(By.linkText(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="name") {
			  WebElement sourcetext =   driver.findElement(By.name(source));
			  WebElement destinationtext =   driver.findElement(By.name(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement sourcetext =   driver.findElement(By.partialLinkText(source));
			  WebElement destinationtext =   driver.findElement(By.partialLinkText(destination));
			  Actions action = new Actions(driver);
				action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
				action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform();
		  }
		  /*
		WebElement sourcetext = driver.findElement(By.xpath("<>"));
		WebElement destinationtext = driver.findElement(By.xpath("<>"));
		Actions action = new Actions(driver);
		action.keyDown(sourcetext, Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
		action.keyDown(destinationtext, Keys.CONTROL).sendKeys("A").sendKeys("V").build().perform(); */
	}//
	@Test
	public void capsActions() {
		// write text's in CAP's
    String sendkeys = null;
		if(Locator=="xpath") {
			WebElement ele =  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
		    action.moveToElement(ele).
		    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
		    build().perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement ele =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  else if(Locator=="id") {
			  WebElement ele = driver.findElement(By.id(Address));
				
				Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  if(Locator=="className") {
			  WebElement ele =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement ele =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement ele =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  else if(Locator=="name") {
			  WebElement ele =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement ele =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
			    action.moveToElement(ele).
			    click().keyDown(Keys.SHIFT).sendKeys(sendkeys).
			    build().perform();
		  }}
		  /*
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	
	Actions action = new Actions(driver);
    action.moveToElement(ele).
    click().keyDown(Keys.SHIFT).sendKeys("protest").
    build().perform();
	*/
	@Test
	public void iframeAction() {
     int value=0;
		if(Locator=="xpath") {
			driver.switchTo().frame(value);
			  driver.findElement(By.xpath(Address));
		  }
		  else if(Locator=="cssSelector") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.cssSelector(Address));
		  }
		  else if(Locator=="id") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.id(Address));
		  }
		  if(Locator=="className") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.className(Address));
		  }
		  else if(Locator=="tagName") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.tagName(Address));
		  }
		  else if(Locator=="linkText") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.linkText(Address));
		  }
		  else if(Locator=="name") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.name(Address));
		  }
		  else if(Locator=="partialLinkText") {
			  driver.switchTo().frame(value);
			  driver.findElement(By.partialLinkText(Address));
		  }
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("<>"));
	}
	
	@Test
	public void webTables() throws InterruptedException , NoSuchElementException {
		/*
		List<WebElement> colList =  driver.findElements(By.xpath("//table[@id='product']//thead//tr//th"));
		System.out.println(colList.size());
		
		int column = 0;
		for(int i =0 ; i<colList.size();i++) {
			System.out.println(colList.get(i).getText());
	
			if("Position".equalsIgnoreCase(colList.get(i).getText())) {
				column = i;
				break;
			}
		}
		System.out.println("Column Index :"+column);
		
		List<WebElement> rowList =  driver.findElements(By.xpath("//table[@id='product']//tbody//tr"));
		System.out.println(rowList.size());
		
		boolean f = false;
		
		for(int i=1;i<=rowList.size();i++) {
		String value =	driver.findElement(By.xpath("//table[@id='product']//tbody//tr["+i+"]//td["+column+"]")).getText();
		
			System.out.println(value);
			
			if("Sportsman".equalsIgnoreCase(value)) {
				f= true;
				break;
			}
			
		}
	Assert.assertTrue(f, "Data failed");
	
	}
	*/
		int i=1;
		int j=1;
		String colListElement="//table[@id='dataTable']//thead//tr//th";
		String rowListElement="//table[@id='dataTable']//tbody//tr";
		String webValue="//table[@id='dataTable']//tbody//tr["+j+"]//td["+i+"]";

		if(Locator=="xpath") {
		//https://money.rediff.com/indices
		driver.findElement(By.id("showMoreLess")).click();
		Thread.sleep(3000);
		List<WebElement> colList =  driver.findElements(By.xpath(colListElement));
		System.out.println(colList.size());
		
		List<WebElement> rowList =  driver.findElements(By.xpath(rowListElement));
		System.out.println(rowList.size());
		
		for( j=1;j<=rowList.size();j++) {
		for( i=1;i<=colList.size();i++) {
			
		
				String value =	driver.findElement(By.xpath(webValue)).getText();
		Thread.sleep(3000);
				System.out.println(value);
			}
			}}
		
		 else if(Locator=="cssSelector") {
			 driver.findElement(By.id("showMoreLess")).click();
				Thread.sleep(3000);
				List<WebElement> colList =  driver.findElements(By.cssSelector(colListElement));
				System.out.println(colList.size());
				
				List<WebElement> rowList =  driver.findElements(By.cssSelector(rowListElement));
				System.out.println(rowList.size());
				
				for( j=1;j<=rowList.size();j++) {
				for( i=1;i<=colList.size();i++) {
					
				
						String value =	driver.findElement(By.cssSelector(webValue)).getText();
				Thread.sleep(3000);
						System.out.println(value);
		  }
		}
		 }}

	@Test
	public void hoverAction() throws InterruptedException {

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
		  /*
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		*/
	}
	
	@Test
	public void doubleClick() throws InterruptedException {

		if(Locator=="xpath") {
			WebElement trialaction =	  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.doubleClick(trialaction).perform();
			Thread.sleep(3000);
		  }
		  else if(Locator=="cssSelector") {
			  WebElement trialaction =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="id") {
			  WebElement trialaction =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  if(Locator=="className") {
			  WebElement trialaction =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="tagName") {
			  WebElement trialaction =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="linkText") {
			  WebElement trialaction =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="name") {
			  WebElement trialaction =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement trialaction =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.doubleClick(trialaction).perform();
				Thread.sleep(3000);
		  }
		  /*
		WebElement trialaction = driver.findElement(By.id("nav-global-location-popover-link"));
		Actions action = new Actions(driver);
		action.doubleClick(trialaction).perform();
		Thread.sleep(3000); */
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
	String fromm = null;
	String Too = null;
		if(Locator=="xpath") {
			WebElement From=	  driver.findElement(By.xpath(fromm));
			WebElement To=  driver.findElement(By.xpath(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="cssSelector") {
			  WebElement From=  driver.findElement(By.cssSelector(fromm));
			  WebElement To=  driver.findElement(By.cssSelector(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="id") {
			  WebElement From=  driver.findElement(By.id(fromm));
			  WebElement To=  driver.findElement(By.id(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  if(Locator=="className") {
			  WebElement From=  driver.findElement(By.className(fromm));
			  WebElement To=  driver.findElement(By.className(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="tagName") {
			  WebElement From=  driver.findElement(By.tagName(fromm));
			  WebElement To=  driver.findElement(By.tagName(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="linkText") {
			  WebElement From=  driver.findElement(By.linkText(fromm));
			  WebElement To=  driver.findElement(By.linkText(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="name") {
			  WebElement From=  driver.findElement(By.name(fromm));
			  WebElement To=  driver.findElement(By.name(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement From=  driver.findElement(By.partialLinkText(fromm));
			  WebElement To=  driver.findElement(By.partialLinkText(Too));
			  Actions action=new Actions(driver);					
	        	Thread.sleep(3000);
	        action.dragAndDrop(From, To).build().perform();
	        Thread.sleep(3000);
		  }
		  /*
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
		WebElement To=driver.findElement(By.xpath("//*[@class='placeholder']"));	  
	//http://demo.guru99.com/test/drag_drop.html
        Actions action=new Actions(driver);					
        	Thread.sleep(3000);
        action.dragAndDrop(From, To).build().perform();
        Thread.sleep(3000); */
	}
	
	@Test
	public void clickAndHold()throws InterruptedException {
	
		if(Locator=="xpath") {
			WebElement titleC =  driver.findElement(By.xpath(Address));
			 Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="cssSelector") {
			  WebElement titleC =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="id") {
			  WebElement titleC =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  if(Locator=="className") {
			  WebElement titleC =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="tagName") {
			  WebElement titleC =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="linkText") {
			  WebElement titleC =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="name") {
			  WebElement titleC =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement titleC =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver); 
				Thread.sleep(3000);
					   action.moveToElement(titleC);
					   Thread.sleep(3000);
					   action.clickAndHold().perform(); 
		  }
		  /*
		WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
		//https://selenium08.blogspot.com/2020/01/click-and-hold.html
		   Actions action = new Actions(driver); 
	Thread.sleep(3000);
		   action.moveToElement(titleC);
		   Thread.sleep(3000);
		   action.clickAndHold().perform(); 
		   */
	}
	
	@Test
	public void contextClick() {

		if(Locator=="xpath") {
			WebElement element =  driver.findElement(By.xpath(Address));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		  }
		  else if(Locator=="cssSelector") {
			  WebElement element =  driver.findElement(By.cssSelector(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="id") {
			  WebElement element =  driver.findElement(By.id(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  if(Locator=="className") {
			  WebElement element =  driver.findElement(By.className(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="tagName") {
			  WebElement element =  driver.findElement(By.tagName(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="linkText") {
			  WebElement element =  driver.findElement(By.linkText(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="name") {
			  WebElement element =  driver.findElement(By.name(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }
		  else if(Locator=="partialLinkText") {
			  WebElement element =  driver.findElement(By.partialLinkText(Address));
			  Actions action = new Actions(driver);
				action.contextClick(element).perform();
		  }/*
			WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform(); */
	}
	@Test
	public void scrollAction() {
		String value ="window.scrollBy(0,1000)";
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value);
	}
	
	// verification of text
		}
		
	

