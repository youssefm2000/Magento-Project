package Tests;

import Data.DataReader;
import Pages.P01_HomePage;
import Pages.P02_RegisterPage;
import Pages.P03_AddProductsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC03_AddProductsTest extends TestBase {

    public P01_HomePage homePage;
    public P02_RegisterPage registerPage;
    public P03_AddProductsPage addProductsPage;

    @Feature("Add The 2 Products ")
    @Description("Test Description: User add 2 products to compare list")
    @Test(description = "User will add the first and second product from hot sellers to compare list")
    public void addProducts() throws IOException, ParseException {

        homePage = new P01_HomePage(driver);
        homePage.navigateToRegisterPage();

        DataReader dataReader = new DataReader();
        dataReader.Reader();

        registerPage = new P02_RegisterPage(driver);
        registerPage.userRegisteration(dataReader.FName, dataReader.LName, dataReader.EMAIL, dataReader.PASSWORD, dataReader.ConPassword);

        addProductsPage = new P03_AddProductsPage(driver);
        addProductsPage.addFirstProduct();
        addProductsPage.addSecondProduct();
    }
}
