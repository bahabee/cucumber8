package qa.secureSmartBearSoftware.stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import qa.secureSmartBearSoftware.pages.SecureSmartLoginPage;
import qa.secureSmartBearSoftware.pages.SecureSmartMainPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class SecureSmartMainStepDef {

    WebDriver driver = DriverHelper.getDriver();
    SecureSmartLoginPage secureSmartLoginPage = new SecureSmartLoginPage(driver);
    SecureSmartMainPage secureSmartMainPage = new SecureSmartMainPage(driver);

    @Given("User successfully provide the username and password and click LoginButton")
    public void user_successfully_provide_the_username_and_password_and_click_login_button() {
        secureSmartLoginPage.loginFunctionality(ConfigReader.readProperty("secureSmart_login"),
                ConfigReader.readProperty("secureSmart_password"));
    }

    @Given("User click Order Button")
    public void user_click_order_button() {
        secureSmartMainPage.orderButtonFunctionality();


    }


}
