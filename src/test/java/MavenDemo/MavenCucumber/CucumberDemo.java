//Author" Nitin shinde
package MavenDemo.MavenCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDemo  {
	
	WebDriver driver;
	@Test(priority = 1)
	@Given("^Browser is open$")
	public void Browser_is_open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is open");
	}
	
	@Test(priority = 2)
	@When ("^User navigate to Application$")
	public void User_navigate_to_Application()
	{
		driver.get("http://www.facebook.com");
		System.out.println("User Navigate to application");
	}

	@Test(priority = 3)
	@Then ("^User Enter invalid userID and Password$")
	public void User_Enter_invalid_userID_and_Password()
	{
		System.out.println("user login");
	}
	
	@Test
	@Then ("^User click on Login Button$")
	public void User_click_on_Login_Button()
	{
		System.out.println("user click on login button");
	}
	
	@Test
	@But ("^user unable to login$")
	public void user_unable_to_login()
	{
		System.out.println("user unable to login");
	}
	
	@Test
	@Then ("^User Enter userID and Password$")
	public void User_Enter_userID_and_Password()
	{
		System.out.println("User Enter userID and Password");
	}
	
	@Test
	@And ("^user Login successful$")
	public void user_Login_successful()
	{
		System.out.println("user Login successful");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("close the Browser");
		driver.quit();
	}
	
	
	
}