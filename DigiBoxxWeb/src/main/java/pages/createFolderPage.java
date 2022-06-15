package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createFolderPage {
	WebDriver driver;
	
	public createFolderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(how=How.XPATH,using="//li/span[@class='add-btn']")
	WebElement add;

//	@FindBy(how=How.XPATH,using="//span[text()='+ Add ']")
//	WebElement add;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/descendant::li[3]")
	WebElement select;			//div[@class='ng-star-inserted']/ul/li/a[1]
	
	@FindBy(how=How.ID,using="folderName")
	WebElement name;
	
	@FindBy(how=How.XPATH,using="//button[@class='start-btn log-btn my-1']")
	WebElement create;
	
	public void add_button()
	{
//		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(add));
		add.click();
	}
	
	public void select_createfolder() 
	{
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(select));
		select.click();
	}
	public void folder_name(String str)
	{
		name.sendKeys(str);
	}
	public void createfolder()
	{
		create.click();
	}
	

}
