package StepDefinitions;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
<<<<<<< HEAD
import org.junit.Ignore;
import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;




import CucumberOptionsss.DataXMLHandler;
import PageObject.CartPage;
import PageObject.ConfirmationWindow;
=======
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import Actions.ActionUtilities;

import CucumberOptionsss.DataXMLHandler;

import PageObject.CartPage;
import PageObject.ConfirmationWindow;

>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
import PageObject.LogInPage;
import PageObject.PlaceOrderWindow;
import PageObject.SignUpPage;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

<<<<<<< HEAD
import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import Actions.ActionUtilities;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


@RunWith(CucumberWithSerenity.class) 
public class StepDefnition extends ActionUtilities {
	@Managed(driver = "chrome")

=======
@RunWith(Cucumber.class)
public class StepDefnition extends ActionUtilities {
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982

	static String username;
	static String password;

<<<<<<< HEAD
	
	String Address;
	String Locator;
	

	
	
	
	 //public WebDriver driver;
	String url="https://www.demoblaze.com";

	 private static final Logger logger = LogManager.getLogger(StepDefnition.class.getName());
	 

	@Given("^Initialize browser$")
	//@Screenshots(afterEachStep=true)
	public void initialize_browser() throws IOException, InterruptedException {
		//driver = initializeDriver();
		Serenity.takeScreenshot();

    logger.info("Browser is initialized");
	}

	@And("^launching url$")
	//@Screenshots(afterEachStep=true)
	
	public void launching_url() throws InterruptedException {
		
		driver.get(url);
		Serenity.takeScreenshot();
	}
	


	  
	
	@When("^User register into application with username and password$")
	//@Screenshots(afterEachStep=true)
	@Pending
=======
	String Address;
	String Locator;

	public WebDriver driver;

	 private static final Logger logger = LogManager.getLogger(StepDefnition.class.getName());
	 
	 
	@Given("^Initialize browser$")
	public void initialize_browser() throws IOException, InterruptedException {
		driver = initializeDriver();
     logger.info("Browser is initialized");
	}

	@And("^launching url$")
	public void launching_url() throws InterruptedException {
		driver.get(url);
		logger.info("URL is launched");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^User register into application with username and password$")
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
	public void user_register_into_application_with_username_and_password() throws Exception {

		DataXMLHandler A1 = new DataXMLHandler();

		int signInlen = A1.getNumberOfTags("SignIn", "Username");

		for (int i = 0; i < signInlen; i++) {
			checkSignIn(A1.getData("SignIn", "Username", i), A1.getData("SignIn", "Password", i));
<<<<<<< HEAD
			
		}
		Serenity.takeScreenshot();
	}
	
	
	@Pending
	 public void checkSignIn(String username, String password) throws Exception {
=======
		}

	}
	
	public void checkSignIn(String username, String password) throws Exception {
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		
		SignUpPage su = new SignUpPage(driver);
		
		logger.info("Sign-in started");
<<<<<<< HEAD
		
		su.ClickOnSignupLink();
		logger.info("sign-up link is clicked");
		Serenity.takeScreenshot();
		
	
		su.ClickOnSignupUsernameTextbox();
		
		logger.info("sign-up username is clicked");
		
		
		
		su.ClearSignupUsernameTextbox();
		
=======

		su.ClickOnSignupLink();
		logger.info("sign-up link is clicked");
		

		su.ClickOnSignupUsernameTextbox();
		waitCall();
		logger.info("sign-up username is clicked");
		
		
		su.ClearSignupUsernameTextbox();
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("sign-up username is cleared");
		
		
		su.EnterTextToUserNameTextBox(username + getDate());
<<<<<<< HEAD
		
=======
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("sign-up username is entered");
		
		
		su.ClickOnSignupPwdTextbox();
<<<<<<< HEAD
		
=======
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("sign-up password is clicked");
		
		
		su.ClearSignupPwdTextbox();
<<<<<<< HEAD
		
=======
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("sign-up password is cleared");
		
		
		su.EnterTextToPwdTextBox(password);
<<<<<<< HEAD
	
		logger.info("sign-up password is entered");
		Serenity.takeScreenshot();
		
		su.ClickOnSignupButton();
	
		logger.info("sign-up button is clicked");
		//Serenity.takeScreenshot();
		
		
		AlertAccept();
		
		logger.info("sign-in session ended");
		//Serenity.takeScreenshot();
=======
	    waitCall();
		logger.info("sign-up password is entered");
		
		
		su.ClickOnSignupButton();
		waitCall();
		logger.info("sign-up button is clicked");
		
		
		driver.switchTo().alert().accept();
		waitCall();
		logger.info("sign-in session ended");
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		

	}

<<<<<<< HEAD
	
