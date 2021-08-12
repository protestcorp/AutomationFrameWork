package CucumberOptionsss;
/*
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import  Project.FrameWork.Base;
import  Project.FrameWork.ExtentReports;

public class Listeners extends Base implements ITestListener 
{

//	ExtentReports extent = ExtentReporters.getReportObject();
// ExtentTest test;

	
@Override
public void onFinish(ITestContext arg0) {
	
	
}
@Override
public void onStart(ITestContext arg0) {
	
}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	
}
@Override
public void onTestFailure(ITestResult result) {
	
	String testMethodName = result.getMethod().getMethodName(); 

	WebDriver driver = null;
	try {
		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//getScreenshotPath(testMethodName, driver)
//test.fail(result.getThrowable())

}
@Override
public void onTestSkipped(ITestResult arg0) {
	
	 

}
@Override
public void onTestStart(ITestResult result) {
	
/*	getReportObject();
	ExtentReports extent = ExtentReporter.getReportObject();
	test = extent.createTest(result.getMethod().getMethodName())
			Inside onFinish() method add extent.flush();

}
@Override
public void onTestSuccess(ITestResult results) {
//	test.log(Status.PASS,"Test Passed")

	System.out.println("Scrennshot sucess");
} 


} 
*/
/*
<test thread-count="5" name="Test1">
  <classes>
    <class name="ObjectRepository.Login"/> 
  </classes>
</test> <!-- Test -->

<test thread-count="5" name="Test2">
  <classes>
   <class name="ObjectRepository.Signup"/>
  </classes>
</test> <!-- Test -->
<listeners>
<listener class-name=".Listeners(path till listenersclass)"/>
</listeners>*/
import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Project.FrameWork.ExtentReporterNG;
import Project.FrameWork.Base;
import Project.FrameWork.BaseTest;
 

public class Listeners extends Base implements ITestListener {
    ExtentTest test;
    ExtentReports extent=ExtentReporterNG.getReportObject();
    ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
    
   
    
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        test= extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        
    }


    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        extentTest.get().log(Status.PASS, "Test Passed");
    }

    public void onTestFailure(ITestResult result)  {
        // TODO Auto-generated method stub
        //Screenshot
        extentTest.get().fail(result.getThrowable());
        WebDriver driver =null;
        String testMethodName =result.getMethod().getMethodName();
        
        try {
            driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch(Exception e)
        {
            
        }
     try {
   
        	  extentTest.get().addScreenCaptureFromPath(getScreenshotPath(testMethodName,driver), result.getMethod().getMethodName());
        //    extentTest.get().addScreenCaptureFromPath(result.getMethod().getMethodName());
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
   
   
/*
     public void onTestFailure(ITestResult result)  {
        // TODO Auto-generated method stub
        //Screenshot
        extentTest.get().fail(result.getThrowable());
        WebDriver driver =null;
        String testMethodName =result.getMethod().getMethodName();
        
        try {
            driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch(Exception e)
        {
            
        }
     try {
   
        	  extentTest.get().addScreenCaptureFromPath(getScreenshotPath(testMethodName,driver), result.getMethod().getMethodName());
        //    extentTest.get().addScreenCaptureFromPath(result.getMethod().getMethodName());
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
*/
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

 

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

 

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }

 

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        extent.flush();
    }

 

}
