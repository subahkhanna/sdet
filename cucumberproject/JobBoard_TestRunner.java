package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
	
    features = "C:/Users/SubahKhanna/eclipse-workspace/CucumberProject_Activities/src/test/java/Features/HRM_Activity1.feature",
	glue = {"stepdefinition"},
	tags = "@HRM_Activity_1",
	plugin = { "pretty", "json: test-reports/json-report.json" },
	monochrome = true
)

//Tags Details:
// JobBoard: @JobBoardTests
//HRM : @HRM_Activity_1,@HRM_Activity_2,@HRM_Activity_3,@HRM_Activity_4
//CRM : @CRMSiteTests

//FeatureFile Details:
// JobBoard : jobboard.feature
// CRM : CRMSite.feature ( @meetingSchedule, @createproduct)
// HRM : HRM_Activity1 / HRM_Activity2 /HRM_Activity3 / HRM_Activity4

public class JobBoard_TestRunner {

}
