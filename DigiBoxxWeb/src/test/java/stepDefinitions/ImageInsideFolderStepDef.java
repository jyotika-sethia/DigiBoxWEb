package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImageInsideFolderPage;
import pages.digiLoginPage;

public class ImageInsideFolderStepDef {
	WebDriver driver;
	digiLoginPage dl;
	ImageInsideFolderPage iif;
	
	@Given("^User login to webpage$")
    public void user_login_to_webpage()  throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://apptest.digiboxx.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		dl=new digiLoginPage(driver);
		dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
		Thread.sleep(3000);
		dl.click_login();
		iif=new ImageInsideFolderPage(driver);
       
    }

    @When("^User select folder$")
    public void user_select_folder() throws InterruptedException  {
    	Thread.sleep(6000);
    	iif.select_folder();
    }


 
    

    @Then("User click add button$")
    public void user_click_add_button()  throws InterruptedException  {
    	Thread.sleep(4000);
    	iif.add_button();
       
    }

    @Then("^User select upload$")
    public void user_select_upload() throws InterruptedException  {
    	Thread.sleep(4000);
    	iif.upload_image();
    	
       
    }

    @Then("^User select image$")
    public void user_select_image() throws AWTException, InterruptedException  {
    	Thread.sleep(3000);
    	iif.select_image();  
    }
}
