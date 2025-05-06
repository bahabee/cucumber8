package qa.blazedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class BlazeDemoTicketPurchasePage {

    public BlazeDemoTicketPurchasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[contains(@value,'Choose This Flight')]")
    List<WebElement> allFlight;

    @FindBy(xpath = "//input[@placeholder='First Last']")
    WebElement firstAndLastName;

    @FindBy(css = "#address")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#state")
    WebElement state;

    @FindBy(css = "#zipCode")
    WebElement zipCode;

    @FindBy(xpath = "//input[@name='creditCardNumber']")
    WebElement ccNumber;

    @FindBy(xpath = "//input[@placeholder='Month']")
    WebElement month;

    @FindBy(xpath = "//input[@placeholder='Year']")
    WebElement year;

    @FindBy(xpath = "//input[@name='nameOnCard']")
    WebElement cartHolder;

    @FindBy(xpath = "//input[@name='rememberMe']")
    WebElement checkBox;

    @FindBy(xpath = "//input[@value='Purchase Flight']")
    WebElement purchaseButton;

    @FindBy(tagName = "h1")
    WebElement thankYouMessage;


    public void chooseFlight(){
       allFlight.get(0).click();

//       for (WebElement flight : allFlight){
//           flight.click();
//           break;
//       }
    }

    public void personalInformation(String paxName, String address,String city, String state, String zipCode){
        firstAndLastName.sendKeys(paxName);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
    }

    public void cartHolderInformation(String ccNumber, String cartHolderInfo){
        this.ccNumber.sendKeys(ccNumber);
        cartHolder.sendKeys(cartHolderInfo);

    }

    public void clickButtons(WebDriver driver){
       BrowserUtils.clickWithJS(driver, checkBox);
       BrowserUtils.clickWithJS(driver, purchaseButton);
    }

    public void nextPageHeader(String expectedHeader){
        Assert.assertEquals(expectedHeader, BrowserUtils.getText(thankYouMessage));
    }






}
