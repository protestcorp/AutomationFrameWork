package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;
import CucumberOptionsss.PageObjectHandler;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;


public class CartPage extends ActionUtilities {

	
PageObjectHandler act = new PageObjectHandler();


public  CartPage(WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
}



	public void ClickOnCartLink()
	{
		try {
			click(act.getselector("Homepage","CartTab"),act.getvalue("Homepage","CartTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

	public void NewTabCartLink()
	{
		try {
			newTab(act.getselector("Homepage","CartTab"),act.getvalue("Homepage","CartTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}


	public void HoverOnCartLink()
	{
		try {
			hover(act.getselector("Homepage","CartTab"),act.getvalue("Homepage","CartTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}


	public void DoubleClickOnCartLink()
	{
		try {
			doubleClick(act.getselector("Homepage","CartTab"),act.getvalue("Homepage","CartTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}


	public void TextVerifyCartLink()
	{
		try {
			textVerify(act.getselector("Homepage","CartTab"),act.getvalue("Homepage","CartTab", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	

	public void ClickOnPlaceorderButton()
	{
		try {
			click(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	

	public void HoverOnPlaceorderButton()
	{
		try {
			hover(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	

	public void DoubleClickOnPlaceorderButton()
	{
		try {
			doubleClick(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}


	public void TextVerifyPlaceorderButton()
	{
		try {
			textVerify(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void ClickOnDeleteLink()
	{
		try {
			click(act.getselector("AddtoCartPage","DeleteLink"),act.getvalue("AddtoCartPage","DeleteLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}


	public void NewTabDeleteLink()
	{
		try {
			newTab(act.getselector("AddtoCartPage","DeleteLink"),act.getvalue("AddtoCartPage","DeleteLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}


	public void HoverOnDeleteLink()
	{
		try {
			hover(act.getselector("AddtoCartPage","signUpLink1"),act.getvalue("AddtoCartPage","signUpLink1", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}


	public void DoubleClickOnDeleteLink()
	{
		try {
			doubleClick(act.getselector("AddtoCartPage","DeleteLink"),act.getvalue("AddtoCartPage","DeleteLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}


	public void TextVerifyDeleteLink()
	{
		try {
			textVerify(act.getselector("AddtoCartPage","DeleteLink"),act.getvalue("AddtoCartPage","DeleteLink", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}

	

	public void ClickOnPlaceOrderButton()
	{
		try {
			click(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	

	public void HoverOnPlaceOrderButton()
	{
		try {
			hover(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	

	public void DoubleClickOnPlaceOrderButton()
	{
		try {
			doubleClick(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}


public void TextVerifyPlaceOrderButton()
	{
		try {
			textVerify(act.getselector("AddtoCartPage","PlaceOrderButton"),act.getvalue("AddtoCartPage","PlaceOrderButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void ClickOnAddCartButton()
	{
		try {
			click(act.getselector("AddtoCartPage","AddtoCartButton"),act.getvalue("AddtoCartPage","AddtoCartButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void HoverOnAddCartButton()
	{
		try {
			hover(act.getselector("AddtoCartPage","AddtoCartButton"),act.getvalue("AddtoCartPage","AddtoCartButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public void DoubleClickOnAddCartButton()
	{
		try {
			doubleClick(act.getselector("AddtoCartPage","AddtoCartButton"),act.getvalue("AddtoCartPage","AddtoCartButton", 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
}