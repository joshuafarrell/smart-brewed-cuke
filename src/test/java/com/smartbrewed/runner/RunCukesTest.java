package com.smartbrewed.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jfarrell on 4/29/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
        features = "src/test/resources/features/",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "com.smartbrewed" )
public class RunCukesTest {
    // A runner for cuke feature tests
}
