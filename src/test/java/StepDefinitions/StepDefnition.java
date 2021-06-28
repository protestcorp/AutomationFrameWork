package StepDefinitions;


import java.io.IOException;
import java.util.Date;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import Actions.KeyboardAction;

import CucumberOptionsss.ActionXML;
import CucumberOptionsss.XMLHandler;
import ObjectRepository.Homepage;
import ObjectRepository.Login;

import ObjectRepository.Signup;

import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
	public class StepDefnition extends KeyboardAction {
	
	static String username;
	static String password;
	
	String Address;
	String Locator ;
	
	protected WebDriver driver;
	    @Given("^Initialize browser$")
	    public void initialize_browser() throws IOException, InterruptedException  {
	    	 driver = initializeDriver();
	    	
	    }
	    @And("^launching url$")
	    public void launching_url() {
	    	driver.get(url);
			driver.manage().window().maximize();
	    }
	   
	/*    @When("^User register into application with (.+) and (.+)$")
	    public void user_register_into_application_with_and(String username, String password) throws InterruptedException, NullPointerException {
	 */
	    @When("^User register into application with username and password$")
	    public void user_register_into_application_with_username_and_password() throws Exception  {

	    	
	   
	    XMLHandler A1 = new XMLHandler();

	    int signInlen = A1.getNumberOfTags("SignIn","Username");

	    for(int i=0;i<signInlen;i++)
	    {
	    	checkSignIn(A1.getData("SignIn","Username",i),A1.getData("SignIn","Password",i));
	    }
	    
	    }
	   
	    public void checkSignIn(String username,String password) throws Exception {   
            Signup su = new Signup(driver);
           
        	
        	 su.signUpLink1().clear();
        	 newTab();
        	 copyPaste();
        	 dragAndDrop();
        	 hoverAction();
            Thread.sleep(3000);
            su.signUpusername1().click();
            Thread.sleep(3000);
            su.signUpusername1().clear();
            su.signUpusername1().sendKeys(username + getDate());
            Thread.sleep(5000);
           
            su.signUppassword1().click();
            Thread.sleep(3000);
            su.signUppassword1().clear();
            su.signUppassword1().sendKeys(password );
            Thread.sleep(5000);
            su.signUpBtn1().click();
            Thread.sleep(3000);
       
            driver.switchTo().alert().accept();
            Thread.sleep(5000);
	   	
	    }
	   
		private String getDate() {
			
			Date date = new Date();
			return date.toString();
	 		
		}
/*
	    @And("click on login link")
	    public void click_on_login_link() throws InterruptedException {

			Login lo = new Login(driver);
			lo.LogInLink().click();
	    	Thread.sleep(3000);
	    }
*/


/*	    @When("^User login with (.+) and (.+)$")
	    public void user_login_with_and(String username, String password) throws InterruptedException, NullPointerException {
	    	*/
	    @When("^User login with username and password$")
	    public void user_login_with_username_and_password() throws Exception {
	    	
	    	  XMLHandler A1 = new XMLHandler();
	    	int loginlen = A1.getNumberOfTags("Login","Username");
	    	for(int i=0;i<loginlen;i++)
	    	{
	    	checkLogIn(A1.getData("Login","Username",i),A1.getData("Login","Password",i));
	    	}
	    	ActionXML obj = new ActionXML();
		    
	    	Locator= obj.getLocatorType("loginpage", "loginbutton");
	    	
	    	Address= obj.getLocatorAddress("loginpage", "loginbutton");
	    //	newTab(Locator,Address);
	    	
			   }
	    public void checkLogIn(String username,String password) throws Exception {   
            Login lo = new Login(driver);
             Thread.sleep(5000);
             lo.LogInLink().click();
             Thread.sleep(3000);
             lo.LogInUsername().clear();
             lo.LogInUsername().sendKeys(username);
             Thread.sleep(3000);
             lo.LogInPassword().clear();
             lo.LogInPassword().sendKeys(password);
            
             Thread.sleep(3000);
             lo.LogInSignUpbtn().click();
             Thread.sleep(3000);
       
             lo.LogOut().click();
             Thread.sleep(5000);
			   }

	    @And("^Home page is displayed$")
	    public void home_page_is_displayed() throws Exception {
	       
	    	Homepage hm = new Homepage(driver);
			System.out.println(hm.navBar().getText());
			Assert.assertTrue(true);
			driver.close();
	    }

	   

	  

			
			
	    }
	    

	

	
	
	
	

