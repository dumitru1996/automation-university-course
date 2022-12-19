package lesson10.automationpractice.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static lesson10.automationpractice.driver.Driver.getDriver;

public class CommonActions {

    public final static Duration TIMEOUT = Duration.ofSeconds(10);

    public void waitUntilElementDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT);
        wait.until((ExpectedCondition<Boolean>) arg -> element.isDisplayed());
    }

    public void scrollToElement(WebElement element) {
        WebDriver driver = getDriver();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
