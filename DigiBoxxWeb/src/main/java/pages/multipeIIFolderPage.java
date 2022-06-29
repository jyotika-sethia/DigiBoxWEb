package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class multipeIIFolderPage {
	
WebDriver driver;
	
	public multipeIIFolderPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='folder-wrap']")
	WebElement folder;
	
	@FindBy(how=How.XPATH,using="//li/span[@class='add-btn'] ")
	WebElement add;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/ul/li/a[1]")
	WebElement upload;
	
	public void select_folder()
	{
		folder.click();
	}
	
	public void add_button()
	{
		add.click();
	}
	
	public void upload_image()
	{
		upload.click();
	}
	

	public void select_image() throws AWTException, InterruptedException
	{
		

	      Robot r = new Robot();
	      //to select picture tab
	      r.mouseMove(20,220);
	      r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	      r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //to select multiple image
	      Thread.sleep(3000);
	      r.mouseMove(600,200);
	      r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	      r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.mouseMove(200,250);
	      r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	      r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	    
		
		
	}


}
