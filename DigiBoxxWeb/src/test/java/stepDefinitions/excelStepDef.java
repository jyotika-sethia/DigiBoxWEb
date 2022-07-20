package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.digiLoginPage;
import pages.excelPage;
import pages.pdfPage;

public class excelStepDef extends Base_setup {
	WebDriver driver;
	digiLoginPage dl;
	excelPage ep;
	
	@Given("User login to website")
	public void user_login_to_website() throws IOException, InterruptedException {
		driver = initialiseDriver();
		Thread.sleep(2000);
		dl = new digiLoginPage(driver);
		dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
		Thread.sleep(5000);
		dl.click_login();
		ep = new excelPage(driver);
	    
	    
	}

	@When("User click on the add option")
	public void user_click_on_the_add_option() throws InterruptedException {
		Thread.sleep(3000);
		ep.add();
	    
	    
	}

	@Then("User select upload option")
	public void user_select_upload_option() {
		ep.upload();
	    
	}

	@Then("User select excel file")
	public void user_select_excel_file() throws AWTException, InterruptedException {
		   ep.select_excel();
			
	    
	}


}
