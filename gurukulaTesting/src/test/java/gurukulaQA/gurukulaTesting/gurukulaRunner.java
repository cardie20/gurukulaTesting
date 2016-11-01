package gurukulaQA.gurukulaTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/gurukulaQA/gurukulaTesing/Staff.feature", 
				 plugin = {"pretty", "html:target/gurukulaQAReport"})

public class gurukulaRunner {

}
