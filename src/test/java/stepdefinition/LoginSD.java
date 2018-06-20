package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.LoginFunction;
import framework.TestRunner;

public class LoginSD {
	private LoginFunction loginPage=new LoginFunction();
	private HomePage homePage = new HomePage();
	
	@Given("^user is already on login page$")
	public void userIsAlreadyOnLoginPage() throws Throwable {
	SharedSD.getDriver();
	}

	@And("^title of login page is GCR Shop$")
	public void titleOfLoginPageIsGCRShop() throws Throwable {
    Assert.assertEquals(SharedSD.getDriver().getTitle(), "GCR Shop","Element is not found"); 
	}
	@When("^user click on login button$")
	public void userClickOnLoginButton() throws Throwable {
	  homePage.clickOnLoginButton();
	}
	@When("^user enter \"([^\"]*)\" into username text fields on home screen$")
	public void userEnterUsername(String text) throws Throwable {
	   homePage.enterEmail(text);
	}

	@When("^user enter \"([^\"]*)\" into username password fields on home screen$")
	public void userEnterPassword(String text) throws Throwable {
	   homePage.enterPassword(text);
	}

	@And("^user click on sign in button$")
	public void userClickOnSignInButton() throws Throwable {
	  homePage.clickOnSignInBtn();
	}

	@Then("^user is on home page$")
	public void userIsOnHomePage() throws Throwable {
		Assert.assertEquals("GCR Shop", SharedSD.getDriver().getTitle(), "Test Passed");
	 
	}

}
