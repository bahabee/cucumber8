package qa.weborder.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//RunWith --> Executes your feature file steps
//CucumberOptions --> It is a special annotation that has some key words


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder", //location of feature files(Content)
        glue = "qa/weborder/stepdefinitions", //location of Step Definition(Source)
        plugin = {"pretty", "html:target/uiReport.htm", "rerun:target/uiFailedTest.txt"}

)


public class WebOrderRunner {

}
