package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;
import PageObjects.MyAccountPageObjects;
import PageObjects.cartContentsPgeObjects;

public class tc003checkCartContent extends baseClass{

	
	@Test
	//@Parameters("browser")
	public void cartcontent() throws InterruptedException
	{
	//dr.get(baseUrl);
	cartContentsPgeObjects c= new cartContentsPgeObjects(dr);
	MyAccountPageObjects m = new MyAccountPageObjects(dr);
	/*LoginPageObject l = new LoginPageObject(dr);
	
		l.clickMyAccount();
	l.setUserName(username);
	l.setPassword(password);
	l.clickSubmit();*/
	Thread.sleep(1000);
	c.clickcartcont();
	c.clickcheckout();
	c.clickcon();
	//m.conti();
	
	
	
	
}

}
