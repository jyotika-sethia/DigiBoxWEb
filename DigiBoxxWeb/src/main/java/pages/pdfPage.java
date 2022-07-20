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

public class pdfPage {
	WebDriver driver;
	
	public pdfPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(how=How.XPATH,using="//li/span[@class='add-btn']")
	WebElement add;
	

	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/ul/li/a[1]")
	WebElement upload;
	
	public void add()
	{
		add.click();
	}
	
	public void upload()
	{
		upload.click();
	}
	
	public void select_pdf() throws AWTException, InterruptedException
	{
		

		  
	      StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\API Testing - Part-02 (2)");
	      
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      
	      Robot r = new Robot();
	      Thread.sleep(3000);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      Thread.sleep(3000);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      Thread.sleep(3000);
	      r.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(3000);
	      r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	
	
	
	

}
