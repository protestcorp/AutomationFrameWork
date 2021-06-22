package Project.FrameWork;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import Project.FrameWork.Base;
import ObjectRepository.Homepage;
import ObjectRepository.Login;
import ObjectRepository.Signup;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//@Listeners(Project.FrameWork.Listeners.class)
public class BaseTest extends Base

{

private static final Logger logger = LogManager.getLogger(BaseTest.class.getName());
	
	 WebDriver driver;
/*
//	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		public String getScreenshotPath() throws IOException {
		WebDriver driver = null;
			TakesScreenshot ts =  (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
    	String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
 return destinationFile;
	}
	*/
@BeforeTest
	public void LaunchingBrowser() throws IOException, InterruptedException {
	
		driver = initializeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		logger.info("Launching Browser succeded");
		}
@BeforeTest
public   void loggerfile() {
	 String log4jpath=System.getProperty("user.dir")+"/src/main/resources/log4j2.xml";
        System.setProperty("logoutputpath", System.getProperty("user.dir"));
        System.setProperty("log4j.configurationFile",log4jpath);
		
}



	@AfterTest
	public void close() {
		driver.close();
	}
	@Test //(dataProvider= "getData")
//	public void dataprovidertest(String username,String password) throws InterruptedException, IOException {
	public void dataprovidertest() throws Exception {

		
		FileReader f = new FileReader("C:\\Users\\Likith\\Desktop\\PRO-TEST\\Frameworkkeypoints.txt");
		   BufferedReader b = new BufferedReader(f);
		   
		   String username;
		   Thread.sleep(3000);
		   while((username = b.readLine())!=null) {
			  String password = b.readLine();
			  System.out.println(username);
			  System.out.println(password);
			    
				
		Signup su = new Signup(driver);
		su.signUpLink1().click();
		Thread.sleep(4000);
		logger.info("Signin test started");
		//	System.out.println("data provider output"+" "+username+" "+password);
		su.signUpusername1().sendKeys(username);//+getDate());
		Thread.sleep(3000);
		logger.info("Signin username entered");
		su.signUppassword1().sendKeys(password);
		logger.info("Signin password entered");
		su.signUpBtn1().click();
		Thread.sleep(3000);
		logger.info("Signed in sucessfull");
		driver.switchTo().alert().accept();
		logger.info("Signin test ended");
	   
		
		
		Login lo = new Login(driver);
		lo.LogInLink().click();
		Thread.sleep(4000);
		logger.info("Login test started");
		System.out.println("data provider output"+" "+username+" "+password);
		lo.LogInUsername().sendKeys(username);
		logger.info("Login username entered");
		lo.LogInPassword().sendKeys(password);
		logger.info("Login password entered");
		lo.LogInSignUpbtn().click();
		logger.info("Logged in successful");
		Thread.sleep(4000);
		lo.LogOut().click(); 
		logger.info("Logged out successful");
		}
	}
	//	logger.info("Login test ended");
	/*
		Homepage hm = new Homepage(driver);
		System.out.println(hm.navBar().getText());
		Assert.assertTrue(true);
		logger.info("Navbar validated");
		*/ 		
		/*	
			hm.HomePageLink().click();
			Assert.assertTrue(true);
			System.out.println("Home");
			Thread.sleep(2000);
			hm.ContactPageLink().click();
			System.out.println("contact"); 
			Thread.sleep(2000);
			hm.ContactCloseBtn().click();
			hm.AboutPageLink().click(); 
			Thread.sleep(2000);
			hm.AboutCloseBtn().click();
			System.out.println("about");
			hm.CartPageLink().click();
			System.out.println("cart");
			Thread.sleep(2000);
			hm.LogInLink().click();
			Thread.sleep(2000);
			hm.logInQuitbtn().click();
			Thread.sleep(2000);
			hm.signUpLink1().click();
			Thread.sleep(2000);
			hm.signUpQuitbtn().click();
			Thread.sleep(3000); 
			*/
	/*
	@DataProvider
	public Object[][] getData() {
		Object [][] data= new Object[3][2];
		data[0][0]="sername";
		data[0][1]="1234";
	
		data[1][0]="qwwrtusername";
		data[1][1]="0987";
		
		data[2][0]="ername";
		data[2][1]="5678ssword";
		return data; 
		
	}*/

	
	private String getDate() {
		
		Date date = new Date();
		return date.toString();
 		
	}
	
}
