package qa.secureSmartBearSoftware.stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import qa.secureSmartBearSoftware.pages.SecureSmartLoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class SecureSmartLoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    SecureSmartLoginPage secureSmartLoginPage = new SecureSmartLoginPage(driver);

    @Given("User successfully provide the username {string} and password {string} and click LoginButton")
    public void user_successfully_provide_the_username_and_password_and_click_login_button(String userName, String password) {
        secureSmartLoginPage.loginFunctionality(userName, password);
    }

}

