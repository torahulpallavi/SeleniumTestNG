package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import PageObjects.LoginPageObject;
import PageObjects.MyAccountPageObjects;

public class tc002MyAccount extends baseClass{

	@Test
	//@Parameters("browser")
	public void myaccount()
	{
	//dr.get(baseUrl);
	//LoginPageObject l = new LoginPageObject(dr);
	/*l.clickMyAccount();
	l.setUserName(username);
	l.setPassword(password);
	l.clickSubmit();*/
	MyAccountPageObjects m = new MyAccountPageObjects(dr);
	m.changeAcc();
	m.txtlastname.clear();
	m.setlastname(lastn);
	m.conti();
	/*l.clickLogout();
	m.conti();
	*/
}
	
}

