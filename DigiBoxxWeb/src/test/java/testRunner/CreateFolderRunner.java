package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sethi\\eclipse-workspace\\DigiWeb\\Features",
				glue= {"stepDefinitions"},
				monochrome=true,
				tags="@CreateFolder",
				plugin={"pretty","html:target/HtmlReports"}
				)
public class CreateFolderRunner {

}
