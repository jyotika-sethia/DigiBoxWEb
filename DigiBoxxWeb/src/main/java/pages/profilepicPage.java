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

public class profilepicPage {
	WebDriver driver;
	public profilepicPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//li[@class='btn-margin profile-pop']")
	WebElement icon;
	
	@FindBy(how=How.XPATH,using="//ul[@class='pro-links']/descendant::a[1]")
	WebElement profile_icon;
	
	@FindBy(how=How.XPATH,using="//div[@class='edit-user-icon']")
	WebElement choose_file;
	
	@FindBy(how=How.XPATH,using="//a[@class='start-btn m-auto text-center']")
	WebElement select_image;
	
	
	
	public void icon()
	{
		icon.click();
	}
	
	public void profile_icon()
	{
		profile_icon.click();
	}
	
	public void choose_file()
	{
		choose_file.click();
	}
	
	public void select_file() throws AWTException
	{	
		StringSelection s= new StringSelection("C:\\Users\\sethi\\Downloads\\roses.jfif");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void select_image()
	{
		select_image.click();
	}
}
