package co.com.sofkau.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"},
        glue = {"co.com.sofkau.stepDefinitions",
                "co.com.sofkau.hooks"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class GeneralTest {
}
