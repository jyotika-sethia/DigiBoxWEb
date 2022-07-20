package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.digiLoginPage;
import pages.imageUploadPage;

public class imageUploadStepDef {
	WebDriver driver;
	digiLoginPage dl;
	imageUploadPage iu;


	 
	
	
	 @Given("User login to the webpage")
	 public void user_login_to_the_webpage() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://apptest.digiboxx.com/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			dl=new digiLoginPage(driver);
			dl.login_details("mozark14", "mozark14251093@gmail.com", "Gaurav@123");
			Thread.sleep(2000);
			dl.click_login();
			//dl.click_here();
			iu=new imageUploadPage(driver);
	
	 }
	 
	 @When("User click on add button")
	 public void user_click_on_add_button() throws InterruptedException {
		 Thread.sleep(3000);
		 iu.add_button();
	  	
	 }
	 
	 @Then("User select upload file")
	 public void user_select_upload_file() throws InterruptedException {
		 Thread.sleep(3000);
		 iu.upload_image();
	     
	 }
	 
	 @Then("User select an image")
	 public void user_select_an_image() throws InterruptedException, AWTException {
	     Thread.sleep(4000);
	     iu.select_image();
	
	 }
	 


}
