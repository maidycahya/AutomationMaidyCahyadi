package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogoutSteps {

	WebDriver driver = null;

	@Given("browser is open logout")
	public void browser_is_open_logout(){
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@When("user is on login page logout")
	public void user_is_on_login_page_logout(){
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^logout user enters (.*) and (.*)$")
	public void logout_user_for_enters_username_and_password(String logout_username, String logout_password) throws InterruptedException {
		System.out.println("Inside step user enters username and password");

		driver.findElement(By.id("user-name")).sendKeys(logout_username);
		driver.findElement(By.id("password")).sendKeys(logout_password);

		Thread.sleep(2000);
	}

	@And("clicks on login button logout")
	public void clicks_on_login_button_logout() {
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to the home page logout")
	public void user_is_navigated_to_the_home_page_logout() throws InterruptedException {
		System.out.println("Inside step user is navigated to the home page");

		driver.getPageSource().contains("Products");

		Thread.sleep(2000);


	}


	@And("add to cart sauce labs backpack logout")
	public void add_to_cart_sauce_labs_backpack_logout() throws InterruptedException {
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}

	@And("shopping cart container logout")
	public void shopping_cart_container_logout() throws InterruptedException{
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);

	}
	@And("clicks on hamburger menu logout")
	public void clicks_on_hamburger_menu_logout() throws InterruptedException{
		System.out.println("Inside step clicks on burger menu");

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}

	@And("click on menu logout logout")
	public void click_on_menu_logout_logout() throws InterruptedException{
		System.out.println("Inside step clicks on burger menu");

		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(2000);

	}

	@Then("user is navigated to dashboard login")
	public void user_is_navigated_to_dashboard_login() throws InterruptedException {
		System.out.println("Inside step user is navigated to dashboard login");

		driver.getPageSource().contains("login_container");

		Thread.sleep(2000);

		driver.close();
		driver.quit();


	}


	}


