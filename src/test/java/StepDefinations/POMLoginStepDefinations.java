package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.loginPage;

public class POMLoginStepDefinations {
	
	
	static WebDriver driver;
    loginPage login;
	@Given("User is on login page")
	public void user_is_on_login_page()
    {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
    }

	//@When("User enters the valid username and password")
	//public void user_enters_the_valid_username_and_password() 
	@When("User enters the valid {string} and {string}")
	//public void user_enters_the_valid_and(String string, String string2)
	public void user_enters_the_valid_and(String username, String password)
	{
	    
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 login = new loginPage(driver);
		 login.enetrUsername(username);
		 login.enterPassword(password);
		
		
		
		
		//driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Click on login button")
	public void click_on_login_button() 
	{
	   login.clicklogin();
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("User navigate to home page")
	public void user_navigate_to_home_page() 
	{
		
		login.isAppLogoDispalyed();
		
	   // Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User navigate to home page");
		
	}

	@And("Close the browser")
	public void close_the_browser() 
	{
	    
		//driver.close();
		driver.quit();
		System.out.println("Driver close sucessfully");
	}

	

}
