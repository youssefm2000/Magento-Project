package Tests;
import Data.DataReader;
import Pages.P01_HomePage;
import Pages.P02_RegisterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC02_RegisterTest extends TestBase {

    public P01_HomePage homePage;
    public P02_RegisterPage registerPage;

    @Feature("Create An Account")
    @Description("Test Description: User Create a new account")
    @Test(description = "Valid Register With valid Email and Password")
    public void registertain() throws IOException, ParseException {

        homePage = new P01_HomePage(driver);
        homePage.navigateToRegisterPage();

        DataReader dataReader = new DataReader();
        dataReader.Reader();

        registerPage = new P02_RegisterPage(driver);
        registerPage.userRegisteration(dataReader.FName, dataReader.LName, dataReader.EMAIL, dataReader.PASSWORD, dataReader.ConPassword);
    }
}