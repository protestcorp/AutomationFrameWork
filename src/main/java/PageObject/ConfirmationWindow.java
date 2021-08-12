package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;
import CucumberOptionsss.PageObjectHandler;
import net.thucydides.core.annotations.Managed;

public class ConfirmationWindow extends ActionUtilities {
	
	
	public  ConfirmationWindow(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	PageObjectHandler act = new PageObjectHandler();
	
	public void ClickOnOkButton()
	{
		try {
			click(act.getselector("ThankyouforPurchaseWindow","OKButton"),act.getvalue("ThankyouforPurchaseWindow","OKButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void HoverOnOkButton()
	{
		try {
			hover(act.getselector("ThankyouforPurchaseWindow","OKButton"),act.getvalue("ThankyouforPurchaseWindow","OKButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void DoubleClickOnOkButton()
	{
		try {
			doubleClick(act.getselector("ThankyouforPurchaseWindow","OKButton"),act.getvalue("ThankyouforPurchaseWindow","OKButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void TextVerifyOkButton()
	{
		try {
			textVerify(act.getselector("ThankyouforPurchaseWindow","OKButton"),act.getvalue("ThankyouforPurchaseWindow","OKButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
}
