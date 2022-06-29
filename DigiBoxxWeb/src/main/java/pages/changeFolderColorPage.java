package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class changeFolderColorPage {
	WebDriver driver;
	
	public changeFolderColorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="kebab-icon-box_126360")
	WebElement option ;			
	
	@FindBy(how=How.XPATH,using="//div[@class='fo-wrap']/ul/li[8]")
	WebElement change;
	
	@FindBy(how=How.XPATH,using="//div[@id='mat-select-value-1']/following::div")
	WebElement choose;
	
	@FindBy(how=How.ID,using="mat-option-7")
	WebElement color;
	
	public void select_option()
	{
		option.click();
	}
	
	public void change_coloroption()
	{
		change.click();
	}
	
	public void choose_color()
	{
		choose.click();
	}
	
	public void color()
	{
		
		color.click();
	}
	
}
