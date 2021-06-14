package Actions;

	import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.openqa.selenium.By;

	public class Calender extends ActionHandlers {
		
	public static String getCurrentDate(){
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	return Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
	}

	 public static String getCurrentMonthAndYear(){
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
	String year = Integer.toString(calendar.get(Calendar.YEAR));
	return month+" "+year;
	}

	 public void selectDynamicDate(String month, String date){
	driver.findElement(By.xpath(String.format("//*[contains(text(),'%s')]/../../div[@class='DayPicker-Body']/div/div/div/p[1][contains(text(),'%s')]",getCurrentMonthAndYear(),getCurrentDate()))).click();
	}
	public void selectGivenDate(String month, String date){
	driver.findElement(By.xpath("//*[contains(text(),'"+month+" 2021')]/../../div[@class='DayPicker-Body']/div/div/div/p[1][contains(text(),'"+date+"')]")).click();
	}

	}

