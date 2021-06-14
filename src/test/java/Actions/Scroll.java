package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroll extends ActionHandlers{
	@Test
	public void scrollAction() {
		String value ="window.scrollBy(0,1000)";
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value);
	}
	
}
