package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.changeFolderColorPage;
import pages.digiLoginPage;

public class changeFolderColorStepDef {
	WebDriver driver;
	digiLoginPage dl;
	changeFolderColorPage cfc;
	
	 @Given("^User login to DigiBox$")
	    public void user_login_to_digibox() throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(3000);
			dl.click_login();
			cfc= new changeFolderColorPage(driver);
	       
	    }

	    @When("^User click on the option detail$")
	    public void user_click_on_the_option_detail() throws InterruptedException  {
	    	Thread.sleep(5000);
	       cfc.select_option();
	    }

	    @Then("^User click on change color$")
	    public void user_click_on_change_color() throws InterruptedException  {
	    	Thread.sleep(3000);
	       cfc.change_coloroption();
	    }

	    @Then("^User click on select color$")
	    public void user_click_on_select_color() throws InterruptedException  {
	    	Thread.sleep(5000);
	       cfc.choose_color();
	    }

	    @Then("^user select color$")
	    public void user_select_color() throws InterruptedException  {
	    	Thread.sleep(5000);
	       cfc.color();
	    }

	

}
