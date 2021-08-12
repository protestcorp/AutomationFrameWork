package Actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 

 

public class ContextMenu {

 

    WebDriver driver;
    String Locator;
    String Address;
    String Address1;
    WebElement menu;
    WebElement subMenu;
    WebElement Source;
    WebElement Destination;

 

    public String clickMenu() throws Exception{
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 2);
        
        switch (Locator) {            
            case "xpath":
                try {
                menu = driver.findElement(By.xpath(Address));
                subMenu = driver.findElement(By.xpath(Address1));
                Source = wait.until(ExpectedConditions.elementToBeClickable(menu));
                Destination = wait.until(ExpectedConditions.elementToBeClickable(subMenu));
                action.moveToElement(menu).perform();
                action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "cssSelector":
                try {
                 menu = driver.findElement(By.cssSelector(Address));
                subMenu = driver.findElement(By.cssSelector(Address1));
                action.moveToElement(menu).perform();
                action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                
                break;
            case "id":
                try {
                menu = driver.findElement(By.id(Address));
                subMenu = driver.findElement(By.id(Address1));
                action.moveToElement(menu).perform();
                action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "className":
                try {
                menu = driver.findElement(By.className(Address));
                subMenu = driver.findElement(By.className(Address1));
                action.moveToElement(menu).perform();
                action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "tagName":
                try {
                menu = driver.findElement(By.tagName(Address));
                 subMenu = driver.findElement(By.tagName(Address1));
                 action.moveToElement(menu).perform();
                 action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "linkText":
                try {
                 menu = driver.findElement(By.linkText(Address));
                 subMenu = driver.findElement(By.linkText(Address1));
                 action.moveToElement(menu).perform();
                 action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "name":
                try {
                 menu = driver.findElement(By.name(Address));
                subMenu = driver.findElement(By.name(Address1));
                action.moveToElement(menu).perform();
                action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
            case "partialLinkText":
                try {
                 menu = driver.findElement(By.partialLinkText(Address));
                 subMenu = driver.findElement(By.partialLinkText(Address1));
                 action.moveToElement(menu).perform();
                 action.moveToElement(subMenu).click();
                } catch (Exception e) {
                    Assert.assertTrue(false);
                }
                break;
                                            
            default:
                throw new Exception("locator : " + Locator + " not found!!!");
            
                
            }
            return Locator;  
    }
    

 

}


