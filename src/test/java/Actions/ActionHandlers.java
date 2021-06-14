package Actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Actions.KeyboardAction;
import Actions.MouseAction;

import Actions.DoubleClick;

public class ActionHandlers {
	WebDriver driver;
	String Locator;
	String Address;
	
	
	@Test
	public void loc() throws IOException, NoSuchElementException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");

		String action = "newTab";

		switch (action) {

		case "newTab":
			NewTab N = new NewTab();
			N.newTab();
			break;

		case "copyPaste":
			CopyPaste C = new CopyPaste();
			C.copyPaste();
			break;

		case "caps":
			Caps c = new Caps();
			
			c.capsActions();
			break;

		case "iframe":
			Iframe I = new Iframe();
			
			I.iframeAction();
			break;

		case "webTables":
			WebTables W = new WebTables();
			W.webTables();
			break;

		case "hover":
			Hover H =new Hover();
			
			H.hoverAction();
			break;

		case "doubleClick":
			DoubleClick a = new DoubleClick();	
			a.doubleClickk();
			break;

		case "dragAndDrop":
			DragAndDrop D = new DragAndDrop();
			
			D.dragAndDrop();
			break;

		case "clickAndHold":
			ClickAndHold l = new ClickAndHold();
			l.clickAndHold();
			break;

		case "contextClick":
			ContextClick o = new ContextClick();
			o.contextClick();
			break;

		case "scrollAction":
			Scroll s = new Scroll();
			s.scrollAction();
			break;
		case "verifyText":
			TextVerification T = new TextVerification();
			T.verifyText();
			break;
			
	
			

		}

		/*
		 * FileReader f = new
		 * FileReader("C:\\Users\\Likith\\Desktop\\PRO-TEST\\Locators.txt");
		 * BufferedReader b = new BufferedReader(f);
		 * 
		 * String username; String password;
		 * 
		 * while((username = b.readLine())!=null) { password = b.readLine();
		 * System.out.println(username); System.out.println(password);
		 * 
		 * if(username=="XPATH") { driver.findElement(By.xpath("")); } else
		 * if(username=="CSS") { driver.findElement(By.cssSelector("")); } else
		 * if(username=="ID") { driver.findElement(By.id("")); } if(password=="XPATH") {
		 * driver.findElement(By.xpath("")); } else if(password=="CSS") {
		 * driver.findElement(By.cssSelector("")); } else if(password=="ID") {
		 * driver.findElement(By.id("")); }
		 * 
		 * }
		 */
	}

}