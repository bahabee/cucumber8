package qa.secureSmartBearSoftware.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTest.txt",
        glue = "qa/secureSmartBearSoftware/stepdefinitions",
        plugin = {"pretty", "html:target/uiReport.htm", "rerun:target/uiFailedTest.txt"}
)


public class SecureSmartReRunner {



    }


