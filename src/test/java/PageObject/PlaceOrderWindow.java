package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.ActionUtilities;
import CucumberOptionsss.DataXMLHandler;
import CucumberOptionsss.PageObjectHandler;

public class PlaceOrderWindow extends ActionUtilities {
	
PageObjectHandler act = new PageObjectHandler();


public  PlaceOrderWindow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void ClickOnPlaceOrderUsernameTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderUsernameTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderUsernameTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderUsernameTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderUsernameTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderCountryTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderCountryTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderCountryTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderCountryTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderCountryTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderCityTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderCityTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderCityTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderCityTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderCityTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderCreditCardTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","CreditCardTextbox"),act.getvalue("PlaceOrderWindow","CreditCardTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderCreditCardTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","CreditCardTextbox"),act.getvalue("PlaceOrderWindow","CreditCardTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderCreditCardTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","CreditCardTextbox"),act.getvalue("PlaceOrderWindow","CreditCardTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderCreditCardTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","CreditCardTextbox"),act.getvalue("PlaceOrderWindow","CreditCardTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderCreditCardTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","CreditCardTextbox"),act.getvalue("PlaceOrderWindow","CreditCardTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderMonthTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderMonthTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderMonthTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderMonthTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderMonthTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderYearTextbox()
{
	try {
		click(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderYearTextbox()
{
	try {
		hover(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderYearTextbox()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyOnPlaceOrderYearTextbox()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClearPlaceOrderYearTextbox()
{
	try {
		clear(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderCloseButton()
{
	try {
		click(act.getselector("PlaceOrderWindow","CloseButton"),act.getvalue("PlaceOrderWindow","CloseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPlaceOrderCloseButton()
{
	try {
		hover(act.getselector("PlaceOrderWindow","CloseButton"),act.getvalue("PlaceOrderWindow","CloseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPlaceOrderCloseButton()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","CloseButton"),act.getvalue("PlaceOrderWindow","CloseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyPlaceOrderCloseButton()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","CloseButton"),act.getvalue("PlaceOrderWindow","CloseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPurchaseButton()
{
	try {
		click(act.getselector("PlaceOrderWindow","PurchaseButton"),act.getvalue("PlaceOrderWindow","PurchaseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void HoverOnPurchaseButton()
{
	try {
		hover(act.getselector("PlaceOrderWindow","PurchaseButton"),act.getvalue("PlaceOrderWindow","PurchaseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void DoubleClickOnPurchaseButton()
{
	try {
		doubleClick(act.getselector("PlaceOrderWindow","PurchaseButton"),act.getvalue("PlaceOrderWindow","PurchaseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void TextVerifyPurchaseButton()
{
	try {
		textVerify(act.getselector("PlaceOrderWindow","PurchaseButton"),act.getvalue("PlaceOrderWindow","PurchaseButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void ClickOnPlaceOrderCancelButton()
{
	try {
		click(act.getselector("PlaceOrderWindow","CancelButton"),act.getvalue("PlaceOrderWindow","CancelButton", 0));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}

public void EnterTextToName(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
        sendkeys(act.getselector("PlaceOrderWindow","UsernameTextbox"),act.getvalue("PlaceOrderWindow","UsernameTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}

public void EnterTextToCountry(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
        sendkeys(act.getselector("PlaceOrderWindow","CountryTextbox"),act.getvalue("PlaceOrderWindow","CountryTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}

public void EnterTextToCity(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
        sendkeys(act.getselector("PlaceOrderWindow","CityTextbox"),act.getvalue("PlaceOrderWindow","CityTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}

public void EnterTextToCreditCard(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
        sendkeys(act.getselector("PlaceOrderWindow","CreditCartTextbox"),act.getvalue("PlaceOrderWindow","CreditCartTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}

public void EnterTextToMonth(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
    	sendkeys(act.getselector("PlaceOrderWindow","MonthTextbox"),act.getvalue("PlaceOrderWindow","MonthTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}

public void EnterTextToYear(String text)
{
    DataXMLHandler data = new DataXMLHandler();
    data.getData("Loginn","Username", 0);
    try {
    	sendkeys(act.getselector("PlaceOrderWindow","YearTextbox"),act.getvalue("PlaceOrderWindow","YearTextbox", 0),text);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       
    }
}
// 
}