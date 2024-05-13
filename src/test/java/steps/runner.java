package steps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//TrainingNeedsSurvey.feature
//EmployeeSurvey.feature
//Add_User.feature
@CucumberOptions(
        features = {"src/test/resources/Features/Add_User.feature"},
        glue = {"steps"},tags="@testcase1",
        plugin = {"pretty", "html:target/reports/report.html"}
)
public class runner extends AbstractTestNGCucumberTests {

}


