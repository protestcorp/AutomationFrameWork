package ObjectRepository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Signup {

	/*
	@FindBy(id="signin2")
	WebElement signUpLink1;
	
	@FindBy(id="sign-username")
	WebElement username;
	
	@FindBy(id="sign-password")
	WebElement password;
	
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement signUpBtn;
*/
	
	
	WebDriver driver;
	public Signup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver = driver;
		PageFactory.initElements(driver,this);
		
}
	
	/*
	public WebElement signUpLink1() {
	
		
		//return signUpLink1;
	}
/*	
	public WebElement signUpusername1() {
	
		return username;
	}
	
	public WebElement signUppassword() {
		
		return password;
	}
	
	public WebElement signUpBtn() {
		
		return signUpBtn;
	}
*/

	
//	By by = By.id("someId");
	// WebElement e = driver.findElement(by);
	
	By by;

	String selector = "id";
	String value ="signin2";
	@Test
	public WebElement signUpLink1() throws Exception {
	 switch (selector) {
     case "id":
         by =  By.id(value);

         break;
     case "className":
         by =  By.className(value);
         break;
     case "tagName":
         by =  By.tagName(value);
         break;
     case "xpath":
         by =  By.xpath(value);
         break;
     case "cssSelector":
         by =  By.cssSelector(value);
         break;
     case "linkText":
         by =  By.linkText(value);
         break;
     case "name":
         by =  By.name(value);
         break;
     case "partialLinkText":
         by =  By.partialLinkText(value);
        
         break;
     default:
         throw new Exception("locator : " + selector + " not found!!!");
 }
	 return signUpLink1();
}
	public WebElement signUpusername1() throws Exception {
		
		 switch (selector) {
	     case "id":
	         by =  By.id(value);

	         break;
	     case "className":
	         by =  By.className(value);
	         break;
	     case "tagName":
	         by =  By.tagName(value);
	         break;
	     case "xpath":
	         by =  By.xpath(value);
	         break;
	     case "cssSelector":
	         by =  By.cssSelector(value);
	         break;
	     case "linkText":
	         by =  By.linkText(value);
	         break;
	     case "name":
	         by =  By.name(value);
	         break;
	     case "partialLinkText":
	         by =  By.partialLinkText(value);
	        
	         break;
	     default:
	         throw new Exception("locator : " + selector + " not found!!!");
	 }
		return signUpusername1();
	}
	public WebElement signUppassword() throws Exception {
		
		 switch (selector) {
	     case "id":
	         by =  By.id(value);

	         break;
	     case "className":
	         by =  By.className(value);
	         break;
	     case "tagName":
	         by =  By.tagName(value);
	         break;
	     case "xpath":
	         by =  By.xpath(value);
	         break;
	     case "cssSelector":
	         by =  By.cssSelector(value);
	         break;
	     case "linkText":
	         by =  By.linkText(value);
	         break;
	     case "name":
	         by =  By.name(value);
	         break;
	     case "partialLinkText":
	         by =  By.partialLinkText(value);
	        
	         break;
	     default:
	         throw new Exception("locator : " + selector + " not found!!!");
	 }
		return signUppassword();
}
public WebElement signUpBtn() throws Exception {
	 switch (selector) {
     case "id":
         by =  By.id(value);

         break;
     case "className":
         by =  By.className(value);
         break;
     case "tagName":
         by =  By.tagName(value);
         break;
     case "xpath":
         by =  By.xpath(value);
         break;
     case "cssSelector":
         by =  By.cssSelector(value);
         break;
     case "linkText":
         by =  By.linkText(value);
         break;
     case "name":
         by =  By.name(value);
         break;
     case "partialLinkText":
         by =  By.partialLinkText(value); 
         break;
     default:
         throw new Exception("locator : " + selector + " not found!!!");
 }
		return signUpBtn();
	}
}
	
//Admin123$

