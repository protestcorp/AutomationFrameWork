package Actions;

	import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.openqa.selenium.By;


import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Calandar {
	WebDriver driver;
	String selector;
	String Address;
	String Address1 = "//*[contains(text(),%s)]";
	WebElement calander;
	WebElement date;
	String givendate;
	int noOfDays;

	public static String getCurrentDate() {

		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		return Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
	}

	public static String getCurrentMonthAndYear() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		String year = Integer.toString(calendar.get(Calendar.YEAR));
		return month + " " + year;
	}

	public static String getFutureOrPreviousDate(int days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		return cal.getTime().toString();
	}

	public WebElement selectCurrentDate() throws Exception {
		
		switch (selector) {
		case "xpath":
			try {
				calander = driver.findElement(By.xpath(Address));
				date = driver.findElement(By.xpath(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;

		case "cssSelector":
			try {
				calander = driver.findElement(By.cssSelector(Address));
				date = driver.findElement(By.cssSelector(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "id":
			try {
				calander = driver.findElement(By.id(Address));
				date = driver.findElement(By.id(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "className":
			try {
				calander = driver.findElement(By.className(Address));
				date = driver.findElement(By.className(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "tagName":
			try {
				calander = driver.findElement(By.tagName(Address));
				date = driver.findElement(By.tagName(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "linkText":
			try {
				calander = driver.findElement(By.linkText(Address));
				date = driver.findElement(By.linkText(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "name":
			try {
				calander = driver.findElement(By.name(Address));
				date = driver.findElement(By.name(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;
		case "partialLinkText":
			try {
				calander = driver.findElement(By.partialLinkText(Address));
				date = driver.findElement(By.partialLinkText(String.format(Address1, getCurrentDate())));
			} catch (Exception e) {
				Assert.assertTrue(false);
			}
			break;

		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return date;
	}

	public WebElement selectGivenDate() throws Exception {
		switch (selector) {
		case "xpath":
			try {
				calander = driver.findElement(By.xpath(Address));
				date = driver.findElement(By.xpath(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "cssSelector":
			try {
				calander = driver.findElement(By.cssSelector(Address));
				date = driver.findElement(By.cssSelector(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "id":
			try {
				calander = driver.findElement(By.id(Address));
				date = driver.findElement(By.id(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "className":
			try {
				calander = driver.findElement(By.className(Address));
				date = driver.findElement(By.className(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "tagName":
			try {
				calander = driver.findElement(By.tagName(Address));
				date = driver.findElement(By.tagName(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "linkText":
			try {
				calander = driver.findElement(By.linkText(Address));
				date = driver.findElement(By.linkText(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "name":
			try {
				calander = driver.findElement(By.name(Address));
				date = driver.findElement(By.name(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "partialLinkText":
			try {
				calander = driver.findElement(By.partialLinkText(Address));
				date = driver.findElement(By.partialLinkText(String.format(Address1, givendate)));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");

		}
		return date;
	}
	
	
	
	
	

	public WebElement selectFutureDate() throws Exception {
		switch (selector) {
		case "xpath":
			try {
				calander = driver.findElement(By.xpath(Address));
				date = driver.findElement(By.xpath(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "cssSelector":
			try {
				calander = driver.findElement(By.cssSelector(Address));
				date = driver.findElement(By.cssSelector(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "id":
			try {
				calander = driver.findElement(By.id(Address));
				date = driver.findElement(By.id(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "className":
			try {
				calander = driver.findElement(By.className(Address));
				date = driver.findElement(By.className(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "tagName":
			try {
				calander = driver.findElement(By.tagName(Address));
				date = driver.findElement(By.tagName(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "linkText":
			try {
				calander = driver.findElement(By.linkText(Address));
				date = driver.findElement(By.linkText(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "name":
			try {
				calander = driver.findElement(By.name(Address));
				date = driver.findElement(By.name(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		case "partialLinkText":
			try {
				calander = driver.findElement(By.partialLinkText(Address));
				date = driver.findElement(By.partialLinkText(String.format(Address1, getFutureOrPreviousDate(noOfDays))));

			} catch (Exception e) {
				Assert.assertTrue(false);

			}
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		 return date;
	}
}


















/*
	public class Calender extends ActionUtilities {
		
	public static String getCurrentDate(){
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	return Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
	}

	 public static String getCurrentMonthAndYear(){
		 
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
	String year = Integer.toString(calendar.get(Calendar.YEAR));
	return month+" "+year;
	}

	 public void selectDynamicDate(String month, String date){
	driver.findElement(By.xpath(String.format("//*[contains(text(),'%s')]/../../div[@class='DayPicker-Body']/div/div/div/p[1][contains(text(),'%s')]",getCurrentMonthAndYear(),getCurrentDate()))).click();
	}
	public void selectGivenDate(String month, String date){
	driver.findElement(By.xpath("//*[contains(text(),'"+month+" 2021')]/../../div[@class='DayPicker-Body']/div/div/div/p[1][contains(text(),'"+date+"')]")).click();
	}

	}
*/
