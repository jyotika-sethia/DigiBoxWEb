package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sethi\\eclipse-workspace\\DigiBoxxWeb\\Feature",
				glue= {"stepDefinitions"},
				monochrome=true,
				tags="@MultipleImage",
				plugin={"pretty","html:target/HtmlReports"}
				)

public class MultipleImageRunner {

}
