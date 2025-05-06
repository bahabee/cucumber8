package qa.weborder.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import qa.weborder.pages.WebOrderLoginPage;
import utils.DriverHelper;

public class PurchaseStepDef {
    WebDriver driver = DriverHelper.getDriver();
    WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage(driver);

    @When("User provide user name {string} and password {string}")
    public void user_provide_user_name_and_password(String email, String password) {
        webOrderLoginPage.login(email, password);
    }

    @When("User click rememberButton and signInButton")
    public void user_click_remember_button_and_sign_in_button() {
        webOrderLoginPage.clickButtons();
    }

    @Then("User validate title {string}")
    public void user_validate_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }


    @Then("User validate error message {string}")
    public void user_validate_error_message(String expectedMessage) {
        webOrderLoginPage.errorMessage(expectedMessage);
    }
    

}
