
package Setup;



import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base_setup
{
    public WebDriver driver;
   
	public  WebDriver initialiseDriver() throws IOException
	{
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		
//		capabilities.setCapability("version", "latest");
//		capabilities.setCapability("platform", "Windows 10");
//		
//		capabilities.setBrowserName("chrome");
//		
//		RemoteWebDriver driver = new RemoteWebDriver(new
//		URL("https://oauth-josethia2702-88f5f:5f4e4b1d-2520-41de-9f6e-0fbf6b24c75a@ondemand"
//				+ ".us-west-1.saucelabs.com:443/wd/hub"),capabilities);
//		driver.get("https://apptest.digiboxx.com/login");
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sethi\\git\\repository\\DigiBoxWeb\\DigiBoxxWeb\\src\\main\\resources\\Driver\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String versionNo=prop.getProperty("version");
		
		switch (browserName)
		{
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
//			WebDriverManager.firefoxdriver().browserPath(versionNo).setup();
//			driver = new FirefoxDriver();
//			driver.get("https://apptest.digiboxx.com/login");
//			driver.manage().window().maximize();
//			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
//			WebDriverManager.chromedriver().browserPath(versionNo).setup();
//			driver = new ChromeDriver();
//			driver.get("https://apptest.digiboxx.com/login");
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().browserPath(versionNo).setup();
			driver = new EdgeDriver();
			driver.get("http://35.176.253.183/login");
			driver.manage().window().maximize();
			break;	
		default:
			System.out.println("browser : " + browserName + " is invalid, Launching Firefox as browser of choice..");
			WebDriverManager.firefoxdriver().browserPath(versionNo).setup();
			driver = new FirefoxDriver();
			driver.get("http://35.176.253.183/login");
			driver.manage().window().maximize();
			break;
			
			
		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
		
	}
    
    
    
	

}

