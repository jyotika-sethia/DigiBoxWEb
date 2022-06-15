package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultipleImagePage {
	WebDriver driver;
	
	public MultipleImagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
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
