package br.com.ernestobarbosa.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    dryRun = false,
    strict = true,
    features = "src/test/resources/",
    glue = "br/com/ernestobarbosa/steps",
    tags = {"@wip"},
    plugin = {"json:target/cucumber.json"}
)
public class RunTest {
}
