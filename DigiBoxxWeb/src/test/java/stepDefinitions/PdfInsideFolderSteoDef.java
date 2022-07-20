package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PdfInsideFolderPage;
import pages.digiLoginPage;
import pages.imageUploadPage;
import pages.pdfPage;

public class PdfInsideFolderSteoDef extends Base_setup {
	WebDriver driver;
	digiLoginPage dl;
	PdfInsideFolderPage pdi;

	@Given("login to webpage")
	public void login_to_webpage() throws InterruptedException, IOException {
		 driver= initialiseDriver();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(5000);
			dl.click_login();
			pdi= new PdfInsideFolderPage(driver);
	   
	  
	}

	@When("select folder")
	public void select_folder() throws InterruptedException {
		Thread.sleep(2000);
		pdi.select_folder();
	  
	}

	@Then("click add button")
	public void click_add_button() {
		pdi.add_button();
	  
	}
	
	@Then("select upload")
		public void select_upload()
	{
		pdi.upload_pdf();
	}

	@Then("select pdf")
	public void user_select_pdf() throws AWTException {

	  pdi.select_pdf();
	}
}
