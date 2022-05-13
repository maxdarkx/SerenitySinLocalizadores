package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import swaglabs.model.SwaglabsUser;

public class Login {
    public static Performable asA(SwaglabsUser standardUser)
    {
        return Task.where("{0} se loguea como "+ standardUser,
                Enter.theValue(standardUser.getUsername()).into("#user-name"),
                Enter.theValue(standardUser.getPassword()).into("#password"),
                Click.on(Button.withNameOrId("Login"))
        );
    }
}
