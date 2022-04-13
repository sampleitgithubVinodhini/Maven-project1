package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.hj.bs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flips extends bs {

	@Given("user is in the flipkart homepage")
	public void user_is_in_the_flipkart_homepage() 
	{
		
		BL();
		URL();
		un();
		psw();
		lgn();
		
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-Workspace1\\Selenium_Testing\\Driver 2\\chromedriver.exe");
		//RemoteWebDriver driver = new ChromeDriver();
		//driver.get("https://adactinhotelapp.com/");
	}
	
	@When("user is able to see the flipkart logo in the middle of the homepage with prescribed colours")
	public void user_is_able_to_see_the_flipkart_logo_in_the_middle_of_the_homepage_with_prescribed_colours() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user takes screenshot of the logo.")
	public void user_takes_screenshot_of_the_logo() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("close the homepage")
	public void close_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
}
