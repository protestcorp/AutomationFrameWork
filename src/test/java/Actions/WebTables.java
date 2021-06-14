package Actions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTables extends ActionHandlers {


	@Test
	public void webTables() throws InterruptedException , NoSuchElementException {

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
		 }
	}
}