	@Pending

	 private String getDate() {
=======
	private String getDate() {
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982

		Date date = new Date();
		return date.toString();

	}

<<<<<<< HEAD
	
	@When("^User login with username and password$")
	//@Screenshots(afterEachStep=true)
	@Pending

=======
	@When("^User login with username and password$")
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
	public void user_login_with_username_and_password() throws Exception {

		DataXMLHandler A1 = new DataXMLHandler();
		int loginlen = A1.getNumberOfTags("Login", "Username");
		for (int i = 0; i < loginlen; i++) {
			checkLogIn(A1.getData("Login", "Username", i), A1.getData("Login", "Password", i));
<<<<<<< HEAD
			
		}
		Serenity.takeScreenshot();
	}

	//@Screenshots(afterEachStep=true)
	//@Ignored
	@Pending

	 public void checkLogIn(String username, String password) throws Exception {

=======
		}

	}

	public void checkLogIn(String username, String password) throws Exception {

>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		LogInPage lo = new LogInPage(driver);
		logger.info("Log-in started");
		
		lo.ClickOnLogInLink();
		logger.info("log-in link is clicked");
<<<<<<< HEAD
		Serenity.takeScreenshot();
		
	
		lo.ClickOnLogInUsernameTextbox();
		
=======
		
	
		lo.ClickOnLogInUsernameTextbox();
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("log-in username is clicked");
		
		
		lo.ClearLogInUsernameTextbox();
<<<<<<< HEAD
		
=======
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("log-in username is cleared");
		

		lo.EnterTextToUserNameTextBox(username);
<<<<<<< HEAD
		
=======
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("log-in username is entered");
		

		lo.ClickOnLogInPwdTextbox();
<<<<<<< HEAD
	
		logger.info("log-in password is clicked");
		
		
		lo.ClearLogInPwdTextbox();
		
		logger.info("log-in password is cleared");
		

		lo.EnterTextToPwdTextBox(password);
	
		logger.info("log-in password is entered");
		Serenity.takeScreenshot();
		
		lo.ClickOnLogInButton();
		
		logger.info("log-in button is clicked");
		Serenity.takeScreenshot();
		
		lo.ClickOnLogOutButton();
		
		logger.info("log-out button is clicked");
		Serenity.takeScreenshot();

	}

	

	 
	 
	@Given("Initializee browser")
	//@Screenshots(afterEachStep=true)
	public void initializee_browser() throws IOException, InterruptedException {
		
		//driver = initializeDriver();
	
		//@Managed(driver = "firefox")
		//WebDriver driver;
		Serenity.takeScreenshot();
	
	}

	  
=======
		waitCall();
		logger.info("log-in password is clicked");
		
		
		lo.ClearLogInPwdTextbox();
		waitCall();
		logger.info("log-in password is cleared");
		

		lo.EnterTextToPwdTextBox(password);
		waitCall();
		logger.info("log-in password is entered");
		
		lo.ClickOnLogInButton();
		waitCall();
		logger.info("log-in button is clicked");
	
		lo.ClickOnLogOutButton();
		waitCall();
		logger.info("log-out button is clicked");

	}

	@And("^Home page is displayed$")
	public void home_page_is_displayed() throws Exception {
		/*
		 * HomePage hm = new HomePage(driver);
		 * System.out.println(hm.clickOnNavBar().getText()); Assert.assertTrue(true);
		 */
		driver.close();
		Thread.sleep(4000);
	}

	@Given("Initializee browser")
	public void initializee_browser() throws IOException, InterruptedException {
		
		driver = initializeDriver();
	
	}

