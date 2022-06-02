package cuucmberOption;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features="S:\\final\\final\\src\\test\\java\\cucumber\\Login.feature",glue = "stepDefination")
    public class TestRunner
    {

    }

