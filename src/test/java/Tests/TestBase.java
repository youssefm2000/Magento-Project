package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.time.Duration;
import Utilities.Helper;
public class TestBase {

    public WebDriver driver;

        // method for Start Driver
        @BeforeClass
        @Parameters({"browser"})
        public void setup(@Optional("chrome")  String browsername){

            if (browsername.contains("chrome")) {
                driver = new ChromeDriver();
            }

            else if (browsername.contains("firefox")) {
                driver = new FirefoxDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.navigate().to("https://magento.softwaretestingboard.com/");
        }

        // method for close Driver
        @AfterClass
        public void teardown(){
            driver.quit();
        }

        // method for take screenshot when test case fail and added to Screenshots folder
        @AfterMethod
        public void takescreenshot(ITestResult result) {

            if (result.getStatus() == ITestResult.FAILURE) {
                System.out.println("Failed!");
                System.out.println("TAKING Screenshot .....");
                Helper.capturescreenshot(driver, result.getName());
            }
        }
}

