package qa.secureSmartBearSoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureSmartMainPage {

    public SecureSmartMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Order')]")
    WebElement orderButton;

    public void orderButtonFunctionality(){
        orderButton.click();
    }
}
