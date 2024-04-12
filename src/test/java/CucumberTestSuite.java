import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features/makeappointment.feature"},glue = {"steps"}
,plugin={"json:target/build/cucumber.json"})
public class CucumberTestSuite {

}
