package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"}
        ,glue={"StepDefinitions"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"}
        ,tags = {"@VodacomTestAutomation"}
        ,monochrome = true)
public class ServiceTestRunner extends Runner {
}
