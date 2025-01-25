package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_HomePage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public P01_HomePage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By create_account_button = By.linkText("Create an Account");

    // method for navigate to Register page
    public P02_RegisterPage navigateToRegisterPage() {
        WebElement createaccount = driver.findElement(create_account_button);
        createaccount.click();
        return new P02_RegisterPage(driver);
    }
}
