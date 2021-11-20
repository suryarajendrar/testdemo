package page.day.deal.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Gloabal.acess.BaseClass;

public class PageElement extends BaseClass {
	public PageElement() {
		PageFactory.initElements(driver, this);
		}
	
	

}
