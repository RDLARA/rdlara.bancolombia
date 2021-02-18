package utest.rdlara.bancolombia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utestrdlara.feature",
        tags = "@scenario",
        glue = "utest.rdlara.bancolombia.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
