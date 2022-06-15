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

public class imageUploadPage {
	WebDriver driver;
	
	public imageUploadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.XPATH,using="//li/span[@class='add-btn'] ")
	WebElement add;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-star-inserted']/ul/li/a[1]")
	WebElement upload;
	
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
		

		   // file path passed as parameter to StringSelection
	      StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\pic1.jfif");
	      // Clipboard copy
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	     
	      //identify element and click
	      	      // Robot object creation
	      Robot r = new Robot();
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
				
	}

}
