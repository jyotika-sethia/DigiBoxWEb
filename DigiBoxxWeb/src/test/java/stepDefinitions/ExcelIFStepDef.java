package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExcelIFPage;
import pages.PdfInsideFolderPage;
import pages.digiLoginPage;

public class ExcelIFStepDef extends Base_setup {
	WebDriver driver;
	digiLoginPage dl;
	ExcelIFPage ei;

	@Given("login to digi webpage")
	public void login_to_digi_webpage() throws IOException, InterruptedException {
		 driver= initialiseDriver();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(5000);
			dl.click_login();
			ei= new ExcelIFPage(driver);

	}

	@When("select folder icon")
	public void select_folder_icon() throws InterruptedException {
		Thread.sleep(2000);
		ei.select_folder();

	}

	@Then("click add option")
	public void click_add_option() {
		ei.add_button();

	}

	@Then("select upload excel")
	public void select_upload_excel() {
		ei.upload_excel();

	}

	@Then("select excel")
	public void select_excel() throws AWTException {
		ei.select_excel();

	}

}
