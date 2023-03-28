package tek.capstone.framwork.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test1 or @test2 or@test3 or @test ",
        features = "classpath:features",
        glue="tek.capstone.framwork",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
        },
        snippets = CAMELCASE,
        monochrome = true)
public class TestRunner {
}