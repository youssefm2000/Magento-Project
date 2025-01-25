package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class P02_RegisterPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public P02_RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By page_title = By.xpath("//span[@class='base']");
    private final By firstname_field = By.id("firstname");
    private final By lastname_field = By.id("lastname");
    private final By email_address_field = By.id("email_address");
    private final By password_field = By.id("password");
    private final By password_confirmation_field = By.id("password-confirmation");
    private final By register_button = By.xpath("//button[@title='Create an Account']");
    private final By logoicon = By.xpath("//a[@class='logo']");


    // method for registeration with valid data and check success message
    public P03_AddProductsPage userRegisteration(String firstname, String lastname, String email, String Password, String password_confirmation) {

        // wait until title of register page is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(page_title));

        // find elements and take actions to it
        driver.findElement(firstname_field).sendKeys(firstname);
        driver.findElement(lastname_field).sendKeys(lastname);
        driver.findElement(email_address_field).sendKeys(email);
        driver.findElement(password_field).sendKeys(Password);
        driver.findElement(password_confirmation_field).sendKeys(password_confirmation);
        driver.findElement(register_button).click();

        // redirect to home page
        driver.findElement(logoicon).click();

        return new P03_AddProductsPage(driver);
    }
}