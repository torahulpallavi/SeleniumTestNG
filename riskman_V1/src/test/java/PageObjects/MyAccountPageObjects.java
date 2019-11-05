package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageObjects {

	public WebDriver ldriver;
	
	public MyAccountPageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'View or change my account information.')]")
	@CacheLookup
	WebElement lnkchngeacc;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement txtlastname;
	
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement btncontinue;
	
	public void changeAcc()
	{
		lnkchngeacc.click();
	}

	public void setlastname(String lastname)
	{
		txtlastname.sendKeys(lastname);
	}
	
	public void conti()
	{
		btncontinue.click();
	}
	
}
