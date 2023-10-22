package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChartSteps {

	WebDriver driver = null;

	@Given("browser is open chart")
	public void browser_is_open_chart(){
		System.out.println("Inside step browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@When("user is on login page chart")
	public void user_is_on_login_page_chart(){
		System.out.println("Inside step user in on login page");

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^chart user enters (.*) and (.*)$")
	public void chart_user_for_enters_username_and_password(String step_username, String step_password) throws InterruptedException {
		System.out.println("Inside step user enters username and password");

		driver.findElement(By.id("user-name")).sendKeys(step_username);
		driver.findElement(By.id("password")).sendKeys(step_password);

		Thread.sleep(2000);
	}

	@And("clicks on login button chart")
	public void clicks_on_login_button_chart() throws InterruptedException{
		System.out.println("Inside step clicks on login button");

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page chart")
	public void user_is_navigated_to_the_home_page_chart() throws InterruptedException {
		System.out.println("Inside step user is navigated to the home page");

		driver.getPageSource().contains("Products");

		Thread.sleep(2000);


	}


	@And("add to cart sauce labs backpack")
	public void add_to_cart_sauce_labs_backpack() throws InterruptedException{
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}

	@And("shopping cart container")
	public void shopping_cart_container() throws InterruptedException {
		System.out.println("Inside step user adds the product to cart");


		driver.findElement(By.id("shopping_cart_container")).click();

		Thread.sleep(2000);
	}
	@Then("user is navigated to the chart information")
	public void user_is_navigated_to_the_chart_information() throws InterruptedException {
		System.out.println("Inside step user is navigated to the Chart information");

		driver.getPageSource().contains("cart_contents_container");

		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}


	}


