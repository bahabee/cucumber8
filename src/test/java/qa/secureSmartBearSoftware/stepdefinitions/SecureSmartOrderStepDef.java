package qa.secureSmartBearSoftware.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import qa.secureSmartBearSoftware.pages.SecureSmartMainPage;
import qa.secureSmartBearSoftware.pages.SecureSmartOrderPage;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.Map;

public class SecureSmartOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    SecureSmartOrderPage secureSmartOrderPage = new SecureSmartOrderPage(driver);
    SecureSmartMainPage secureSmartMainPage = new SecureSmartMainPage(driver);

    //Product Information MyMoney-Visa

    @Then("User provides the {string},{int} for Product Information")
    public void user_provides_the_for_product_information(String product, Integer quantity) {
        secureSmartOrderPage.provideProductInformation(product, quantity);
    }

    @When("User provides the {string},{string},{string},{string},{string} for Address Information")
    public void user_provides_the_for_address_information(String customerName, String street, String city,
                                                          String state, String zipCode) {
        secureSmartOrderPage.provideAddressInformation(customerName, street, city, state, zipCode);
    }

    @When("User provides the {string},{string},{string} for Payment Information")
    public void user_provides_the_for_payment_information(String type, String cardNumber, String expireDate) {
        secureSmartOrderPage.provideCardInformation(type, cardNumber, expireDate);
    }

    @Then("User clicks process button and validates {string}")
    public void user_clicks_process_button_and_validates(String expectedMessage) {
       secureSmartOrderPage.clickProcessButtonAndValidateMessage(expectedMessage);
    }

    @Then("User clicks view all orders Link from MainPage")
    public void user_clicks_view_all_orders_link_from_main_page() {
        secureSmartMainPage.orderButtonFunctionality();
    }

    @Then("User validates all information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_validates_all_information(String customerName,String product,String quantity,String date,String street,
                                               String city,String state,String zip,String cardType,String cardNumber,
                                               String expireDate) {
        secureSmartOrderPage.validateAllInformation(customerName,product,quantity,date,street,city,state,zip,
                cardType,cardNumber,expireDate);
    }

}
