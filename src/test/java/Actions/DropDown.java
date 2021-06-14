package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
		public void selectDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByValue(value);
		}

		 public void selectDropDown(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
		}

		}

