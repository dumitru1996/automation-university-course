package lesson10.automationpractice.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

import static lesson10.automationpractice.driver.Driver.closeDriver;
import static lesson10.automationpractice.driver.Driver.getDriver;

public class Hooks {

    @Before
    public void beforeAutomationPractice() throws IOException {
        getDriver().get("https://automationexercise.com/");
    }

    @After()
    public void afterAutomationPractice() {
        closeDriver();
    }
}
