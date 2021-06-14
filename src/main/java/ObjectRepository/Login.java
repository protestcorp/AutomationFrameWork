package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login 
{
	/*
   @FindBy(id="login2")
   WebElement LoginLink;
   
   @FindBy(id="loginusername")
   WebElement username;
   
   @FindBy(id="loginpassword")
   WebElement password;
   
   @FindBy(xpath="//button[@onclick='logIn()']")
   WebElement loginbtn;
   
   @FindBy(xpath="//a[@id='logout2']")
   WebElement logout;
   
   WebDriver driver;
   public Login(WebDriver driver) {
		
	 
	   PageFactory.initElements(driver,this);
	}
	
   
   public WebElement LogInLink() {
	   return LoginLink;
	  
   }
   
   public WebElement LogInUsername() {
	   return username;
   }
	   public WebElement LogInPassword() {
		   return password;
	      }
	   public WebElement LogInSignUpbtn() {
		   return loginbtn;
	   }
   public WebElement LogOut() {
	   return logout;
   }
 */
	
	 WebDriver driver;
	   public Login(WebDriver driver) {
			
		 
		   PageFactory.initElements(driver,this);
		}
		
		By by;

		String selector = "id";
		String value ="signin2";
	   
	   public WebElement LogInLink() throws Exception {
		
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
		   return LogInLink();
		  
	   }
	   
	   public WebElement LogInUsername() throws Exception {
		   
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
		   return LogInUsername();
	   }
		   public WebElement LogInPassword() throws Exception {
			   
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
			   return LogInPassword();
		      }
		   public WebElement LogInSignUpbtn() throws Exception {
			   
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
			   return LogInSignUpbtn();
		   }
	   public WebElement LogOut() throws Exception {
		   
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
		   return LogOut();
	   }
}

