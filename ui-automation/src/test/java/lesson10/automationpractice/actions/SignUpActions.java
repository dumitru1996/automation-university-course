package lesson10.automationpractice.actions;

import org.openqa.selenium.WebElement;

public class SignUpActions {

    public String returnInputValue(WebElement element) {
        return element.getAttribute("value");
    }
}
