import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Relatorio/relatorio.html"},
        features = {"../ChamaProjectTest/src/test/Features"},
        tags = {"@regressivo"},
        glue = {"StepsDefinitions"},
        monochrome = false,
        dryRun = false
)
public class TestRunner {

}
