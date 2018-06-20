package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.ProductFuntion;
import framework.TestRunner;

public class ProductSD {
	ProductFuntion pf=new ProductFuntion();
//	@Given("^user is already on login page$")
//	public void userIsAlreadyOnLoginPage() throws Throwable {
//	SharedSD.getDriver();
//	}
	
	@When("^user click on new products$")
	public void userClickOnNewProducts() throws Throwable {
	 pf.clickNewProduct();
	}
	
	@Then("^user able to see all products$")
	public void allProduct() throws Throwable {
		
	pf.allProductList();
	   
	
	}

}
