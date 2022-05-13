package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    private static final String URL =  "https://www.saucedemo.com/";
    private static final String CATALOG = "inventory.html";


    public static Performable toTheLoginPage()
    {
        return Open.url(URL);
    }

    public static Performable toTheCatalogPage() {
        String catalogURL = URL + CATALOG;
        return Open.url(catalogURL);
    }
}
