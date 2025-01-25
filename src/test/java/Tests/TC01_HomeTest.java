package Tests;
import Pages.P01_HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC01_HomeTest extends TestBase {

    public P01_HomePage homePage;

    @Feature("Navigate To Create An Account Page")
    @Description("Test Description: Go to Register Page to Sign in")
    @Test(description = "User will go to Register Page")
    public void goToRegisterPage() {
        homePage = new P01_HomePage(driver);
        homePage.navigateToRegisterPage();
    }
}