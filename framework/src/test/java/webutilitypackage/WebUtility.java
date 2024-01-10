package webutilitypackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebUtility {
	public void dropDown(WebElement ele, int value) {
		Select sel = new Select(ele);
		sel.selectByIndex(value);
	}

}
