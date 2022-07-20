package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {
WebDriver driver;
	
	public DeletePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy(how=How.ID,using="checkbox_fil_533207")
	WebElement select;

	@FindBy(how=How.XPATH,using="//li[@class='head-icons'][2]")
	WebElement delete;
	
	@FindBy(how=How.XPATH,using="//div[@id='confirm_popup_select_all']/*/*/button[1]")
	WebElement ok;
	
	public void select_image() throws InterruptedException
	{
		Thread.sleep(2000);
		select.click();
	}
	
	public void select_delete() throws InterruptedException
	{
		Thread.sleep(2000);
		delete.click();
	}
	
	public void click_ok() throws InterruptedException
	{
		Thread.sleep(2000);
		ok.click();
	}
}
