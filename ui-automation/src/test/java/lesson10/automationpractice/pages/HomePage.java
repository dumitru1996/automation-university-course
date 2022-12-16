package lesson10.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(id = "slider")
    private WebElement anchorElement;

    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    private WebElement signUpLoginButton;

    @FindBy(xpath = "//a[contains(@href, '/delete_account')]")
    private WebElement deleteAccountButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAnchorElement() {
        return anchorElement;
    }

    public WebElement getSignUpLoginButton() {
        return signUpLoginButton;
    }

    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }
}
