package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ImageInsideFolderPage {
	WebDriver driver;
	
	public ImageInsideFolderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='kebab-icon-box_126213']/following::div[1]")
	WebElement folder;

	@FindBy(how=How.XPATH,using="//span[@class='add-btn']")
	WebElement add;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/ul/li[1]")
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
	

	public void select_image() throws AWTException
	{
		

		
	      StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\pic1.jfif");
	    
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	
	      Robot r = new Robot();
	   
	      r.keyPress(KeyEvent.VK_ENTER);
	  
	      r.keyRelease(KeyEvent.VK_ENTER);
	
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	    
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	    
	      r.keyPress(KeyEvent.VK_ENTER);
	    
	      r.keyRelease(KeyEvent.VK_ENTER);
				
	}

}
