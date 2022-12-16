package lesson10.automationpractice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"lesson10.automationpractice"},
        tags = ("@Run"),
        plugin = {"pretty", "html:target/cucumber-report"}
)
public class Runner {

}
