package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	
	@FindBy(id="Password")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public WebElement getloginButton() {
		return loginButton;
	}

}
