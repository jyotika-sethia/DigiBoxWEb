package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sethi\\eclipse-workspace\\DigiBoxxWeb\\Feature",
				glue= {"stepDefinitions"},
				monochrome=true,
				tags="@excel"
//				plugin={"pretty","html:target/HtmlReports1",
//						"json:target/MyReport/report.json",
//						"junit:target/MyReport/report.xml",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//						}
		)
public class lRunner {

}
