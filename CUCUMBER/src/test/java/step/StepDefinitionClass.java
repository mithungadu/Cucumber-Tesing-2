package step;

import static org.testng.Assert.assertEquals;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import BeginnerCucumber.homepage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	
	WebDriver driver;
	
	/*
	 * @Given (""^User navigates to flipkart$") public void goto() { //WebDriver
	 * driver; 
	 * 
	 * }
	 */
	
	@Before
	 public void beforemethod()
	 {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		System.out.println("before executed");
		
	 }
	
	@After
	public void aftermethod()
	{
		driver.quit();
		System.out.println("after is executed");
	}
	
	@Given("^User navigates to Facebook$")
	public void user_navigates_to_facebook() throws Exception {
				 
	    driver.get("https://www.facebook.com/"); 
	    driver.manage().window().maximize();
	    
	}

	@When ("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Exception {

      homepage hpobjct = new homepage(driver);
	  hpobjct.login(arg1, arg2);
	}

	@Then("^Login should be succesful$")
	public void login_should_be_succesful() throws Exception {
		homepage hpobjct = new homepage(driver);
		hpobjct.logincheck();
	    
	}

}
