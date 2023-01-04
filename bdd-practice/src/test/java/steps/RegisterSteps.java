package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class RegisterSteps {

    @Given("user is on {string} page")
    public void makeSureOnPage(String pageName) {
        System.out.println("User is on " + pageName + " page");
    }

    @When("user click on {string} button")
    public void clickOnButton(String buttonName) {
        System.out.println("User click on " + buttonName + " button");
    }

    @Then("{string} page is displayed")
    public void pageIsDisplayed(String pageName) {
        System.out.println(pageName + " page is displayed");
    }

    @When("user populates displayed fields with data")
    public void populateFields(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        data.forEach((key, value) -> System.out.println("Filed " + key + " is populated with data: " + value));
    }

    @When("user fills {string} {string} field with {string} data")
    public void populateField(String dataToEnter, String fieldName, String typeOfData) {
        switch (typeOfData) {
            case "valid" -> System.out.println(fieldName + " field is populated with valid data: " + dataToEnter);
            case "invalid" -> System.out.println(fieldName + " field is populated with invalid data: " + dataToEnter);
        }
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String elementName, String message) {
        System.out.println(elementName + " element is located");
        System.out.println("Message is displayed:\n" + message);
    }
}
