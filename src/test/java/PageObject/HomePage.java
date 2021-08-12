package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;

import CucumberOptionsss.PageObjectHandler;

public class HomePage extends ActionUtilities {

	PageObjectHandler act = new PageObjectHandler();
	
	 WebElement locator = null;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactTab() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClickOnContactTab() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hoverOnContactTab() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void contextClickOnContactTab() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTextOnContactTab() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnContactTab() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnAboutUsTab() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClickOnAboutUsTab() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hoverOnAboutUsTab() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void contextClickOnAboutUsTab() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTextOnAboutUsTab() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnAboutUsTab() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnHomeTab() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClickOnHomeTab() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hoverOnHomeTab() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void contextClickOnHomeTab() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTextOnHomeTab() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnHomeTab() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnCartTab() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClickOnCartTab() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hoverOnCartTab() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void contextClickOnCartTab() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTextOnCartTab() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnCartTab() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnProductStore() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doubleClickOnProductStore() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hoverOnProductStore() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void contextClickOnProductStore() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTextOnProductStore() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnProductStore() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement clickOnNavBar() {
		try {
			click(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locator;

	}

	public WebElement doubleClickOnNavBar() throws Exception {

		try {
			doubleClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locator;
	}

	public WebElement hoverOnNavBar() {

		try {
			hover(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locator;
	}

	public WebElement contextClickOnNavBar() {

		try {
			contextClick(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locator;
	}

	public void verifyTextOnNavBar() {

		try {
			textVerify(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTabOnNavBar() {

		try {
			newTab(act.getselector("Homepage", "HomeTab"), act.getvalue("Homepage", "HomeTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickOnRewindButton() {
		try {
			click(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void HoverOnRewindButton() {
		try {
			hover(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void DoubleClickOnRewindButton() {
		try {
			doubleClick(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void TextVerifyRewindButton() {
		try {
			textVerify(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void ClickOnForwardButton() {
		try {
			click(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void HoverOnForwardButton() {
		try {
			hover(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void DoubleClickOnForwardButton() {
		try {
			doubleClick(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void TextVerifyForwardButton() {
		try {
			textVerify(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void ClickOnNextButton() {
		try {
			click(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void HoverOnNextButton() {
		try {
			hover(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void DoubleClickOnNextButton() {
		try {
			doubleClick(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void TextVerifyNextButton() {
		try {
			textVerify(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void ClickOnPreviousButton() {
		try {
			click(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void HoverOnPreviousButton() {
		try {
			hover(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void DoubleClickOnPreviousButton() {
		try {
			doubleClick(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void TextVerifyPreviousButton() {
		try {
			textVerify(act.getselector("Signup", "CloseButton"), act.getvalue("Homepage", "CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
