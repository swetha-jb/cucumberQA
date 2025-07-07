package com.vinod.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

        "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
//        plugin = {"pretty", "html:target/cucumber-reports/test1.html"},
        features = "src/test/resources/features/android",
        glue = "com/vinod/step_definitions",
        dryRun = false,
        tags = "",
        publish = false //generating a report with public link
)

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources",
//        glue = "org.example",
//        plugin = {"pretty", "html:target/cucumber-reports/test1.html"},
//        tags = "",
//        monochrome = true
//)
public class CukesRunner {}
