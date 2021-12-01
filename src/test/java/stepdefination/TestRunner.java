package stepdefination;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Satheesh\\Downloads\\Test-Automation\\src\\test\\resources\\TestAutomation.feature"},
        glue = {"stepdefination"},
        monochrome = true,
        plugin ={"pretty", "html:target/HTMLReports"
                , "junit:target/JunitReports/reports.xml" , "json:target/JsonReports/reports.json"},
        tags= {"@JobSearch"}
)
public class TestRunner {
}
