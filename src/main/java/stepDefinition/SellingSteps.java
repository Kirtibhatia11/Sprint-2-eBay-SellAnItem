package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePage;
import testRunner.TestRunner;

public class SellingSteps {
	private static final String Assert = null;
	WebDriver driver;
	public homePage hp;
	String driverPath = "../Test_Artifact/Drivers/chromedriver.exe";

	private String url = "https://www.ebay.com/";


	@Given("User launch the browser")
	public void user_launch_the_browser() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		System.out.println("User launch the browser");
		Thread.sleep(2000);
		// throw new io.cucumber.java.PendingException();
	}

	@When("User opens the URL")
	public void user_opens_the_url() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
		Thread.sleep(2000);
		// throw new io.cucumber.java.PendingException();
	}

	@Then("Page title {string} should be displayed")
	public void page_title_should_be_displayed(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		TestRunner.setDriver(driver);
		Thread.sleep(2000);
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is in homepage")
	public void user_is_in_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is in the home page");
		// throw new io.cucumber.java.PendingException();
	}


	@When("User click on sell")
	public void user_click_on_sell() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver = TestRunner.driver;
		hp = new homePage(driver);
		hp.sell();
		Thread.sleep(2000);
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("User click on list an item")
	public void user_click_on_list_an_item() throws Exception {
		driver = TestRunner.driver;
		hp = new homePage(driver);
		hp.list();
		Thread.sleep(2000);
		// Write code here that turns the phrase above into concrete actions

		// throw new io.cucumber.java.PendingException();
	}

	@When("User search to sell for a product with name {string}")
	public void user_search_to_sell_for_a_product_with_name(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div/div[1]/div/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div/div[1]/div/div/div/input"))
				.sendKeys("shoes");
		hp = new homePage(driver);
		hp.searchButton();
		Thread.sleep(2000);                     
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("product should be displayed");
		Thread.sleep(2000);
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("the user is on the sell page")
	public void the_user_is_on_the_sell_page() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on continue without match")
	public void user_click_on_continue_without_match() throws Exception {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div/div[2]/button")).clear();
		driver = TestRunner.driver;
		hp = new homePage(driver);
		hp.continueWithoutMatch();
		Thread.sleep(2000);
		System.out.println("User click on continue match");
		// throw new io.cucumber.java.PendingException();
	}

	@When("click on New with box")
	public void click_on_new_with_box() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		hp = new homePage(driver);
		hp.newWithBox();
		Thread.sleep(2000);
	//	throw new io.cucumber.java.PendingException();
	}

	@Then("Continue to listing should be added")
	public void continue_to_listing_should_be_added() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}
/*	@When("user click on sign in link")
	public void user_click_on_sign_in_link() throws InterruptedException {
			hp.clickSignInLink();
			 Thread.sleep(15000);
		}
	@When("user navigates to Sign in page {string}")
	public void user_navigates_to_sign_in_page(String title) throws InterruptedException {
	 		// Assert.assertEquals(title, driver.getTitle());
	 		 
	 		 		 Thread.sleep(15000);
		}
		
	@When("user enters email as {string}")
	public void user_enters_email_as(String email) throws InterruptedException {
		hp.setUser();
		 Thread.sleep(30000);

		}
		
	@When("user click on continue")
	public void user_click_on_continue() throws InterruptedException {
	 		hp.clickContinue();
		 Thread.sleep(30000);
		}
	@When("user enters Password as {string}")
	public void user_enters_password_as(String password) throws InterruptedException {
		System.out.println(password);
	 		hp.setUserPassword(password);
	 				 Thread.sleep(30000);
		}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
			System.out.println("signIn test");
	 		hp.clickSignIn();
	 	   Thread.sleep(20000);
		}

/*	@Given("User is on the ebay login page")
	public void user_is_on_the_ebay_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver = TestRunner.driver;
	}

	@Given("User enters email as {string}")
	public void user_enters_email_as(String string) {
		// Write code here that turns the phrase above into concrete actions
	//	username.sendKeys("kibha9054");
		//hp.selling(string, string);
//		throw new io.cucumber.java.PendingException();
	}

	@Given("Password as {string}")
	public void password_as(String string) {
		// Write code here that turns the phrase above into concrete actions
//		password.sendKeys("Kirti@2001");
//		throw new io.cucumber.java.PendingException();
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
		// Write code here that turns the phrase above into concrete actions
//		submit_button.click();
//		throw new io.cucumber.java.PendingException();
	}

	@Then("user able to see the product")
	public void user_able_to_see_the_product() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}*/

	@Given("the user is on listing page")
	public void the_user_is_on_listing_page() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver = TestRunner.driver;
		hp = new homePage(driver);
		hp.listingButton();
		Thread.sleep(3000);
		// throw new io.cucumber.java.PendingException();
	}

	@When("user added basic details and advertising")
	public void user_added_basic_details_and_advertising() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@When("list it")
	public void list_it() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@Then("user get the listed item of products with details")
	public void user_get_the_listed_item_of_products_with_details() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}


/*@When("user click on sign in link")
public void user_click_on_sign_in_link() throws InterruptedException {
		hp.clickSignInLink();
		 Thread.sleep(15000);
	}
@When("user navigates to Sign in page {string}")
public void user_navigates_to_sign_in_page(String title) throws InterruptedException {
 		// Assert.assertEquals(title, driver.getTitle());
 		 
 		 		 Thread.sleep(15000);
	}
	
@When("user enters email as {string}")
public void user_enters_email_as(String email) throws InterruptedException {
	hp.setUser();
	 Thread.sleep(30000);

	}
	
@When("user click on continue")
public void user_click_on_continue() throws InterruptedException {
 		hp.clickContinue();
	 Thread.sleep(30000);
	}
@When("user enters Password as {string}")
public void user_enters_password_as(String password) throws InterruptedException {
	System.out.println(password);
 		hp.setUserPassword(password);
 				 Thread.sleep(30000);
	}

@When("user click on sign in button")
public void user_click_on_sign_in_button() throws InterruptedException {
		System.out.println("signIn test");
 		hp.clickSignIn();
 	   Thread.sleep(20000);

}*/
}
