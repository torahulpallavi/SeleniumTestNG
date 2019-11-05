package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {


		public WebDriver ldriver;
		
		public LoginPageObject(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//input[@name='email_address']")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(xpath="//input[@name='password']")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//span[(text()='My Account')]")
		@CacheLookup
		WebElement btnmyacc;
		
		@FindBy(xpath="//span[contains(text(),'Sign In')]")
		@CacheLookup
		WebElement btnLogin;
		
		
		
		
		@FindBy(xpath="//span[contains(text(),'Log Off')]")
		@CacheLookup
		WebElement logoff;
		
		
		
		public void setUserName(String uname)
		{
			txtUserName.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
		
		
		public void clickSubmit()
		{
			btnLogin.click();
		}	
		
		public void clickLogout()
		{
			logoff.click();
		}
		
		
		public void clickMyAccount()
		{
			btnmyacc.click();
		}
	}


