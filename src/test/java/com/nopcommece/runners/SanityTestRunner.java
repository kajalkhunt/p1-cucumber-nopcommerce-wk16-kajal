package com.nopcommece.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/nopcommece",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        tags = {"@sanity"}
)
public class SanityTestRunner {

}
