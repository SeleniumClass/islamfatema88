package framework;

import org.openqa.selenium.By;

public class LoginFunction extends BasePage{

	private By pageHeader = By.xpath("//div[@id='storeLogo']");
	
	public String getPageHeader() {
		
		return getTextFromElement(pageHeader);
	}

}
