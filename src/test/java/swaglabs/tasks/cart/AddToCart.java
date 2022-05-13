package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;

public class AddToCart {
    public static Performable item (String  itemName)
    {
        return Task.where("{0} se clickea en el boton para añadir el item al carrito de" + itemName,
                Click.on(
                        Button.withText("Add to cart")
                                .inside(PageElement.withCSSClass("inventory_item")
                                        .containingText(itemName)
                                )
                )
        );
    }
}


