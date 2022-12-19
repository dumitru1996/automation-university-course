package lesson10.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy(xpath = "//h2[@class='or']")
    private WebElement anchorElement;

    @FindBy(xpath = "//input[contains(@data-qa, 'signup-name')]")
    private WebElement nameField;

    @FindBy(xpath = "//input[contains(@data-qa, 'signup-email')]")
    private WebElement emailField;

    @FindBy(xpath = "//button[contains(@data-qa, 'signup-button')]")
    private WebElement signUpButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAnchorElement() {
        return anchorElement;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }
}
