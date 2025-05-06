package qa.secureSmartBearSoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureSmartLoginPage {

    public SecureSmartLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@type='text']")
    WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(css = ".button")
    WebElement loginButton;

    public void loginFunctionality(String userName, String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);

        loginButton.click();
    }

}
