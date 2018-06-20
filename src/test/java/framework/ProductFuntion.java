package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductFuntion extends BasePage{
  private By newProduct=By.xpath("//*[@id=\"bodyContent\"]/div/div[1]/a/u");
  private By pageNumber=By.tagName("a");
  private By allProduct=By.xpath("//*[@id=\"bodyContent\"]");
  
  public void clickNewProduct() {
		clickOn(newProduct);
	}
  public void getPageNumber() {
	  verifyPage(pageNumber);
	
	
	
	
  }
  public By allProductList() {
	  getProductList(allProduct);
	return allProduct;
	
  }
  
}
