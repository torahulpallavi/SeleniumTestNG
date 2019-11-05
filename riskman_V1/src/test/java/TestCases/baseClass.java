package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import PageObjects.LoginPageObject;
import PageObjects.MyAccountPageObjects;

public class baseClass {

	
	        public String baseUrl="http://5elementslearning.com/demosite/";
			public String username="zxc@outlook.com";
			public String password="zxc123";
			public String lastn="web";
			public static WebDriver dr;
			
			
			
			@Parameters("browser")
			@BeforeClass
		
			public void setup(String browser) throws InterruptedException
			{
				
				if(browser.equalsIgnoreCase("chrome"))
				{
				System.setProperty("webdriver.chrome.driver", "..//riskman_V1/drivers/chromedriver1.exe");
			dr= new ChromeDriver();
			}else if (browser.equalsIgnoreCase("ie")) {
				
			System.setProperty("webdriver.ie.driver", "..//riskman_V1/drivers/IEDriverServer.exe");
			dr= new InternetExplorerDriver();
			}
			//Logger log =new Lo
			/*}
			
			@BeforeClass
            public void loginTest() throws InterruptedException
            {*/LoginPageObject l = new LoginPageObject(dr);
			MyAccountPageObjects m = new MyAccountPageObjects(dr);
            	dr.get(baseUrl);
            	/*LoginPageObject l = new LoginPageObject(dr);
            	MyAccountPageObjects m = new MyAccountPageObjects(dr);*/
            	Thread.sleep(1000);
            	l.clickMyAccount();
            	l.setUserName(username);
            	l.setPassword(password);
            	l.clickSubmit();
			}
            	//System.out.println(dr.getTitle());
            /*if (dr.getTitle().equals("My Account Information"))
            {
            	Assert.assertTrue(true);
            }
            else
            {
            	Assert.assertTrue(false);
            	
            }*/
            //}
			
			/*@AfterMethod
            public void logout()
            {
            	l.clickLogout();
            	m.conti();

            }*/
            @AfterClass
            public void teardown()
            {
            LoginPageObject l = new LoginPageObject(dr);
			MyAccountPageObjects m = new MyAccountPageObjects(dr);
            
            	l.clickLogout();
            	m.conti();

            
            	dr.quit();
            }
            
            
           
            



}
