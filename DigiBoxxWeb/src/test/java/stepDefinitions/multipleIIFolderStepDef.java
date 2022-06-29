package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.digiLoginPage;
import pages.multipeIIFolderPage;

public class multipleIIFolderStepDef {
	
	
	WebDriver driver;
	digiLoginPage dl;
	multipeIIFolderPage mi;
	
	  @Given("^User login to the DigiBoxxApp$")
	    public void user_login_to_the_DigiBoxxApp() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\git\\repository\\DigiBoxWeb\\DigiBoxxWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
//		  	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
			driver.manage().window().maximize();
			
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(2000);
			dl.click_login();
			mi= new multipeIIFolderPage(driver);
	    }

	    @When("^User select the folder$")
	    public void user_select_the_folder() {
	        mi.select_folder();
	    }

	    @Then("^User click add button$")
	    public void user_click_add_button() {
	        mi.add_button();
	    }

	    @Then("^User click onupload$")
	    public void user_click_on_upload() {
	        mi.upload_image();
	    }

	    @Then("^User select the multiple imagess$")
	    public void user_select_the_multiple_imagess() throws InterruptedException, AWTException {
	    	Thread.sleep(4000);
		     mi.select_image();
	    }
	
	
	
	
}
