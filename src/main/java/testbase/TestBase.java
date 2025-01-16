package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LandingPage;



public class TestBase {
	

	
		 public static WebDriver driver;
	public	 LandingPage landingPage;


		    public  WebDriver initializeDriver(String browser) {
		        switch (browser.toLowerCase()) {
		            case "chrome":
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		                driver.manage().window().maximize();
		                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		                break;

		            case "firefox":
		                WebDriverManager.firefoxdriver().setup();
		                driver = new FirefoxDriver();
		                driver.manage().window().maximize();
		                break;

		            case "edge":
		                WebDriverManager.edgedriver().setup();
		                driver = new EdgeDriver();
		                driver.manage().window().maximize();
		                break;

		            default:
		                throw new IllegalArgumentException("Invalid browser name: " + browser);
		        }

		        return driver;
		    }
	
	public  String getProperties(String key) throws IOException {
		
		
		
	Properties properties = new Properties();
	
	FileInputStream filestream = new FileInputStream(System.getProperty("user.dir")+Constants.FILE_PATH);
	
	properties.load(filestream);
	
	 return properties.getProperty(key);
	
}
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}
	
	@BeforeMethod(alwaysRun=true)
	
	 public void setup() throws IOException {
        initializeDriver(getProperties(Constants.browser_type));
        landingPage = new LandingPage(driver);
        landingPage.add();
    }
	
	@AfterMethod(alwaysRun=true)
	
	public void tearDown()
	{
		driver.close();
	}
	
	
}
