package com.Runner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"/Users/nikitapatil/eclipse-workspace/SeleniumCucumberFrameWork/src/test/resources/com/FeatureFiles"},
	glue = {"/com/stepDefinitions"},
	monochrome = true,
	dryRun = true,
	plugin = {"pretty", "html::textoutput"},
	tags = "@smoke"	
)
public class TestRunner extends AbstractTestNGCucumberTests{
	
    @DataProvider(parallel = true)
    public Object[][] Scenarios()
    {
    	return this.scenarios();
    }
}
