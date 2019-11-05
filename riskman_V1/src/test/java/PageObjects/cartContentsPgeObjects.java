package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartContentsPgeObjects {

	public WebDriver ldriver;
	
	public cartContentsPgeObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//@FindBy(xpath="//span[contains(text(),'Cart Contents (1)')]")
	@FindBy(id="tdb1")
	@CacheLookup
	WebElement btncartcontent;
	
	
    @FindBy(id="tdb7")
    		
    @CacheLookup
	WebElement btnchkout;


    @FindBy(id="tdb6")
    		
    @CacheLookup
	WebElement btncon;
	public void clickcartcont()
	{
		
		btncartcontent.click();
	}
	public void clickcheckout()
	{
		
		btnchkout.click();
	}
	
	public void clickcon()
	{
		
		btncon.click();
	}
	
	
	
}
