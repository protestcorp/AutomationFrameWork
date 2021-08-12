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
	
	
	public void ClickOnSignupUsernameTextbox()
	{try {
		click(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		
	} catch (Exception e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		
	}
	

	}
	
	public void HoverOnSignupUsernameTextbox()
	{
		try {
			hover(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}
	
	public void DoubleClickOnSignupUsernameTextbox()
	{
		try {
			doubleClick(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void TextVerifyOnSignupUsernameTextbox()
	{
		try {
			textVerify(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

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
	
	public void ClickOnSignupPwdTextbox()
	{
		try {
			click(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}
	
	public void DoubleClickonSignupPwdTextbox()
	{
		try {
			doubleClick(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void TextVerifyOnSignupPwdTextbox()
	{
		try {
			textVerify(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
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
   
        try {
            sendkeys(act.getselector("Signup","signUpusername1"),act.getvalue("Signup","signUpusername1", 0),username);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
   
    public void EnterTextToPwdTextBox(String password)
    {
    
        try {
            sendkeys(act.getselector("Signup","signUppassword1"),act.getvalue("Signup","signUppassword1", 0),password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
}