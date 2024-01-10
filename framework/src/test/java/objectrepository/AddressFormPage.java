package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Name")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}
	
	@FindBy(id="House/Office Info")
	private WebElement houseTab;
	
	public WebElement gethouseTab() {
		return houseTab;
	}
	
	
	@FindBy(id="Street Info")
	private WebElement streetInfo;
	
	public WebElement getstreetInfo() {
		return streetInfo;
	}
	
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	public WebElement getlandmark() {
		return landmark;
	}
	
	
	@FindBy(id="Country")
	private WebElement Country;
	
	public WebElement getCountry() {
		return Country;
	}
	
	
	@FindBy(id="State")
	private WebElement State;
	
	public WebElement getState() {
		return State;
	}
	
	
	@FindBy(id = "City")
	private WebElement City;
	
	public WebElement getCity() {
		return City;
	}
	
	@FindBy(id="Pincode")
	private WebElement Pincode;
	
	public WebElement getPincode() {
		return Pincode;
	}
	
	
	@FindBy(id="Phone Number")
	private WebElement PhoneNumber;
	
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress;
	
	public WebElement getaddAddress() {
		return addAddress;
	}

}
