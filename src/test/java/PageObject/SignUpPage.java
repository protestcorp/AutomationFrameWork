package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;
import CucumberOptionsss.DataXMLHandler;
import CucumberOptionsss.PageObjectHandler;


public class SignUpPage extends ActionUtilities {
	
	PageObjectHandler act = new PageObjectHandler();
	
	 WebElement locator = null;
		

		public  SignUpPage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}

	   
	    
	
	public void ClickOnSignupLink()
	{
		try {
			click(act.getselector("Signup","signUpLink1"),act.getvalue("Signup","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	//	return locator;

	}
	
	public void NewTabSignupLink()
	{
		try {
			newTab(act.getselector("Signup","signUpLink1"),act.getvalue("Signup","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void HoverOnSignupLink()
	{
		try {
			hover(act.getselector("Signup","signUpLink1"),act.getvalue("Signup","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnSignupLink()
	{
		try {
			doubleClick(act.getselector("Signup","signUpLink1"),act.getvalue("Signup","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifySignupLink()
	{
		try {
			textVerify(act.getselector("Signup","signUpLink1"),act.getvalue("Signup","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	
	public WebElement ClickOnSignupUsernameTextbox()
	{try {
		click(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		
	} catch (Exception e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		
	}
		
		
		return locator;

	}
	
	public WebElement HoverOnSignupUsernameTextbox()
	{
		try {
			hover(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		WebElement action = null;
		return action;

	}
	
	public WebElement DoubleClickOnSignupUsernameTextbox()
	{
		try {
			doubleClick(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;

	}
	
	public WebElement TextVerifyOnSignupUsernameTextbox()
	{
		try {
			textVerify(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;

	}
	
	public void ClearSignupUsernameTextbox()
	{
		try {
			clear(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public WebElement ClickOnSignupPwdTextbox()
	{
		try {
			click(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;

	}
	
	public WebElement DoubleClickonSignupPwdTextbox()
	{
		try {
			doubleClick(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public WebElement TextVerifyOnSignupPwdTextbox()
	{
		try {
			textVerify(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public void ClearSignupPwdTextbox()
	{
		try {
			clear(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnCloseButton()
	{
		try {
			click(act.getselector("Signup","CloseButton"),act.getvalue("Signup","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void HoverOnCloseButton()
	{
		try {
			hover(act.getselector("Signup","CloseButton"),act.getvalue("Signup","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnCloseButton()
	{
		try {
			doubleClick(act.getselector("Signup","CloseButton"),act.getvalue("Signup","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyCloseButton()
	{
		try {
			textVerify(act.getselector("Signup","CloseButton"),act.getvalue("Signup","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnSignupButton()
	{
		try {
			click(act.getselector("Signup","signUpBtn1"),act.getvalue("Signup","signUpBtn1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void HoverOnSignupButton()
	{
		try {
			hover(act.getselector("Signup","signUpBtn1"),act.getvalue("Signup","signUpBtn1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnSignupButton()
	{
		try {
			doubleClick(act.getselector("Signup","signUpBtn1"),act.getvalue("Signup","signUpBtn1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifySignupButton()
	{
		try {
			textVerify(act.getselector("Signup","signUpBtn1"),act.getvalue("Signup","signUpBtn1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnCancelButton()
	{
		try {
			click(act.getselector("Signup","CancelButton"),act.getvalue("Signup","CancelButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	public void EnterTextToUserNameTextBox(String username)
    {
        DataXMLHandler data = new DataXMLHandler();
        data.getData("SignIn","Username", 0);
        try {
            sendkeys(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0),username);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
   
    public void EnterTextToPwdTextBox(String password)
    {
        DataXMLHandler data = new DataXMLHandler();
        data.getData("SignIn","Username", 0);
        try {
            sendkeys(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0),password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
}