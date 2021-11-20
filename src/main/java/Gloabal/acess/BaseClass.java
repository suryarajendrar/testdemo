package Gloabal.acess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	public static WebDriver launchbrowser(String browsername ) {
switch (browsername) {
case "chrome":

	WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	break;

case "edge":

	WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	break;

case "firefox":

	WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	break;

default:System.err.println("invalid browser");
}
		
		 return driver;
	}
	
	

	public static WebElement findelements(String locatortype,String locatorid) {
		WebElement e=null;
		if (locatortype.contentEquals("id")) {
			 e= driver.findElement(By.id(locatorid));
		}
	if (locatortype.contentEquals("xpath")) {
		
		 e= driver.findElement(By.xpath(locatorid));
	}
	
	if (locatortype.contains("classname")) {
		 e= driver.findElement(By.className(locatorid));

	}
	return e;
	}
	
	
public static void filltext(WebElement e,String text) {
e.sendKeys(text);

}
	
public static void timewait(int sec) {
driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);

}

public static void windowmax() {
	driver.manage().window().maximize();
	
	
	
}
	public static void  launchurl (String url) {
		
		driver.get(url);
	}
}
