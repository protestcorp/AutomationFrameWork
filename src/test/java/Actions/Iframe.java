package Actions;

import org.testng.annotations.Test;

public class Iframe extends ActionHandlers {
	@Test
	public void iframeAction() {
	 int value=0;
	 
	driver.switchTo().frame(0);
}
}