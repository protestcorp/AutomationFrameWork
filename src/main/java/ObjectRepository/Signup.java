package ObjectRepository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CucumberOptionsss.PageObjectHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




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
	
	

	
	/*
	public WebElement signUpLink1() {
	
		
		//return signUpLink1;
	}
	
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
	
		

public class Signup extends PageObjectHandler{
	    
	    WebElement locator = null;    
	    WebDriver driver;
	    public Signup(WebDriver driver) {
	        // TODO Auto-generated constructor stub
	          this.driver = driver;
	        PageFactory.initElements(driver,this);

	 

	}
	    
	    PageObjectHandler poj = new PageObjectHandler();
	    
	    public WebElement signUpLink1() throws Exception {
	        
	        String selector = poj.getselector("Signup", "signUpLink1");
	        String value = poj.getvalue("Signup", "signUpLink1",0);
	        
	     switch (selector) {
	     case "id":
	         locator = driver.findElement(By.id(value));
	         //by =   By.id(value);
	         break;
	     case "className":
	         locator = driver.findElement(By.className(value));
	        // by =   By.className(value);
	         break;
	     case "tagName":
	         locator = driver.findElement(By.tagName(value));
	         //by =   By.tagName(value);
	         break;
	     case "xpath":
	         locator = driver.findElement(By.xpath(value));
	         //by =   By.xpath(value);
	         break;
	     case "cssSelector":
	         locator = driver.findElement(By.cssSelector(value));
	        // by =   By.cssSelector(value);
	         break;
	     case "linkText":
	         locator = driver.findElement(By.linkText(value));
	        // by =  By.linkText(value);
	         break;
	     case "name":
	         locator = driver.findElement(By.name(value));
	         //by =   By.name(value);
	         break;
	     case "partialLinkText":
	         locator = driver.findElement(By.partialLinkText(value));
	         //by =  By.partialLinkText(value);
	                 break;
	     default:
	         throw new Exception("locator : " + selector + " not found!!!");
	         
	             }
	     return locator;
	        }
	        
	        
	     

	 

	    public WebElement signUpusername1() throws Exception {
	        
	        String selector = poj.getselector("Signup", "signUpusername1");
	        String value = poj.getvalue("Signup", "signUpusername1", 0);
	        
	         switch (selector) {
	         case "id":
	             locator = driver.findElement(By.id(value));
	             //by =   By.id(value);
	             break;
	         case "className":
	             locator = driver.findElement(By.className(value));
	            // by =   By.className(value);
	             break;
	         case "tagName":
	             locator = driver.findElement(By.tagName(value));
	             //by =   By.tagName(value);
	             break;
	         case "xpath":
	             locator = driver.findElement(By.xpath(value));
	             //by =   By.xpath(value);
	             break;
	         case "cssSelector":
	             locator = driver.findElement(By.cssSelector(value));
	            // by =   By.cssSelector(value);
	             break;
	         case "linkText":
	             locator = driver.findElement(By.linkText(value));
	            // by =  By.linkText(value);
	             break;
	         case "name":
	             locator = driver.findElement(By.name(value));
	             //by =   By.name(value);
	             break;
	         case "partialLinkText":
	             locator = driver.findElement(By.partialLinkText(value));
	             //by =  By.partialLinkText(value);
	                     break;
	         default:
	             throw new Exception("locator : " + selector + " not found!!!");
	             
	                 }
	         return locator;
	            }
	    
	    
	    
	    public WebElement signUppassword1() throws Exception {
	        
	        String selector = poj.getselector("Signup", "signUppassword1");
	        String value = poj.getvalue("Signup", "signUppassword1", 0);
	        
	         switch (selector) {
	         case "id":
	             locator = driver.findElement(By.id(value));
	             //by =   By.id(value);
	             break;
	         case "className":
	             locator = driver.findElement(By.className(value));
	            // by =   By.className(value);
	             break;
	         case "tagName":
	             locator = driver.findElement(By.tagName(value));
	             //by =   By.tagName(value);
	             break;
	         case "xpath":
	             locator = driver.findElement(By.xpath(value));
	             //by =   By.xpath(value);
	             break;
	         case "cssSelector":
	             locator = driver.findElement(By.cssSelector(value));
	            // by =   By.cssSelector(value);
	             break;
	         case "linkText":
	             locator = driver.findElement(By.linkText(value));
	            // by =  By.linkText(value);
	             break;
	         case "name":
	             locator = driver.findElement(By.name(value));
	             //by =   By.name(value);
	             break;
	         case "partialLinkText":
	             locator = driver.findElement(By.partialLinkText(value));
	             //by =  By.partialLinkText(value);
	                     break;
	         default:
	             throw new Exception("locator : " + selector + " not found!!!");
	             
	                 }
	         return locator;
	            }    
	    
	        public WebElement signUpBtn1() throws Exception {
	    
	            String selector = poj.getselector("Signup", "signUpBtn1");
	            String value = poj.getvalue("Signup", "signUpBtn1", 0);
	    
	             switch (selector) {
	             case "id":
	                 locator = driver.findElement(By.id(value));
	                 //by =   By.id(value);
	                 break;
	             case "className":
	                 locator = driver.findElement(By.className(value));
	                // by =   By.className(value);
	                 break;
	             case "tagName":
	                 locator = driver.findElement(By.tagName(value));
	                 //by =   By.tagName(value);
	                 break;
	             case "xpath":
	                 locator = driver.findElement(By.xpath(value));
	                 //by =   By.xpath(value);
	                 break;
	             case "cssSelector":
	                 locator = driver.findElement(By.cssSelector(value));
	                // by =   By.cssSelector(value);
	                 break;
	             case "linkText":
	                 locator = driver.findElement(By.linkText(value));
	                // by =  By.linkText(value);
	                 break;
	             case "name":
	                 locator = driver.findElement(By.name(value));
	                 //by =   By.name(value);
	                 break;
	             case "partialLinkText":
	                 locator = driver.findElement(By.partialLinkText(value));
	                 //by =  By.partialLinkText(value);
	                         break;
	             default:
	                 throw new Exception("locator : " + selector + " not found!!!");
	                 
	                     }
	             return locator;
	                }
}
	
// Gmail -Admin123$
//github -Admin@protest1
/*
 *  <Username>shammu</Username>  
        <Password>shammu1234</Password>
        
        <Username>Dhanya</Username>  
        <Password>Dhanya1234</Password>
        
        <Username>kkghjkhjsgs</Username>  
        <Password>123456</Password>
        */
/*
 *  <Username>shammu</Username>  
        <Password>shammu1234</Password>
        
        <Username>Dhanya</Username>  
        <Password>Dhanya1234</Password>
        */
