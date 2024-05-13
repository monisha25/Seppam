package runnerseppam;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Featurefile/Seppam1.feature" ,
glue ="stepdefinitionseppem",
plugin = { "pretty", "html:target/cucumber-reports.html", "json:JSON_OUTPUT" }, 
monochrome = true,
tags = "@Create or @Subtask or @history"


)



public class Seppamrunnerclass {
	

}
