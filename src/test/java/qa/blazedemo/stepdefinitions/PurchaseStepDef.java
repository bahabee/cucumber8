package qa.blazedemo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import qa.blazedemo.pages.BlazeDemoHomePage;
import qa.blazedemo.pages.BlazeDemoTicketPurchasePage;
import utils.DriverHelper;

public class PurchaseStepDef {
    WebDriver driver = DriverHelper.getDriver();
    BlazeDemoHomePage blaseDemoHomePage = new BlazeDemoHomePage(driver);
    BlazeDemoTicketPurchasePage blaseDemoTicketPurchasePage = new BlazeDemoTicketPurchasePage(driver);

    @Given("User navigates to the {string}")
    public void user_navigates_to_the(String url) {
        driver.get(url);
    }

    @When("User chooses {string} for departure")
    public void user_chooses_for_departure(String departure) {
        blaseDemoHomePage.chooseDeparture(departure);
    }

    @When("User chooses {string} for destination and click Finding Flight Button")
    public void user_chooses_for_destination_and_click_finding_flight_button(String destination) {
        blaseDemoHomePage.chooseDestinationAndClickFindingFlight(destination);
    }

    @Then("User validate header {string}")
    public void user_validate_header(String expectedHeader) {
        blaseDemoHomePage.validateHeader(expectedHeader);

    }


    @When("User click the Choose This Flight button")
    public void user_click_the_choose_this_flight_button() {
        blaseDemoTicketPurchasePage.chooseFlight();

    }
    @Then("User enter {string} and {string}, {string}, {string} and {string}")
    public void user_enter_and_and(String paxName, String address, String city, String state, String zipCode) {
        blaseDemoTicketPurchasePage.personalInformation(paxName, address, city, state, zipCode);

    }
    @Then("User enter {string} and {string} name")
    public void user_enter_and_name(String ccNumber, String cartHolderInfo) {
        blaseDemoTicketPurchasePage.cartHolderInformation(ccNumber, cartHolderInfo);

    }
    @When("User enter all information click checkBox and purchaseButton")
    public void user_enter_all_information_click_check_box_and_purchase_button() {
        blaseDemoTicketPurchasePage.clickButtons(driver);


    }
    @When("User validate last page header {string}")
    public void user_validate_last_page_header(String expectedHeader) {
       blaseDemoTicketPurchasePage.nextPageHeader(expectedHeader);

    }
}
