package Project.FrameWork;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import net.serenitybdd.core.webdriver.RemoteDriver;
import net.serenitybdd.core.webdriver.driverproviders.DriverCapabilities;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.DriverSource;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;


public class Base extends ThucydidesWebDriverSupport{

	private static final Capabilities FirefoxOptions = null;

	@Managed(driver = "firefox")
	WebDriver driver;
	
	protected String url="https://www.demoblaze.com";
	
	protected String testCaseName;
	public WebDriver initializeDriver() throws IOException, InterruptedException {
		
		
		
		Properties prop =new Properties();
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\Maheshwari\\Downloads\\AutomationFrameWork-main(3)\\AutomationFrameWork-main\\src\\main\\java\\Project\\FrameWork\\data.properties");
	//	prop.load(fis);
		
	//	String browserName = prop.getProperty("browser");
		// url = prop.getProperty("url");
		 
		String path = prop.getProperty("firefoxpath");
	
		String browserName = RemoteDriver.of(getDriver()).getCapabilities().getBrowserName();


		
		if(browserName.equalsIgnoreCase("chrome")) {
			Thread.sleep(3000);
			System.setProperty("webdriver.chrome.driver",(path));
		
			WebDriver driver = new ChromeDriver();
			System.out.println(browserName);
			return driver;
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			Thread.sleep(3000);
			
			
		//System.setProperty("webdriver.gecko.driver",(path));
			//WebDriver driver = new FirefoxDriver();
			//System.out.println(browserName);
			//return driver;
			return driver;
		}
		else if(browserName.equalsIgnoreCase("ie"))
			System.setProperty("webdriver.IE.driver", "E:\\Selenium\\Drivers\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		System.out.println(browserName);
		return driver;
	}
	
	
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
    	String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
 return destinationFile;
	}
	
	
}
