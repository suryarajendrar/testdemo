package pay.day.deal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Gloabal.acess.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PAyDAyDealSamplePage  extends BaseClass{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://paydaydeals.com.au/");
		
	}
}
