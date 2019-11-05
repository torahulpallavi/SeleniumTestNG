package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;
import PageObjects.MyAccountPageObjects;

public class tc001Login extends baseClass{
	LoginPageObject l = new LoginPageObject(dr);
	MyAccountPageObjects m = new MyAccountPageObjects(dr);
	@BeforeClass
public void loginTest()
{
	dr.get(baseUrl);
	/*LoginPageObject l = new LoginPageObject(dr);
	MyAccountPageObjects m = new MyAccountPageObjects(dr);*/
	l.clickMyAccount();
	l.setUserName(username);
	l.setPassword(password);
	l.clickSubmit();
	//System.out.println(dr.getTitle());
/*if (dr.getTitle().equals("My Account Information"))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
	
}*/
}
public void logout()
{
	l.clickLogout();
	m.conti();

}
}




