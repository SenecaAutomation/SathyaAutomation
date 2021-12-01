package stepdefination;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



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