	@Given("launching urll")
	public void launching_urll() {
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@When("^User login with Credentials and purchase a product$")
	public void user_login_with_credentials_and_purchase_a_product() throws Throwable {

		DataXMLHandler A1 = new DataXMLHandler();

		int signInlen = A1.getNumberOfTags("SignInn", "Username");

		int loginlen = A1.getNumberOfTags("Loginn", "Username");

		int paylen = A1.getNumberOfTags("PaymentData", "name");

		for (int i = 0; i < signInlen; i++) {
			checkSignInn(A1.getData("SignInn", "Username", i), A1.getData("SignInn", "Password", i));
		}

		for (int i = 0; i < loginlen; i++) {
			checkLogInn(A1.getData("Loginn", "Username", i), A1.getData("Loginn", "Password", i));
		}

		for (int i = 0; i < paylen; i++) {
			PaymentProcess(A1.getData("PaymentData", "name", i), A1.getData("PaymentData", "country", i),
					A1.getData("PaymentData", "city", i), A1.getData("PaymentData", "creditcard", i),
					A1.getData("PaymentData", "month", i), A1.getData("PaymentData", "year", i));
		}

	}

	public void checkSignInn(String username, String password) throws Exception {

		SignUpPage su = new SignUpPage(driver);
		logger.info("Sign-in started");

		su.ClickOnSignupLink();
		logger.info("sign-up link is clicked");
		

		su.ClickOnSignupUsernameTextbox();
		waitCall();
		logger.info("sign-up username is clicked");
		
		
		su.ClearSignupUsernameTextbox();
		waitCall();
		logger.info("sign-up username is cleared");
		
		
		su.EnterTextToUserNameTextBox(username + getDate());
		waitCall();
		logger.info("sign-up username is entered");
		
		
		su.ClickOnSignupPwdTextbox();
		waitCall();
		logger.info("sign-up password is clicked");
		
		
		su.ClearSignupPwdTextbox();
		logger.info("sign-up password is cleared");
		
		
		su.EnterTextToPwdTextBox(password);
		waitCall();
		logger.info("sign-up password is entered");
		
		
		su.ClickOnSignupButton();
		waitCall();
		logger.info("sign-up button is clicked");
		
		
		driver.switchTo().alert().accept();
		waitCall();
		logger.info("sign-in session ended");
		
	}

	public void checkLogInn(String username, String password) throws Exception {
		LogInPage lo = new LogInPage(driver);
		logger.info("Log-in started");
		

		lo.ClickOnLogInLink();
		logger.info("log-in link is clicked");
		
	
		lo.ClickOnLogInUsernameTextbox();
		waitCall();
		logger.info("log-in username is clicked");
	
		
		lo.ClearLogInUsernameTextbox();
		waitCall();
		logger.info("log-in username is cleared");
		

		lo.EnterTextToUserNameTextBox(username);
		waitCall();
		logger.info("log-in username is entered");
		

		lo.ClickOnLogInPwdTextbox();
		waitCall();
		logger.info("log-in password is clicked");
		
		
		lo.ClearLogInPwdTextbox();
		waitCall();
		logger.info("log-in password is cleared");
	

		lo.EnterTextToPwdTextBox(password);
		waitCall();
		logger.info("log-in password is entered");
		

		lo.ClickOnLogInButton();
		waitCall();
		logger.info("log-in button is clicked");
	
		
		
		lo.Product();
		waitCall();
		logger.info("Product is selected");
	
		

		CartPage ca = new CartPage(driver);
		ca.ClickOnAddCartButton();
		waitCall();
		logger.info("Addcart button is clicked");
		

		driver.switchTo().alert().accept();
		waitCall();
		logger.info("alert accept");
		

		ca.ClickOnCartLink();
		waitCall();
		logger.info("Cart link is clicked");
		

		ca.ClickOnPlaceOrderButton();
		waitCall();
		logger.info("PlaceOrder button is clicked");
		
	}

	public void PaymentProcess(String name, String country, String city, String creditcard, String month, String year)
			throws InterruptedException {
		PlaceOrderWindow pl = new PlaceOrderWindow(driver);

		pl.ClickOnPlaceOrderUsernameTextbox();
		waitCall();
		logger.info("PlaceOrder username is clicked");
		

		pl.EnterTextToName(name);
		waitCall();
		logger.info("PlaceOrder username is entered");
		

		pl.ClickOnPlaceOrderCountryTextbox();
		waitCall();
		logger.info("PlaceOrder country is clicked");
		

		pl.EnterTextToCountry(country);
		waitCall();
		logger.info("PlaceOrder country is entered");
		

		pl.ClickOnPlaceOrderCityTextbox();
		waitCall();
		logger.info("PlaceOrder city is clicked");
		

		pl.EnterTextToCity(city);
		waitCall();
		logger.info("PlaceOrder city is entered");
		

		pl.ClickOnPlaceOrderCreditCardTextbox();
		waitCall();
		logger.info("PlaceOrder creditcard is clicked");
		

		pl.EnterTextToCreditCard(creditcard);
		waitCall();
		logger.info("PlaceOrder creditcard is entered");
		

		pl.ClickOnPlaceOrderMonthTextbox();
		waitCall();
		logger.info("PlaceOrder month is clicked");
		

		pl.EnterTextToMonth(month);
		waitCall();
		logger.info("PlaceOrder month is entered");
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
	
	@Given("launching urll")
	//@Screenshots(afterEachStep=true)
	public void launching_urll() {
		
		driver.get(url);
		
		driver.manage().window().maximize();
		Serenity.takeScreenshot();
		
	}

<<<<<<< HEAD
	
	@When("^User login with Credentials and purchase a product$")
	//@Screenshots(afterEachStep=true)
	public void user_login_with_credentials_and_purchase_a_product() throws Throwable {

		DataXMLHandler A1 = new DataXMLHandler();

		int signInlen = A1.getNumberOfTags("SignInn", "Username");

		int loginlen = A1.getNumberOfTags("Loginn", "Username");

		int paylen = A1.getNumberOfTags("PaymentData", "name");

		for (int i = 0; i < signInlen; i++) {
			checkSignInn(A1.getData("SignInn", "Username", i), A1.getData("SignInn", "Password", i));
		}

		for (int i = 0; i < loginlen; i++) {
			checkLogInn(A1.getData("Loginn", "Username", i), A1.getData("Loginn", "Password", i));
		}

		for (int i = 0; i < paylen; i++) {
			PaymentProcess(A1.getData("PaymentData", "name", i), A1.getData("PaymentData", "country", i),
					A1.getData("PaymentData", "city", i), A1.getData("PaymentData", "creditcard", i),
					A1.getData("PaymentData", "month", i), A1.getData("PaymentData", "year", i));
		}
		Serenity.takeScreenshot();

	}

	
	//@Screenshots(afterEachStep=true)
	public void checkSignInn(String username, String password) throws Exception {

		SignUpPage su = new SignUpPage(driver);
		logger.info("Sign-in started");
		

		su.ClickOnSignupLink();
		logger.info("sign-up link is clicked");
		Serenity.takeScreenshot();
		

		su.ClickOnSignupUsernameTextbox();
		
		logger.info("sign-up username is clicked");
		
		
		su.ClearSignupUsernameTextbox();
		
		logger.info("sign-up username is cleared");
		
		
		su.EnterTextToUserNameTextBox(username + getDate());
		
		logger.info("sign-up username is entered");
		
		
		su.ClickOnSignupPwdTextbox();
	
		logger.info("sign-up password is clicked");
		
		
		
		su.ClearSignupPwdTextbox();
	
		logger.info("sign-up password is cleared");
		
		
		su.EnterTextToPwdTextBox(password);
		
		logger.info("sign-up password is entered");
		Serenity.takeScreenshot();
		
		su.ClickOnSignupButton();
		
		logger.info("sign-up button is clicked");
		
		
		AlertAccept();
	
		logger.info("sign-in session ended");
		
		
	}

	//@Screenshots(afterEachStep=true)
	public void checkLogInn(String username, String password) throws Exception {
		LogInPage lo = new LogInPage(driver);
		logger.info("Log-in started");
		

		lo.ClickOnLogInLink();
		
		logger.info("log-in link is clicked");
		Serenity.takeScreenshot();
		
	
		lo.ClickOnLogInUsernameTextbox();
	
		logger.info("log-in username is clicked");
	
		
		lo.ClearLogInUsernameTextbox();
	
		logger.info("log-in username is cleared");
		

		lo.EnterTextToUserNameTextBox(username);
		
		logger.info("log-in username is entered");
		

		lo.ClickOnLogInPwdTextbox();
		
		logger.info("log-in password is clicked");
		
		
		lo.ClearLogInPwdTextbox();
		
		logger.info("log-in password is cleared");
	

		lo.EnterTextToPwdTextBox(password);
	
		logger.info("log-in password is entered");
		Serenity.takeScreenshot();
		

		lo.ClickOnLogInButton();
	
		logger.info("log-in button is clicked");
	
		
		 waitForPageLoad();
		lo.Product();
	
		logger.info("Product is selected");
		 waitForPageLoad();
		Serenity.takeScreenshot();
		

		CartPage ca = new CartPage(driver);
		ca.ClickOnAddCartButton();
	
		logger.info("Addcart button is clicked");
		
		

		AlertAccept();
	 
		logger.info("alert accept");
		

		ca.ClickOnCartLink();
		
		logger.info("Cart link is clicked");
		 waitForPageLoad();
		

		ca.ClickOnPlaceOrderButton();
	
		logger.info("PlaceOrder button is clicked");
		Serenity.takeScreenshot();
		
	}


	//@Screenshots(afterEachStep=true)
	public void PaymentProcess(String name, String country, String city, String creditcard, String month, String year)
			throws InterruptedException {
		PlaceOrderWindow pl = new PlaceOrderWindow(driver);

		pl.ClickOnPlaceOrderUsernameTextbox();
		
		logger.info("PlaceOrder username is clicked");
		Serenity.takeScreenshot();
		

		pl.EnterTextToName(name);
		
		logger.info("PlaceOrder username is entered");
		

		pl.ClickOnPlaceOrderCountryTextbox();
	
		logger.info("PlaceOrder country is clicked");
		

		pl.EnterTextToCountry(country);
		
		logger.info("PlaceOrder country is entered");
		

		pl.ClickOnPlaceOrderCityTextbox();
	
		logger.info("PlaceOrder city is clicked");
		

		pl.EnterTextToCity(city);
		
		logger.info("PlaceOrder city is entered");
		

		pl.ClickOnPlaceOrderCreditCardTextbox();
		
		logger.info("PlaceOrder creditcard is clicked");
		

		pl.EnterTextToCreditCard(creditcard);
		
		logger.info("PlaceOrder creditcard is entered");
		

		pl.ClickOnPlaceOrderMonthTextbox();
		
		logger.info("PlaceOrder month is clicked");
		

		pl.EnterTextToMonth(month);
	
		logger.info("PlaceOrder month is entered");
	

		pl.ClickOnPlaceOrderYearTextbox();
		
=======
		pl.ClickOnPlaceOrderYearTextbox();
		waitCall();
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
		logger.info("PlaceOrder year is clicked");
		

		pl.EnterTextToYear(year);
<<<<<<< HEAD
		
		logger.info("PlaceOrder year is entered");
		Serenity.takeScreenshot();
		

		pl.ClickOnPurchaseButton();
		
		logger.info("Purchase button is clicked");
		
		
		

		ConfirmationWindow co = new ConfirmationWindow(driver);
		 waitForPageLoad();
		 Serenity.takeScreenshot();
		logger.info("Product has been scheduled for shipping");
		co.ClickOnOkButton();
		 waitForPageLoad();
		

	}
	
	@Given("Initialize browserrr ")
    public void initialize_browserrr() throws IOException, InterruptedException {
		//driver = initializeDriver();
		Serenity.takeScreenshot();

    logger.info("Browser is initialized");
    throw new io.cucumber.java.PendingException();

	}



	
	
	
	
	
	
	
	 @And("launching urlll ")
    public void launching_urlll() throws InterruptedException {
		
		driver.get(url);
		Serenity.takeScreenshot();
	}
	


	  
	
	 @When("User register into application with username and passworddd")
	    public void user_register_into_application_with_username_and_passworddd() throws Exception {

		DataXMLHandler A1 = new DataXMLHandler();

		int signInlen = A1.getNumberOfTags("SignIn", "Username");

		for (int i = 0; i < signInlen; i++) {
			checkSignInnn(A1.getData("SignIn", "Username", i), A1.getData("SignIn", "Password", i));
			
		}
		Serenity.takeScreenshot();
	}
	
	//@Screenshots(afterEachStep=true)
	 public void checkSignInnn(String username, String password) throws Exception {
		
		SignUpPage su = new SignUpPage(driver);
		
		logger.info("Sign-in started");

		su.ClickOnSignupLink();
		logger.info("sign-up link is clicked");
		Serenity.takeScreenshot();
		

		su.ClickOnSignupUsernameTextbox();
		
		logger.info("sign-up username is clicked");
		
		
		
		su.ClearSignupUsernameTextbox();
		
		logger.info("sign-up username is cleared");
		
		
		su.EnterTextToUserNameTextBox(username + getDate());
		
		logger.info("sign-up username is entered");
		
		
		su.ClickOnSignupPwdTextbox();
		
		logger.info("sign-up password is clicked");
		
		
		su.ClearSignupPwdTextbox();
		
		logger.info("sign-up password is cleared");
		
		
		//su.EnterTextToPwdTextBox(password);
	
		logger.info("sign-up password is entered");
		Serenity.takeScreenshot();
		
		su.ClickOnSignupButton();
	
		logger.info("sign-up button is clicked");
		//Serenity.takeScreenshot();
		
		
		AlertAccept();
		
		logger.info("sign-in session ended");
		//Serenity.takeScreenshot();
		

	}
	
=======
		waitCall();
		logger.info("PlaceOrder year is entered");
		

		pl.ClickOnPurchaseButton();
		waitCall();
		logger.info("Purchase button is clicked");
		

		ConfirmationWindow co = new ConfirmationWindow(driver);
		waitCall();
		logger.info("Product has been scheduled for shipping");
		co.ClickOnOkButton();

	}

>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
}
