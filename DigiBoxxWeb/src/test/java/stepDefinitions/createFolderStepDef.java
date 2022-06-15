package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.createFolderPage;
import pages.digiLoginPage;



public class createFolderStepDef {

	WebDriver driver;
	digiLoginPage dl;
	createFolderPage cf;

	 @Given("User login")
	 public void user_login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(3000);
			dl.click_login();
			cf	=new createFolderPage(driver);
	 }
	 
	 @When("User click on add")
	 public void user_click_on_add() throws InterruptedException {
		 Thread.sleep(3000);
		 cf.add_button();
	  }
	 
	@Then("User click on create folder")
	public void user_click_on_create_folder() throws InterruptedException {
		Thread.sleep(2000);					
		cf.select_createfolder();
	   Thread.sleep(3000);
	   }
			
	@And("User enter name for folder")
	public void user_enter_name_for_folder() {
		cf.folder_name("Images");
			   
	}
			
	@Then("User click on create")
	public void user_click_on_create() {
		cf.createfolder();
			    
	}


}
