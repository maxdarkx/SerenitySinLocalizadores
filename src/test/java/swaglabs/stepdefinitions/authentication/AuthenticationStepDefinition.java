package swaglabs.stepdefinitions.authentication;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.model.SwaglabsUser;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.authentication.Navigate;

public class AuthenticationStepDefinition {
    private Actor actor;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {actor} se encuentra en la pagina de login")
    public void queJuanSeEncuentraEnLaPaginaDeLogin(Actor actor) {
        this.actor = actor;
        this.actor.wasAbleTo(
                Navigate.toTheLoginPage()
        );
    }

    @Cuando("{actor} se loguea con credenciales validas")
    public void juanSeLogueaConCredencialesValidas(Actor actor) {
            actor.attemptsTo(
                    Login.asA(SwaglabsUser.STANDARD_USER)
        );

    }

    @Entonces("El deberia ver la pagina del catalogo")
    public void elDeberiaVerLaPaginaDelCatalogo() {
        actor.attemptsTo(
                Ensure.that(
                        Text.of(".title")
                ).isEqualTo(
                        "PRODUCTS"
                )
        );
    }






}
