package test_cases;

import java.time.Duration;

import org.testng.annotations.*;

import pom_class.AdactinLogin;

public class AdactinLogin_test extends AdactinLoginBase_Class
{
	@Test
	public void logintest() 
	{
		AdactinLogin log=new AdactinLogin(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    log.SetUsername();
	    System.out.println("username is entered");
	    log.SetPassword();
	    System.out.println("password is entered");
	    log.ClickLogin();
	    System.out.println("Login Button Clicked");
	    System.out.println("Login Activity Completed");
	   }

}
