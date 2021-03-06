package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target/failedrerun.txt" },
glue= {"stepDefinitions","AppHooks"},
plugin ={"pretty"},
monochrome = true)
public class FailedRun {

}
