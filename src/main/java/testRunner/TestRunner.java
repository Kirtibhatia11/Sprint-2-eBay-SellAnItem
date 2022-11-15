package testRunner;

import org.openqa.selenium.WebDriver;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", dryRun = false,
		// new homePage(driver)monochrome = true,
		features = ".\\Features\\Sellings.feature", glue = "stepDefinition", plugin = { "pretty",
				"html:target/Cucumber_Reports/report.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;

	public static void setDriver(WebDriver webDriver) {
		driver = webDriver;
	}
}
