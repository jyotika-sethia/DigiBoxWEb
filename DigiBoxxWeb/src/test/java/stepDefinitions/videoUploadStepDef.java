package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.videoUploadPage;

public class videoUploadStepDef {
	WebDriver driver;
	videoUploadPage vp=new videoUploadPage(driver);
	
	@Then("User select an video")
	public void user_select_an_video() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		vp.select_video();
	   
	}

}
