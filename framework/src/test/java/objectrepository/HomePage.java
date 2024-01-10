package objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(org.openqa.selenium.WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class = 'MuiAvatar-img css-1hy9t21']")
	private WebElement accountButton;
	
	public WebElement getaccountButton() {
		return accountButton;
	}
	
	
	@FindBy(xpath = "(//li[@role = 'menuitem'])[1]")
	private WebElement myProfile;
	
	public WebElement getmyProfile() {
		return myProfile;
	}
	
	
	@FindBy(xpath="(//li[@role = 'menuitem'])[7]")
	private WebElement logutButton;
	
	public WebElement getlogutButton() {
		return logutButton;
	
	}
}
