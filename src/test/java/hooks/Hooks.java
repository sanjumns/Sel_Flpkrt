package hooks;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cosntants.AppConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks implements AppConstants{
	WebDriver driver;
	 @Before
	    public void beforeScenario() {
		 
		 WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get(url);
		 
	        System.out.println("=== This runs before each scenario ===");
	        // Example: Initialize WebDriver or set up test data
	    }

	    @After
	    public void afterScenario() {
	        System.out.println("=== This runs after each scenario ===");
	        // Example: Close WebDriver or clean up resources
	    }

//	    @BeforeStep
//	    public void beforeStep() {
//	        System.out.println("--- This runs before each step ---");
//	    }
//
//	    @AfterStep
//	    public void afterStep() {
//	        System.out.println("--- This runs after each step ---");
//	    }
	}
