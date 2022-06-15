package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class videoUploadPage {
	WebDriver driver;
	
	public videoUploadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void select_video() throws AWTException, InterruptedException
	{
		

		  
	      StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\video.mp4");
	      
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
