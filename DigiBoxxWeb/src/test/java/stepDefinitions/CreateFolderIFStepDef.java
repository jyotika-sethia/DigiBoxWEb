package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateFolderIFPage;
import pages.digiLoginPage;

public class CreateFolderIFStepDef extends Base_setup {

	WebDriver driver;
	digiLoginPage dl;
	CreateFolderIFPage cff;
	
	
	@Given("User login to the digi webpage")
	public void user_login_to_the_digi_webpage() throws IOException, InterruptedException {
		driver= initialiseDriver();
		Thread.sleep(2000);
		dl=new digiLoginPage(driver);
		dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
		Thread.sleep(5000);



		dl.click_login();
		cff= new CreateFolderIFPage(driver);
	   
	    
	}

	@When("User click on the existing folder")
	public void user_click_on_the_existing_folder() throws InterruptedException {
		Thread.sleep(2000);
		cff.select_folder();
	    
	}

	@Then("User click on add icon")
	public void user_click_on_add_icon() throws InterruptedException {
		 Thread.sleep(3000);
		 cff.add_button();
	   
	    
	}

	@Then("User click on create folder option")
	public void user_click_on_create_folder_option() throws InterruptedException {
		Thread.sleep(2000);					
		cff.select_createfolder();
	   Thread.sleep(3000);
	   
	    
	}

	@Then("User enter the name for folder")
	public void user_enter_the_name_for_folder() {
		cff.folder_name("sub-folder");
	   
	    
	}

	@Then("User click create")
	public void user_click_create() {
		cff.createfolder();
	   
	    
	}

}
