package co.com.sofkau;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"},
        glue = {"co.com.sofkau.stepdefinitions",
                "co.com.sofkau.hooks"}
)
public class GeneralTest {
}
