package qa.weborder.stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import qa.weborder.pages.WebGroupOrderPage;
import qa.weborder.pages.WebOrderLoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebGroupOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();

    WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage(driver);

    WebGroupOrderPage webGroupOrderPage = new WebGroupOrderPage(driver);

    @Given("User provides username and password to the Login Page")
    public void user_provides_username_and_password_to_the_login_page() {
        webOrderLoginPage.login(ConfigReader.readProperty("webOrder_username"),
                ConfigReader.readProperty("webOrder_password"));
    }
    @When("User selects Remember Me CheckBox and Click Login Button")
    public void user_selects_remember_me_check_box_and_click_login_button() {
        webOrderLoginPage.clickButtons();

    }
    @When("User validates the title {string}")
    public void user_validates_the_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());

    }


    @When("User clicks Group Order Box and Next Button")
    public void user_clicks_group_order_box_and_next_button() {
        webGroupOrderPage.clickGroupOrderBoxAndNextButton();
    }

    @When("User sends the word {string} for note to the Invitees Section")
    public void user_sends_the_word_for_note_to_the_invitees_section(String inviteesNote) {
        webGroupOrderPage.sendDataToInviteesNoteSection(inviteesNote);
    }

    @When("User sends email address which are {string} and {string} to the Invite List")
    public void user_sends_email_address_which_are_and_to_the_invite_list(String email1, String email2) {
        webGroupOrderPage.sendDataToInviteList(email1,email2);
    }
    @When("User chooses delivery address {string} and validates the address {string}")
    public void user_chooses_delivery_address_and_validates_the_address(String location, String address) {
        webGroupOrderPage.chooseDeliveryAddress(location,address);
    }
    @When("User clicks Group Order Button")
    public void user_clicks_group_order_button() throws InterruptedException {
        webGroupOrderPage.clickGroupOrderButton();
    }
    @Then("User validates the header is {string}")
    public void user_validates_the_header_is(String header) {
        webGroupOrderPage.validateHeader(header);
    }
    @Then("User validates the description contains {string}")
    public void user_validates_the_description_contains(String description) {
        webGroupOrderPage.validateDescription(description);
    }

}