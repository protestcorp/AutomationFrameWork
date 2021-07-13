package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	/*
	@FindBy(xpath="//div[@id='navbarExample']")
	WebElement navbar;
	
	
	@FindBy(xpath = "//li[@class='nav-item active']//a")
	WebElement homeLink;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	WebElement contactLink;

	@FindBy(xpath = "//button[@class='close']//span[1]")
	WebElement contactClose;

	@FindBy(xpath = "//a[contains(text(),'About us')]")
	WebElement aboutLink;
	
	@FindBy(xpath = "//div[@id='videoModal']/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement aboutclose;

	@FindBy(id = "cartur")
	WebElement cartLink;

	@FindBy(id = "login2")
	WebElement LoginLink;
	
	@FindBy(xpath = "//body/div[@id='logInModal']/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement loginquit;

	@FindBy(id = "signin2")
	WebElement signUpLink1;
	
	@FindBy(xpath = "//div[@id='signInModal']/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement signupquit;
	
	

	

	WebDriver driver;
 
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement HomePageLink() {
		
	
		By by = By.id("someId");
		WebElement e = driver.findElement(by);
		return homeLink;
	}

	
	public WebElement ContactPageLink() {

		return contactLink;
	}

	
	public WebElement ContactCloseBtn() {
		return contactClose;
	}

	
	public WebElement AboutPageLink() {

		return aboutLink;
	}

	
	public WebElement AboutCloseBtn() {
		return aboutclose;
	}


	public WebElement CartPageLink() {

		return cartLink;
	}


	public WebElement signUpLink1() {

		return signUpLink1;
	}

	
	public WebElement signUpQuitbtn() {
		return signupquit;
	}

	
	public WebElement LogInLink() {
		return LoginLink;

	}
	
	public WebElement logInQuitbtn() {
		
		return loginquit;
	}

	public WebElement navBar() {
		return navbar;
	}
*/

	WebDriver driver;
	 
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	By by;

	String selector = "id";
	String value ="signin2";
	
	public WebElement navBar() throws Exception {
		
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
		return navBar();
	}
}
