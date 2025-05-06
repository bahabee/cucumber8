package qa.blazedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class BlazeDemoHomePage {

    public BlazeDemoHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='fromPort']")
    WebElement departure;

    @FindBy(xpath = "//select[@name='toPort']")
    WebElement destination;

    @FindBy(tagName = "input")
    WebElement findingFlight;

    @FindBy(tagName = "h3")
    WebElement header;


    public void chooseDeparture(String departure){
        BrowserUtils.selectBy(this.departure, departure, "value");
    }

    public void chooseDestinationAndClickFindingFlight(String destination){
        BrowserUtils.selectBy(this.destination, destination, "text");
        findingFlight.click();
    }

    public void validateHeader(String expectedHeader){
        Assert.assertEquals(expectedHeader, BrowserUtils.getText(header));

    }

}
