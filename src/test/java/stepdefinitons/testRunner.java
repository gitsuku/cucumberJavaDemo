package stepdefinitons;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue={"stepdefinitons"}, monochrome = true,
plugin={"pretty", "html:target/HtmlReports"})
public class testRunner {

}
