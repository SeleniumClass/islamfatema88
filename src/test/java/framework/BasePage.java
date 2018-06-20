package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import stepdefinition.SharedSD;

public class BasePage {
	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		}catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator :" +locator.toString() );
			e.printStackTrace();
		}
	}
	public void sendText(By locator ,String text) {
		try {
		SharedSD.getDriver().findElement(locator).sendKeys(text);
		}catch(NoSuchElementException e) {
		Assert.fail("Element is not found with this locator :" +locator.toString());	
		e.printStackTrace();
		}
	}
	public void signIn(By locator) {
		try {
		 SharedSD.getDriver().findElement(locator).click();
			
		}catch(NoSuchElementException e) {
		Assert.fail("Element is not found with this locator : "+locator.toString());	
		}
	}
	
  public String getTextFromElement(By locator) {
	  String text=null;
	  try {
		  text=SharedSD.getDriver().findElement(locator).getText();
	  }catch(NoSuchElementException e){
		  Assert.fail("Element is not found with this locator :" +locator.toString());
		  e.printStackTrace();
	  }
	  return text;
  }
  public void verifyPage(By locator) {
	  try {
		SharedSD.getDriver().findElement(locator).click(); 
	  }catch(NoSuchElementException e){
		Assert.fail("Element is not found with this locator " + locator.toString());  
		e.printStackTrace();
	  }
  }
  public void getProductList(By locator) {
	  try {
		 SharedSD.getDriver().findElement(locator).getText();
	  }catch(NoSuchElementException e) {
		 Assert.fail("Element is not found with this locator :" +locator.toString()); 
	  }
  }
}
