package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeletePage;
import pages.digiLoginPage;

public class DeleteStepDef extends Base_setup {
	WebDriver driver;
	digiLoginPage dl;
	DeletePage dp;
	
	@Given("User login to digibox webpage")
	public void user_login_to_digibox_webpage() throws IOException, InterruptedException {
		driver= initialiseDriver();
		Thread.sleep(2000);
		dl=new digiLoginPage(driver);
		dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
		Thread.sleep(5000);
		dl.click_login();
		dp=new DeletePage(driver);
	   
	
	}

	@When("User click on image")
	public void user_click_on_image() throws InterruptedException {
		Thread.sleep(2000);
		dp.select_image();
	    
	
	}

	@Then("User select on delete option")
	public void user_select_on_delete_option() throws InterruptedException {
		Thread.sleep(2000);
		dp.select_delete();
	
	}

	@Then("User click ok")
	public void user_click_ok() throws InterruptedException {
	    Thread.sleep(2000);
		dp.click_ok();
	
	}

}
