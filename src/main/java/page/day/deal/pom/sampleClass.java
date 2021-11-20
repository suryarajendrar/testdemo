package page.day.deal.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Gloabal.acess.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleClass extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.factorytohome.com.au/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	List<WebElement> popup = driver.findElements(By.xpath("//button[@type='button']"));
	WebElement btn = popup.get(1);
	btn.click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement fitnesstools = driver.findElement(By.xpath("(//div[@data-ratio='1.0'])[14]"));
	js.executeScript("arguments[0].scrollIntoView(true)",fitnesstools);
	
	fitnesstools.click();
	
WebElement rowingmeachine=	driver.findElement(By.xpath("(//a[@class='cd chp'])[32]"));

rowingmeachine.click();
//WebElement adlrt = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));

driver.close();
}
	
	
}
