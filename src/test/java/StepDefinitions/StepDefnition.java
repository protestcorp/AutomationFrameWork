package StepDefinitions;

import java.io.IOException;
import java.util.Date;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Actions.ActionUtilities;

import CucumberOptionsss.DataXMLHandler;

import PageObject.CartPage;
import PageObject.ConfirmationWindow;

import PageObject.LogInPage;
import PageObject.PlaceOrderWindow;
import PageObject.SignUpPage;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefnition extends ActionUtilities {

	static String username;
	static String password;

	String Address;
	String Locator;

	public WebDriver driver;

	@Given("^Initialize browser$")
	public void initialize_browser() throws IOException, InterruptedException {
		driver = initializeDriver();

	}

	@And("^launching url$")
	public void launching_url() {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("^User register into application with username and password$")
	public void user_register_into_application_with_username_and_password() throws Exception {

		DataXMLHandler A1 = new DataXMLHandler();

		int signInlen = A1.getNumberOfTags("SignIn", "Username");

		for (int i = 0; i < signInlen; i++) {
			checkSignIn(A1.getData("SignIn", "Username", i), A1.getData("SignIn", "Password", i));
		}

	}

	public void checkSignIn(String username, String password) throws Exception {

		SignUpPage su = new SignUpPage(driver);

		su.ClickOnSignupLink();
		
		su.ClearSignupUsernameTextbox();
		Thread.sleep(2000);

		su.ClickOnSignupUsernameTextbox();
		Thread.sleep(1000);
		su.ClearSignupUsernameTextbox();
		Thread.sleep(2000);
		su.EnterTextToUserNameTextBox(username + getDate());
		Thread.sleep(1000);
		su.ClickOnSignupPwdTextbox();
		Thread.sleep(2000);
		su.ClearSignupPwdTextbox();

		Thread.sleep(2000);
		su.EnterTextToPwdTextBox(password);
		Thread.sleep(1000);
		su.ClickOnSignupButton();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

	}

	private String getDate() {

		Date date = new Date();
		return date.toString();

	}

	@When("^User login with username and password$")
	public void user_login_with_username_and_password() throws Exception {

		DataXMLHandler A1 = new DataXMLHandler();
		int loginlen = A1.getNumberOfTags("Login", "Username");
		for (int i = 0; i < loginlen; i++) {
			checkLogIn(A1.getData("Login", "Username", i), A1.getData("Login", "Password", i));
		}

	}

	public void checkLogIn(String username, String password) throws Exception {

		LogInPage lo = new LogInPage(driver);
		Thread.sleep(2000);

		lo.ClickOnLogInLink();
		Thread.sleep(2000);

		lo.ClickOnLogInUsernameTextbox();
		Thread.sleep(1000);
		lo.ClearLogInUsernameTextbox();
		Thread.sleep(2000);

		lo.EnterTextToUserNameTextBox(username);
		Thread.sleep(1000);

		lo.ClickOnLogInPwdTextbox();
		Thread.sleep(2000);
		lo.ClearLogInPwdTextbox();
		Thread.sleep(2000);

		lo.EnterTextToPwdTextBox(password);
		Thread.sleep(1000);

		lo.ClickOnLogInButton();
		Thread.sleep(3000);
		lo.ClickOnLogOutButton();

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

		su.ClickOnSignupLink();
		su.ClearSignupUsernameTextbox();
		Thread.sleep(3000);

		su.ClickOnSignupUsernameTextbox();
		Thread.sleep(3000);
		su.ClearSignupUsernameTextbox();
		Thread.sleep(3000);
		su.EnterTextToUserNameTextBox(username + getDate());
		Thread.sleep(3000);
		su.ClickOnSignupPwdTextbox();
		Thread.sleep(3000);
		su.ClearSignupPwdTextbox();

		Thread.sleep(3000);
		su.EnterTextToPwdTextBox(password);
		Thread.sleep(3000);
		su.ClickOnSignupButton();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

	public void checkLogInn(String username, String password) throws Exception {
		LogInPage lo = new LogInPage(driver);
		Thread.sleep(3000);

		lo.ClickOnLogInLink();
		Thread.sleep(3000);

		lo.ClickOnLogInUsernameTextbox();
		Thread.sleep(3000);
		lo.ClearLogInUsernameTextbox();
		Thread.sleep(3000);

		lo.EnterTextToUserNameTextBox(username);
		Thread.sleep(3000);

		lo.ClickOnLogInPwdTextbox();
		Thread.sleep(3000);
		lo.ClearLogInPwdTextbox();
		Thread.sleep(3000);

		lo.EnterTextToPwdTextBox(password);
		Thread.sleep(3000);

		lo.ClickOnLogInButton();
		Thread.sleep(3000);

		lo.Product();
		Thread.sleep(3000);
		

		CartPage ca = new CartPage(driver);
		ca.ClickOnAddCartButton();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		Thread.sleep(4000);

		ca.ClickOnCartLink();
		Thread.sleep(2000);

		ca.ClickOnPlaceOrderButton();
		Thread.sleep(2000);
	}

	public void PaymentProcess(String name, String country, String city, String creditcard, String month, String year)
			throws InterruptedException {
		PlaceOrderWindow pl = new PlaceOrderWindow(driver);

		pl.ClickOnPlaceOrderUsernameTextbox();
		Thread.sleep(2000);

		pl.EnterTextToName(name);
		Thread.sleep(2000);

		pl.ClickOnPlaceOrderCountryTextbox();
		Thread.sleep(2000);

		pl.EnterTextToCountry(country);
		Thread.sleep(2000);

		pl.ClickOnPlaceOrderCityTextbox();
		Thread.sleep(2000);

		pl.EnterTextToCity(city);
		Thread.sleep(2000);

		pl.ClickOnPlaceOrderCreditCardTextbox();
		Thread.sleep(2000);

		pl.EnterTextToCreditCard(creditcard);
		Thread.sleep(2000);

		pl.ClickOnPlaceOrderMonthTextbox();
		Thread.sleep(2000);

		pl.EnterTextToMonth(month);
		Thread.sleep(2000);

		pl.ClickOnPlaceOrderYearTextbox();
		Thread.sleep(2000);

		pl.EnterTextToYear(year);
		Thread.sleep(2000);

		pl.ClickOnPurchaseButton();
		Thread.sleep(2000);

		ConfirmationWindow co = new ConfirmationWindow(driver);
		co.ClickOnOkButton();

	}

}
