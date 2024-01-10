package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import fileutility.ExcelData;
import fileutility.PropertyFile;
import objectrepository.AddressFormPage;
import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.MyAddressPage;
import objectrepository.MyProfilePage;
import objectrepository.WelcomePage;
import webutilitypackage.WebUtility;

public class WorkingWithAddAddress extends BaseClass {

	@Test
	public void addAddress() throws IOException, InterruptedException {
		ExcelData excel = new ExcelData();
		WebUtility wu = new WebUtility();
		
		WelcomePage wp = new WelcomePage(driver);
		Thread.sleep(4000);
		wp.getLoginButton().click();
		
		
		LoginPage lp = new LoginPage(driver);
		PropertyFile pf = new PropertyFile();
		lp.getEmail().sendKeys(pf.readPropertyData("un"));
		lp.getPassword().sendKeys(pf.readPropertyData("password"));
		lp.getloginButton().click();
		
		HomePage hp = new HomePage(driver);
		hp.getaccountButton().click();
		
		hp.getmyProfile().click();
		
		MyAddressPage map = new MyAddressPage(driver);
		map.getmyAddress().click();
		map.getaddAddress().click();
		
		
		AddressFormPage afp = new AddressFormPage(driver);
		afp.getName().sendKeys(excel.readExcelData("sheet1", 0, 0));
		afp.gethouseTab().sendKeys(excel.readExcelData("sheet1", 0, 1));
		afp.getstreetInfo().sendKeys(excel.readExcelData("sheet1", 0, 2));
		afp.getlandmark().sendKeys(excel.readExcelData("sheet1", 0, 3));
		wu.dropDown(afp.getCountry(), 2);
		wu.dropDown(afp.getState(), 3);
		wu.dropDown(afp.getCity(), 2);
		afp.getPincode().sendKeys(String.valueOf(excel.readExcelDatanumeric("sheet1", 0, 4)));
		afp.getPhoneNumber().sendKeys(excel.readExcelData("sheet1", 0, 5));

		
		
		afp.getaddAddress().click();
		Thread.sleep(3000);
		
		
		
	
	}

}
