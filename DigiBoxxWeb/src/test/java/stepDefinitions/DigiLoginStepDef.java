package stepDefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImageInsideFolderPage;
import pages.digiLoginPage;

public class DigiLoginStepDef {

	WebDriver driver;
	digiLoginPage dl;
	
	@Given("I go to DigiBoxx webpage")
	public void i_go_to_digi_boxx_webpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://apptest.digiboxx.com/login");
		driver.manage().window().maximize();
		dl=new digiLoginPage(driver);
	

	}

	@When("I enter Digispace")
	public void i_enter_digispace() {
		dl.enter_digi("mozark14");
	 
	}

	@Then("I enter email")
	public void i_enter_email() {
		dl.enter_email("mozark14251093@gmail.com");

	}

	@And("I enter password")
	public void i_enter_password() {
	  dl.enter_pass("Gaurav@123");

	}

	@Then("I click on login")
	public void i_click_on_login() throws InterruptedException {
	  dl.click_login();

	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
//	 String expectedtitle="Share & Store Files and Folders | DigiBoxx - Best File Sharing App";	
//	 String actualtitle=driver.getTitle();
//	 Assert.assertEquals("Home Page Displayed", expectedtitle, actualtitle);
//	 System.out.println("The title is"+actualtitle);
	}
}
