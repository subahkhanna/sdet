package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:/Users/SubahKhanna/eclipse-workspace/Cucumber_Proj/src/test/java/features/",
glue = {"stepDefinition"},
tags = "@activity1_1 or @activity1_2 or @activity1_3 or @activity2_4 or @activity2_5",
//Activity 6
plugin = {"json: test-reports/json-report.json"},
monochrome = true
)

public class ActivitiesRunner {
//empty
}