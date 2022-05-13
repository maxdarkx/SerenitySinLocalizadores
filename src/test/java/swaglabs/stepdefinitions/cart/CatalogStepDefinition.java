package swaglabs.stepdefinitions.cart;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import swaglabs.model.SwaglabsUser;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.authentication.Navigate;
import swaglabs.tasks.cart.AddToCart;

import java.util.List;

public class CatalogStepDefinition {
    private Actor actor;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("{actor} se ha logueado en la aplicacion")
    public void juanSeHaLogueadoEnLaAplicacion(Actor actor) {
        this.actor = actor;
        actor.wasAbleTo(
                Navigate.toTheLoginPage(),
                Login.asA(SwaglabsUser.STANDARD_USER)
        );
    }
    @Y("{actor} se encuentra mirando el catalogo")
    public void elSeEncuentraMirandoElCatalogo(Actor actorName) {

        actor.attemptsTo(
                Navigate.toTheCatalogPage()
        );

    }

    @Cuando("{actor} agrega los siguientes items al carrito:")
    public void elAgregaLosSiguientesItemsAlCarrito(Actor actorName, List<String> items) {
        items.forEach(
                    itemName -> actor.attemptsTo(AddToCart.item(itemName))
        );

    }


    @Entonces("el conteo de items del carrito de compras deberia ser de {int}")
    public void elConteoDeItemsDelCarritoDeComprasDeberiaSerDe(int cantidadArticulos) {
    }

    @Y("los items deberian aparecer en el carrito")
    public void losItemsDeberianAparecerEnElCarrito() {
    }

}
