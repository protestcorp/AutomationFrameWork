package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;
import CucumberOptionsss.DataXMLHandler;
import CucumberOptionsss.PageObjectHandler;

public class LogInPage  extends ActionUtilities {
	
	 PageObjectHandler act = new PageObjectHandler();
	 
	 WebElement locator = null;
	

	public  LogInPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void ClickOnLogInLink()
		{
			try {
				newTab(act.getselector("Login","LogInLink"),act.getvalue("Login","LogInLink", 0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
	
	public void NewTabLogInLink()
	{
		try {
			newTab(act.getselector("Login","LogInLink"),act.getvalue("Login","LogInLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void HoverOnLogInLink()
	{
		try {
			hover(act.getselector("Login","LogInLink"),act.getvalue("Login","LogInLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnLogInLink()
	{
		try {
			doubleClick(act.getselector("Login","LogInLink"),act.getvalue("Login","LogInLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyLogInLink()
	{
		try {
			textVerify(act.getselector("Login","LogInLink"),act.getvalue("Login","LogInLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public WebElement ClickOnLogInUsernameTextbox()
	{
		try {
			click(act.getselector("Login","LogInUsername"),act.getvalue("Login","LogInUsername", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return locator;

	}
	
	public WebElement HoverOnLogInUsernameTextbox()
	{
		try {
			hover(act.getselector("Login","LogInUsername"),act.getvalue("Login","LogInUsername", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public WebElement DoubleClickOnLogInUsernameTextbox()
	{
		try {
			doubleClick(act.getselector("Login","LogInUsername"),act.getvalue("Login","LogInUsername", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public void TextVerifyOnLogInUsernameTextbox()
	{
		try {
			textVerify(act.getselector("Login","LogInUsername"),act.getvalue("Login","LogInUsername", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClearLogInUsernameTextbox()
	{
		try {
			clear(act.getselector("Login","LogInUsername"),act.getvalue("Login","LogInUsername", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public WebElement ClickOnLogInPwdTextbox()
	{
		try {
			click(act.getselector("Login","LogInPassword"),act.getvalue("Login","LogInPassword", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;

	}
	public WebElement HoverOnLogInPwdTextbox()
	{
		try {
			hover(act.getselector("Login","LogInPassword"),act.getvalue("Login","LogInPassword", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public WebElement DoubleClickonLogInPwdTextbox()
	{
		try {
			doubleClick(act.getselector("Login","LogInPassword"),act.getvalue("Login","LogInPassword", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return locator;
	}
	
	public void TextVerifyOnLogInPwdTextbox()
	{
		try {
			textVerify(act.getselector("Login","LogInPassword"),act.getvalue("Login","LogInPassword", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClearLogInPwdTextbox()
	{
		try {
			clear(act.getselector("Login","LogInPassword"),act.getvalue("Login","LogInPassword", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnCloseButton()
	{
		try {
			click(act.getselector("Login","CloseButton"),act.getvalue("Login","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void HoverOnCloseButton()
	{
		try {
			hover(act.getselector("Login","CloseButton"),act.getvalue("Login","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnCloseButton()
	{
		try {
			doubleClick(act.getselector("Login","CloseButton"),act.getvalue("Login","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyCloseButton()
	{
		try {
			textVerify(act.getselector("Login","CloseButton"),act.getvalue("Login","CloseButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnLogOutButton()
	{
		try {
			click(act.getselector("Login","LogOut"),act.getvalue("Login","LogOut", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void HoverOnLogOutButton()
	{
		try {
			hover(act.getselector("Login","LogOut"),act.getvalue("Login","LogOut", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnLogOutButton()
	{
		try {
			doubleClick(act.getselector("Login","LogOut"),act.getvalue("Login","LogOut", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyLogOutButton()
	{
		try {
			textVerify(act.getselector("Login","LogOut"),act.getvalue("Login","LogOut", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	public void ClickOnLogInButton()
	{
		try {
			click(act.getselector("Login","LogInSignUpbtn"),act.getvalue("Login","LogInSignUpbtn", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void HoverOnLogInButton()
	{
		try {
			hover(act.getselector("Login","LogInSignUpbtn"),act.getvalue("Login","LogInSignUpbtn", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void DoubleClickOnLogInButton()
	{
		try {
			doubleClick(act.getselector("Login","LogInSignUpbtn"),act.getvalue("Login","LogInSignUpbtn", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyLogInButton()
	{
		try {
			textVerify(act.getselector("Login","LogInSignUpbtn"),act.getvalue("Login","LogInSignUpbtn", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	public void ClickOnCancelButton()
	{
		try {
			click(act.getselector("Login","CancelButton"),act.getvalue("Login","CancelButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	public void EnterTextToUserNameTextBox(String username)
    {
        DataXMLHandler data = new DataXMLHandler();
        data.getData("Login","Username", 0);
        try {
            sendkeys(act.getselector("Login","loginSendKeysusername"),act.getvalue("Login","loginSendKeysusername", 0),username);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
   
    public void EnterTextToPwdTextBox(String password)
    {
        DataXMLHandler data = new DataXMLHandler();
        data.getData("Login","Username", 0);
        try {
            sendkeys(act.getselector("Login","loginsendkeyspassword1"),act.getvalue("Login","loginsendkeyspassword1", 0),password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
    }
    
    public void Product()
    {
    	try {
			click(act.getselector("ProductList","Product"),act.getvalue("ProductList","Product", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }
	

}
