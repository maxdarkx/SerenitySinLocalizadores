package swaglabs.runner.cart;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"},
        features = {"src/test/resources/features/cart"},
        glue = {"swaglabs.stepdefinitions.cart"}
)

public class CatalogRunner {}
