package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AboutSteps {

	WebDriver driver = null;

	@Given("browser is open product")
	public void browser_is_open_product(){
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}
	
	@When("user is on login page product")
	public void user_is_on_login_page_product(){
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^product user enters (.*) and (.*)$")
	public void product_user_enters_username_and_password(String product_username, String product_password) throws InterruptedException {
		System.out.println("Inside step user enters username and password product");

		driver.findElement(By.id("user-name")).sendKeys(product_username);
		driver.findElement(By.id("password")).sendKeys(product_password);

		Thread.sleep(2000);
	}

	@And("clicks on login button product")
	public void clicks_on_login_button_product() throws InterruptedException {
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@And("clicks on hamburger menu")
	public void clicks_on_hamburger_menu() throws InterruptedException {
		System.out.println("Inside step clicks on burger menu");

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}

	@And("click menu about")
	public void click_menu_about() throws InterruptedException {
		System.out.println("Inside step clicks on about menu");

		driver.findElement(By.id("about_sidebar_link")).click();
		Thread.sleep(2000);

	}

	@Then("user is navigated to the about information")
	public void user_is_navigated_to_the_about_information() throws InterruptedException {
		System.out.println("Inside step user is navigated to about page");

		driver.getPageSource().contains("__next");

		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}



	}



