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

public class PdfInsideFolderPage {
WebDriver driver;
	
	public PdfInsideFolderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='folder-wrap']")
	WebElement folder;

	@FindBy(how=How.XPATH,using="//span[@class='add-btn']")
	WebElement add;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/ul/li[1]")
	WebElement upload;
	
	public void select_folder() throws InterruptedException
	{
		Thread.sleep(2000);
		folder.click();
	}
	
	public void add_button()
	{
		add.click();
	}
	
	public void upload_pdf()
	{
		upload.click();
	}
	

	public void select_pdf() throws AWTException
	{
		

		
	      StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\API Testing - Part-02 (2)");
	    
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
