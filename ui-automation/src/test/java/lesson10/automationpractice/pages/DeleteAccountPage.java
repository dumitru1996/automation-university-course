package lesson10.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends Page {

    @FindBy(xpath = "//h2/b[contains(text(), 'Account Deleted!')]")
    private WebElement anchorElement;

    @FindBy(xpath = "//a[contains(@data-qa, 'continue-button')]")
    private WebElement continueButton;

    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAnchorElement() {
        return anchorElement;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
