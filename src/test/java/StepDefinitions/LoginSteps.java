package StepDefinitions;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open(){
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}
	
	@When("user is on login page")
	public void user_is_on_login_page(){
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Inside step user enters username and password");

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(2000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside step user is navigated to the home page");

		driver.getPageSource().contains("Products");

		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}


}
