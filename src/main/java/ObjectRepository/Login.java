package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

<<<<<<< HEAD



=======
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982

public class Login  {
	/*
	 * @FindBy(id="login2") WebElement LoginLink;
	 * 
	 * @FindBy(id="loginusername") WebElement username;
	 * 
	 * @FindBy(id="loginpassword") WebElement password;
	 * 
	 * @FindBy(xpath="//button[@onclick='logIn()']") WebElement loginbtn;
	 * 
	 * @FindBy(xpath="//a[@id='logout2']") WebElement logout;
	 * 
	 * WebDriver driver; public Login(WebDriver driver) {
	 * 
	 * 
	 * PageFactory.initElements(driver,this); }
	 * 
	 * 
	 * public WebElement LogInLink() { return LoginLink;
	 * 
	 * }
	 * 
	 * public WebElement LogInUsername() { return username; } public WebElement
	 * LogInPassword() { return password; } public WebElement LogInSignUpbtn() {
	 * return loginbtn; } public WebElement LogOut() { return logout; }
	 */

	WebElement locator = null;
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	PageObjectHandler poj = new PageObjectHandler();

	public WebElement LogInLink() throws Exception {
		String selector = poj.getselector("Login", "LogInLink");
		String value = poj.getvalue("Login", "LogInLink", 0);
		switch (selector) {
		case "id":
			locator = driver.findElement(By.id(value));
			// by = By.id(value);
			break;
		case "className":
			locator = driver.findElement(By.className(value));
			// by = By.className(value);
			break;
		case "tagName":
			locator = driver.findElement(By.tagName(value));
			// by = By.tagName(value);
			break;
		case "xpath":
			locator = driver.findElement(By.xpath(value));
			// by = By.xpath(value);
			break;
		case "cssSelector":
			locator = driver.findElement(By.cssSelector(value));
			// by = By.cssSelector(value);
			break;
		case "linkText":
			locator = driver.findElement(By.linkText(value));
			// by = By.linkText(value);
			break;
		case "name":
			locator = driver.findElement(By.name(value));
			// by = By.name(value);
			break;
		case "partialLinkText":
			locator = driver.findElement(By.partialLinkText(value));
			// by = By.partialLinkText(value);
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		return locator;
	}

	public WebElement LogInUsername() throws Exception {
		String selector = poj.getselector("Login", "LogInUsername");
		String value = poj.getvalue("Login", "LogInUsername", 0);
		switch (selector) {
		case "id":
			locator = driver.findElement(By.id(value));
			// by = By.id(value);
			break;
		case "className":
			locator = driver.findElement(By.className(value));
			// by = By.className(value);
			break;
		case "tagName":
			locator = driver.findElement(By.tagName(value));
			// by = By.tagName(value);
			break;
		case "xpath":
			locator = driver.findElement(By.xpath(value));
			// by = By.xpath(value);
			break;
		case "cssSelector":
			locator = driver.findElement(By.cssSelector(value));
			// by = By.cssSelector(value);
			break;
		case "linkText":
			locator = driver.findElement(By.linkText(value));
			// by = By.linkText(value);
			break;
		case "name":
			locator = driver.findElement(By.name(value));
			// by = By.name(value);
			break;
		case "partialLinkText":
			locator = driver.findElement(By.partialLinkText(value));
			// by = By.partialLinkText(value);
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		return locator;
	}

	public WebElement LogInPassword() throws Exception {
		String selector = poj.getselector("Login", "LogInPassword");
		String value = poj.getvalue("Login", "LogInPassword", 0);
		switch (selector) {
		case "id":
			locator = driver.findElement(By.id(value));
			// by = By.id(value);
			break;
		case "className":
			locator = driver.findElement(By.className(value));
			// by = By.className(value);
			break;
		case "tagName":
			locator = driver.findElement(By.tagName(value));
			// by = By.tagName(value);
			break;
		case "xpath":
			locator = driver.findElement(By.xpath(value));
			// by = By.xpath(value);
			break;
		case "cssSelector":
			locator = driver.findElement(By.cssSelector(value));
			// by = By.cssSelector(value);
			break;
		case "linkText":
			locator = driver.findElement(By.linkText(value));
			// by = By.linkText(value);
			break;
		case "name":
			locator = driver.findElement(By.name(value));
			// by = By.name(value);
			break;
		case "partialLinkText":
			locator = driver.findElement(By.partialLinkText(value));
			// by = By.partialLinkText(value);
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		return locator;
	}

	public WebElement LogInSignUpbtn() throws Exception {
		String selector = poj.getselector("Login", "LogInSignUpbtn");
		String value = poj.getvalue("Login", "LogInSignUpbtn", 0);
		switch (selector) {
		case "id":
			locator = driver.findElement(By.id(value));
			// by = By.id(value);
			break;
		case "className":
			locator = driver.findElement(By.className(value));
			// by = By.className(value);
			break;
		case "tagName":
			locator = driver.findElement(By.tagName(value));
			// by = By.tagName(value);
			break;
		case "xpath":
			locator = driver.findElement(By.xpath(value));
			// by = By.xpath(value);
			break;
		case "cssSelector":
			locator = driver.findElement(By.cssSelector(value));
			// by = By.cssSelector(value);
			break;
		case "linkText":
			locator = driver.findElement(By.linkText(value));
			// by = By.linkText(value);
			break;
		case "name":
			locator = driver.findElement(By.name(value));
			// by = By.name(value);
			break;
		case "partialLinkText":
			locator = driver.findElement(By.partialLinkText(value));
			// by = By.partialLinkText(value);
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		return locator;
	}

	public WebElement LogOut() throws Exception {
		String selector = poj.getselector("Login", "LogOut");
		String value = poj.getvalue("Login", "LogOut", 0);
		switch (selector) {
		case "id":
			locator = driver.findElement(By.id(value));
			// by = By.id(value);
			break;
		case "className":
			locator = driver.findElement(By.className(value));
			// by = By.className(value);
			break;
		case "tagName":
			locator = driver.findElement(By.tagName(value));
			// by = By.tagName(value);
			break;
		case "xpath":
			locator = driver.findElement(By.xpath(value));
			// by = By.xpath(value);
			break;
		case "cssSelector":
			locator = driver.findElement(By.cssSelector(value));
			// by = By.cssSelector(value);
			break;
		case "linkText":
			locator = driver.findElement(By.linkText(value));
			// by = By.linkText(value);
			break;
		case "name":
			locator = driver.findElement(By.name(value));
			// by = By.name(value);
			break;
		case "partialLinkText":
			locator = driver.findElement(By.partialLinkText(value));
			// by = By.partialLinkText(value);
			break;
		default:
			throw new Exception("locator : " + selector + " not found!!!");
		}
		return locator;
	}
}
