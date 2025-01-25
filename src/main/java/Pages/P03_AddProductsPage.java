package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_AddProductsPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public P03_AddProductsPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By first_product = By.xpath("(//img[@class='product-image-photo'])[1]");
    private final By second_product = By.xpath("(//img[@class='product-image-photo'])[2]");
    private final By add_to_compare = By.xpath("//a[@class='action tocompare']");
    private final By logoicon = By.xpath("//a[@class='logo']");

    // method for add first product to compare list
    public void addFirstProduct(){

        // Scroll to Hot Sellers section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)");

        // select the first product
        WebElement firstproduct = driver.findElement(first_product);
        firstproduct.click();

        // Scroll to Add to Compare button
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,400)");

        // add the product to compare list
        WebElement addtocompare = driver.findElement(add_to_compare);
        addtocompare.click();

        // navigate to home page
        driver.findElement(logoicon).click();
    }

    // method for add second product to compare list
    public void addSecondProduct(){

        // Scroll to Hot Sellers section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)");

        // select the second product
        WebElement secondproduct = driver.findElement(second_product);
        secondproduct.click();

        // Scroll to Add to Compare button
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,400)");

        // add the product to compare list
        WebElement addtocompare = driver.findElement(add_to_compare);
        addtocompare.click();
    }
}
