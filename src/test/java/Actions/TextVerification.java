package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextVerification extends ActionHandlers {

	String Expected;

	@Test
	public void verifyText() {
		WebElement element = driver.findElement(By.xpath(Address));

		String text = element.getText();

		System.out.println("Text obtained is" + text);

		if (text.contains(Expected)) {
			System.out.println("Expected text is obtained");
		} else {

			System.out.println("Expected text is not obtained");

		}
	}
}
