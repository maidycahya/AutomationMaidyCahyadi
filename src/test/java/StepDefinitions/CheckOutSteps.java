package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckOutSteps {

	WebDriver driver = null;

	@Given("browser is open checkout1")
	public void browser_is_open_checkout1() {
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@When("user is on login page checkout1")
	public void user_is_on_login_page_checkout1() {
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^checkout1 user enters (.*) and (.*)$")
	public void checkout1_user_for_enters_username_and_password(String step_username, String step_password) throws InterruptedException {
		System.out.println("Inside step user enters username and password");

		driver.findElement(By.id("user-name")).sendKeys(step_username);
		driver.findElement(By.id("password")).sendKeys(step_password);

		Thread.sleep(2000);
	}

	@And("clicks on login button checkout1")
	public void clicks_on_login_button_checkout1() throws InterruptedException {
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page checkout1")
	public void user_is_navigated_to_the_home_page_checkout1() throws InterruptedException {
		System.out.println("Inside step user is navigated to the home page");

		driver.getPageSource().contains("Products");

		Thread.sleep(2000);


	}


	@And("add to cart sauce labs backpack checkout1")
	public void add_to_cart_sauce_labs_backpack_checkout1() throws InterruptedException {
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}

	@And("shopping cart container checkout1")
	public void shopping_cart_container_checkout1() throws InterruptedException {
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("shopping_cart_container")).click();

		Thread.sleep(2000);
	}

	@Then("user is navigated to the chart information checkout1")
	public void user_is_navigated_to_the_chart_information_checkout1() throws InterruptedException {
		System.out.println("Inside step user is navigated to the Chart information");

		driver.getPageSource().contains("cart_contents_container");

		Thread.sleep(2000);
	}

	@And("user proceeds to checkout checkout1")
	public void user_proceeds_to_checkout_checkout1() throws InterruptedException {
		System.out.println("user proceeds to checkout");


		driver.findElement(By.id("checkout")).click();

		Thread.sleep(2000);
	}

	@When("^user input information (.*) and (.*) and (.*)$")
	public void user_input_information(String first_name, String last_name, String portal_code) throws InterruptedException {
		System.out.println("Inside step user enters first name, last name and postal-code");

		driver.findElement(By.id("first-name")).sendKeys(first_name);
		driver.findElement(By.id("last-name")).sendKeys(last_name);
		driver.findElement(By.id("postal-code")).sendKeys(portal_code);

		Thread.sleep(2000);
	}

	@And("user click on continue")
	public void user_click_on_continue() throws InterruptedException {
		System.out.println("user click on continue");


		driver.findElement(By.id("continue")).click();

		Thread.sleep(2000);
	}

	@And("user click on finish")
	public void user_click_on_finish() throws InterruptedException {
		System.out.println("user click on finish");

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
	}

	@Then("user checkout in successfully")
	public void user_checkout_in_successfully() throws InterruptedException {
		System.out.println("user checkout in successfully");

		driver.getPageSource().contains("Complete!");

		Thread.sleep(2000);

		driver.close();
		driver.quit();


	}
}


