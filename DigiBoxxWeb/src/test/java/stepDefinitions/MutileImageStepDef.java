package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.MultipleImagePage;

public class MutileImageStepDef {
	WebDriver driver;
	MultipleImagePage mi =new MultipleImagePage(driver);
	
	
	@Then("User select multiple images")
	public void user_select_multiple_images() throws AWTException, InterruptedException {
		 Thread.sleep(4000);
	     mi.select_image();
	}

}
