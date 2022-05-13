package swaglabs.runner.authentication;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"},
        features = {"src/test/resources/features/authentication"},
        glue = {"swaglabs.stepdefinitions.authentication"}
)

public class AuthenticationRunner {}
