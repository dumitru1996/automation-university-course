package lesson10.automationpractice.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson10.automationpractice.actions.CommonActions;
import lesson10.automationpractice.pages.HomePage;
import lesson10.automationpractice.pages.LoginPage;
import org.openqa.selenium.WebElement;

import static lesson10.automationpractice.driver.Driver.getDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;

public class LoginSteps {

    private CommonActions commonActions = new CommonActions();

    private LoginPage loginPage = new LoginPage(getDriver());
    private HomePage homePage = new HomePage(getDriver());

    @Then("Login page is displayed")
    public void loginPageDisplayed() {
        assertThat("Expected Login page is displayed",
                loginPage.getAnchorElement().isDisplayed(),
                is(true));
        commonActions.scrollToElement(loginPage.getAnchorElement());
    }

    @Then("user is on Home Page")
    public void homePageDisplayed() {
        commonActions.waitUntilElementDisplayed(homePage.getAnchorElement());
        assertThat("Expected Login page is displayed",
                homePage.getAnchorElement().isDisplayed(),
                is(true));
    }

    @Then("the Email field is empty")
    public void emptyEmailField() {
        String textFromField = loginPage.getEmailField().getText();
        assertThat("Email field is empty", textFromField, isEmptyString());
    }

    @Then("the Name field is empty")
    public void emptyPasswordField() {
        String textFromField = loginPage.getNameField().getText();
        assertThat("Email field is empty", textFromField, isEmptyString());
    }

    @When("user click on Signup/Login button")
    public void userClickOnSignInButton() {
        WebElement element = homePage.getSignUpLoginButton();
        commonActions.waitUntilElementDisplayed(element);
        commonActions.scrollToElement(element);
        element.click();
    }

    @Given("user types '{}' in Name field")
    public void insertNameInField(String name) {
        loginPage.getNameField().sendKeys(name);
    }

    @Given("user types '{}' in Email field")
    public void insertEmailInField(String name) {
        loginPage.getEmailField().sendKeys(name);
    }

    @When("user clicks on signUp button")
    public void userClickOnLogInButton() {
        WebElement element = loginPage.getSignUpButton();
        commonActions.waitUntilElementDisplayed(element);
        element.click();
    }
}
