package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Setup.Base_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.digiLoginPage;
import pages.profilepicPage;

public class profilepicStepDef extends Base_setup {
	digiLoginPage dl;
	profilepicPage pp;
	
	@Given("^User go the webpage login$")
    public void user_go_the_webpage_login() throws IOException, InterruptedException  {
		 driver= initialiseDriver();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(3000);
			dl.click_login();
			pp	=new profilepicPage(driver);
	        
	 }
	
	
    @When("^User click on profile icon$")
    public void user_click_on_profile_icon() throws InterruptedException  {
    	Thread.sleep(3000);
        pp.icon();
    }

    @Then("^User click on profile$")
    public void user_click_on_profile() throws InterruptedException  {
    	Thread.sleep(3000);
       pp.profile_icon();
    }

    @Then("^User select on image icon$")
    public void user_select_on_image_icon() throws InterruptedException  {
    	Thread.sleep(6000);
        pp.choose_file();
    }

    @Then("^User select image from directory$")
    public void user_select_image_from_directory() throws AWTException, InterruptedException  {
    	Thread.sleep(3000);
        pp.select_file();
    }
    
    @Then("^User click on select image$")
    public void user_click_on_select_image() throws InterruptedException  {
    	Thread.sleep(3000);
      pp.select_image();
    }

}
