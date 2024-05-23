package co.com.sofkau.tasks.web;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofkau.ui.PaginaPrincipal.CATEGORIAS;
import static co.com.sofkau.utils.Util.escogerItemAleatorio;

public class SeleccionarCategoria implements Task {
    public static SeleccionarCategoria cualquiera() {
        return new SeleccionarCategoria();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades categorias = CATEGORIAS.resolveAllFor(actor);
        WebElementFacade categoria = escogerItemAleatorio(categorias);
        actor.remember("categoria", categoria.getText());
        System.err.println(categoria.getText());
        actor.attemptsTo(
                Scroll.to(categoria),
                Click.on(categoria)
        );
    }
}
