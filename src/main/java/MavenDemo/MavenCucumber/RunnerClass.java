package MavenDemo.MavenCucumber;


import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;


public class RunnerClass {

	@Test
	@But ("^user unable to login1$")
	public void user_unable_to_login1()
	{
		System.out.println("user unable to login");
	}
	
	@Test
	@Then ("^User Enter userID and Password1$")
	public void User_Enter_userID_and_Password1()
	{
		System.out.println("User Enter userID and Password");
	}
	
	@Test
	@And ("^user Login successful1$")
	public void user_Login_successful1()
	{
		System.out.println("user Login successful");
	}

	@Then ("^user navigate$")
	@Test
	public void user_navigate()
	{
		System.out.println("user navigate");
	}

	
} 
        