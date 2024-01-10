package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text() = 'My Addresses']")
	private WebElement myAddress;
	
	public WebElement getmyAddress() {
		return myAddress;
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddress;
	
	public WebElement getaddAddress() {
		return addAddress;
	}
	
	
}
