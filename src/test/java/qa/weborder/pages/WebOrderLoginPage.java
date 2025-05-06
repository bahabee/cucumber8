package qa.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WebOrderLoginPage {

    public WebOrderLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;

    @FindBy(xpath = "//label[@for='RememberMe']")
    WebElement rememberButton;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(tagName = "h1")
    WebElement header;


    @FindBy(xpath = "//div[@class='mt-2 alert alert-danger']")
    WebElement errorMessage;

    public void login(String email, String password){
        this.email.clear();
        this.email.sendKeys(email);

        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickButtons(){

        if (rememberButton.isDisplayed() && !rememberButton.isSelected()){
            rememberButton.click();
        }
        submitButton.click();
    }

    public void errorMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage, BrowserUtils.getText(errorMessage));
    }

}