package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class digiLoginPage {
	
		WebDriver driver;

			public digiLoginPage(WebDriver driver)
			{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
			
			
			@FindBy(how=How.NAME,using="workspace")
			WebElement digispace;
			
			@FindBy(how=How.ID,using="Username")
			WebElement email;
			
			@FindBy(how=How.ID,using="Password")
			WebElement password;
			
			@FindBy(how=How.CLASS_NAME,using="start-btn")
			WebElement login;
			
			@FindBy(how=How.XPATH,using ="//div[@class='popup-wrap lightgray-bg alert-wrap-pop']/child::div[3]/a")
			WebElement click_here;
			
			public void enter_digi(String str)
			{
				digispace.sendKeys(str);
			}
			public void enter_email(String str)
			{
				email.sendKeys(str);
			}
			public void enter_pass(String str)
			{
				password.sendKeys(str);
			}
			public void click_login() throws InterruptedException
			{
				login.click();
				Thread.sleep(5000);
				click_here.click();
			
			}
			public void login_details(String str,String str1,String str2) throws InterruptedException
			{
				digispace.sendKeys(str);
				email.sendKeys(str1);
				password.sendKeys(str2);
//					login.click();
				Thread.sleep(2000);
//					click_here.click();
				
			}
		

}
