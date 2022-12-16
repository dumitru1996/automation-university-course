package lesson10.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends Page {

    @FindBy(xpath = "//h2/b[contains(text(), 'Account Created!')]")
    private WebElement anchorElement;

    @FindBy(xpath = "//a[contains(@data-qa, 'continue-button')]")
    private WebElement continueButton;

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAnchorElement() {
        return anchorElement;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
