package lesson10.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static lesson10.automationpractice.driver.Driver.getDriver;

public class SignUpPage extends Page {

    @FindBy(xpath = "//h2/b[contains(text(), 'Enter Account Information')]")
    private WebElement anchorElement;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "id_gender1")
    private WebElement maleRadioButton;

    @FindBy(id = "id_gender2")
    private WebElement femaleRadioButton;

    @FindBy(id = "password")
    private WebElement passwordField;

    private Select daySelector = new Select(getDriver().findElement(By.xpath("//select[contains(@data-qa, 'days')]")));

    private Select monthSelector = new Select(getDriver().findElement(By.xpath("//select[@id='months']")));

    private Select yearSelector = new Select(getDriver().findElement(By.xpath("//select[@id='years']")));

    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement address1Field;

    private Select countrySelect = new Select(getDriver().findElement(By.xpath("//select[@id='country']")));

    @FindBy(id = "mobile_number")
    private WebElement mobileNumberField;

    @FindBy(id = "state")
    private WebElement stateField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "zipcode")
    private WebElement zipcodeField;

    @FindBy(xpath = "//div[@class='login-form']/*/button[@class='btn btn-default']")
    private WebElement submitButton;

    public SignUpPage(WebDriver driver) {
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

    public WebElement getMaleRadioButton() {
        return maleRadioButton;
    }

    public WebElement getFemaleRadioButton() {
        return femaleRadioButton;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public Select getDaySelector() {
        return daySelector;
    }

    public Select getMonthSelector() {
        return monthSelector;
    }

    public Select getYearSelector() {
        return yearSelector;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getCompanyField() {
        return companyField;
    }

    public WebElement getAddress1Field() {
        return address1Field;
    }

    public Select getCountrySelect() {
        return countrySelect;
    }

    public WebElement getMobileNumberField() {
        return mobileNumberField;
    }

    public WebElement getStateField() {
        return stateField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getZipcodeField() {
        return zipcodeField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
