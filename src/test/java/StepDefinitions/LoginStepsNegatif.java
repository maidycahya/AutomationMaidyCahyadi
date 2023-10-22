package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepsNegatif {

	WebDriver driver = null;

	@Given("browser is open negative")
	public void browser_is_open_negative(){
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}
	
	@When("user is on login page negative")
	public void user_is_on_login_page_negative(){
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^negative user enters (.*) and (.*)$")
	public void negative_user_enters_username_and_password(String invalid_username, String invalid_password) throws InterruptedException {
		System.out.println("Inside step user enters username and password negative");

		driver.findElement(By.id("user-name")).sendKeys(invalid_username);
		driver.findElement(By.id("password")).sendKeys(invalid_password);

		Thread.sleep(2000);
	}

	@And("clicks on login button negative")
	public void clicks_on_login_button_negative() {
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
	}

	@Then("user sees an error message negative")
	public void user_sees_an_error_message_negative() throws InterruptedException {
		System.out.println("Inside step user sees an error message");


		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}


}
