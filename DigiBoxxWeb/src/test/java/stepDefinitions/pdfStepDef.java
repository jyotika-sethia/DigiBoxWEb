package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.digiLoginPage;
import pages.pdfPage;

public class pdfStepDef extends Base_setup{
	WebDriver driver;
	digiLoginPage dl;
	pdfPage pd;
	
	@Given("User login to the website")
	public void user_login_to_the_website() throws IOException, InterruptedException {
		 driver= initialiseDriver();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(5000);
			dl.click_login();
			pd= new pdfPage(driver);
	
	}

	@When("User click on add option")
	public void user_click_on_add_option() throws InterruptedException {
		Thread.sleep(3000);
		pd.add();
	  
	
	}

	@Then("User select upload file option")
	public void user_select_upload_file_option() {
		pd.upload();
	   
	
	}

	@Then("User select pdf file")
	public void user_select_pdf_file() throws AWTException, InterruptedException {
	    pd.select_pdf();
	
	}

}
