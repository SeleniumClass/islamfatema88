package framework;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
	private By loginBtn=By.xpath("//*[contains(text(),'My Account')]");
	private By emailTextField = By.xpath("//*[@name='email_address']");
	private By passwordTextField = By.xpath("//*[@name='password']");
	private By signInButton = By.xpath("//span[text()='Sign In']");
	
	
	
	public void clickOnLoginButton() {
		clickOn(loginBtn);
	}


	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}
	public void clickOnSignInBtn() {
		signIn(signInButton);
	}
}
