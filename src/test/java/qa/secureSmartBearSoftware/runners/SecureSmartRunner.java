package qa.secureSmartBearSoftware.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/secureSmartBearSoftware", //location of feature files(Content)
        glue = "qa/secureSmartBearSoftware/stepdefinitions", //location of Step Definition(Source)
        dryRun = false,
        tags = "@regression",// it is about filtration
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}
)


    public class SecureSmartRunner {



    }


