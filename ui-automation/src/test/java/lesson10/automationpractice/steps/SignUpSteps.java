package lesson10.automationpractice.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson10.automationpractice.actions.CommonActions;
import lesson10.automationpractice.actions.SignUpActions;
import lesson10.automationpractice.pages.AccountCreatedPage;
import lesson10.automationpractice.pages.DeleteAccountPage;
import lesson10.automationpractice.pages.HomePage;
import lesson10.automationpractice.pages.SignUpPage;
import java.util.Map;

import static lesson10.automationpractice.driver.Driver.getDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignUpSteps {
    private CommonActions commonActions = new CommonActions();
    private SignUpActions signUpActions = new SignUpActions();

    private SignUpPage signUpPage = new SignUpPage(getDriver());
    private AccountCreatedPage accountCreatedPage = new AccountCreatedPage(getDriver());
    private HomePage homePage = new HomePage(getDriver());
    private DeleteAccountPage deleteAccountPage = new DeleteAccountPage(getDriver());

    @Given("SignUp page is displayed")
    public void signUpPageIsDisplayed(){
        assertThat("Expected Login page is displayed",
                signUpPage.getAnchorElement().isDisplayed(),
                is(true));
        commonActions.scrollToElement(signUpPage.getAnchorElement());
    }

    @Given("name and email are already populated in form with valid data")
    public void fieldsAreAlreadyPopuplatedWithValidData(DataTable dataTable){
        final Map<String,String> fields = dataTable.asMap(String.class,String.class);
        assertThat("Name field is not populated properly ",
                signUpActions.returnInputValue(signUpPage.getNameField()),
                is(fields.get("name")));

        assertThat("Email field is not populated properly",
                signUpActions.returnInputValue(signUpPage.getEmailField()),
                is(fields.get("email")));
    }

    @When("user completes form with next data")
    public void registrationFormIsPopulated(DataTable dataTable){
        final Map<String,String> fields = dataTable.asMap(String.class,String.class);

        if(fields.get("gender").equals("male")){
            signUpPage.getMaleRadioButton().click();
        } else {
            signUpPage.getFemaleRadioButton().click();
        }

        signUpPage.getPasswordField().sendKeys(fields.get("password"));

        signUpPage.getDaySelector().selectByVisibleText(fields.get("day"));
        signUpPage.getMonthSelector().selectByVisibleText(fields.get("month"));
        signUpPage.getYearSelector().selectByVisibleText(fields.get("year"));
        System.out.println("date selected");

        commonActions.scrollToElement(signUpPage.getFirstNameField());
        signUpPage.getFirstNameField().sendKeys(fields.get("firstName"));

        commonActions.scrollToElement(signUpPage.getLastNameField());
        signUpPage.getLastNameField().sendKeys(fields.get("lastName"));

        commonActions.scrollToElement(signUpPage.getCompanyField());
        signUpPage.getCompanyField().sendKeys(fields.get("company"));

        commonActions.scrollToElement(signUpPage.getAddress1Field());
        signUpPage.getAddress1Field().sendKeys(fields.get("address"));

        signUpPage.getCountrySelect().selectByVisibleText(fields.get("country"));

        commonActions.scrollToElement(signUpPage.getStateField());
        signUpPage.getStateField().sendKeys(fields.get("state"));

        commonActions.scrollToElement(signUpPage.getCityField());
        signUpPage.getCityField().sendKeys(fields.get("city"));

        commonActions.scrollToElement(signUpPage.getZipcodeField());
        signUpPage.getZipcodeField().sendKeys(fields.get("zipCode"));

        commonActions.scrollToElement(signUpPage.getMobileNumberField());
        signUpPage.getMobileNumberField().sendKeys(fields.get("mobileNumber"));
    }

    @When("user click on Create Account Button")
    public void clickOnCreateAccountButton(){
        commonActions.scrollToElement(signUpPage.getSubmitButton());
        signUpPage.getSubmitButton().click();
    }

    @Then("user is on Account Created Page")
    public void accountPageDisplayed(){
        assertThat("Expected Account Created Page is displayed",
                accountCreatedPage.getAnchorElement().isDisplayed(),
                is(true));
    }

    @Then("user click on Continue Button on Create Account Page")
    public void clickOnContinueButton(){
        accountCreatedPage.getContinueButton().click();
    }

    @Then("user click on Delete Account Button")
    public void clickOnDeleteAccountButton(){
        assertThat("Delete Account button is displayed",
                homePage.getDeleteAccountButton().isDisplayed(),
                is(true));

        homePage.getDeleteAccountButton().click();
    }

    @Then("Delete Account Page is displayed")
    public void deleteAccountPageDisplayed(){
        assertThat("Expected Delete Account Page is displayed",
                deleteAccountPage.getAnchorElement().isDisplayed(),
                is(true));
    }

    @Then("user click on Continue Button on Delete Account page")
    public void continueButtonClickedOnDeleteAccPage(){
        deleteAccountPage.getContinueButton().click();
    }
}
