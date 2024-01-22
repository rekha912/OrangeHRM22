package Com.TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	@Test
	public void validiateLoginPageFunctionality()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginPageFunctionality("Admin", "admin123");
		
	}
	
	
	
	
	

}
