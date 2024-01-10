package baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fileutility.PropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public WebDriver driver;
    PropertyFile pf = new PropertyFile();

    @BeforeClass
    public void openBrowser() throws IOException {
    	String browser = pf.readPropertyData("browser"); 	
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            // Default to Chrome if no valid browser name is provided
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        }

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(pf.readPropertyData("url"));
    }
    
    @AfterClass
    public void closebrowser() {
    	driver.quit();
    }
}
