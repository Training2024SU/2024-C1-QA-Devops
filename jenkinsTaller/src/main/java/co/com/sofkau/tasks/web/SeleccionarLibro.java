package co.com.sofkau.tasks.web;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofkau.ui.PaginaResultadoBusqueda.LISTA_LIBROS;
import static co.com.sofkau.utils.Util.escogerItemAleatorio;

public class SeleccionarLibro implements Task {
    public static SeleccionarLibro cualquiera() {
        return new SeleccionarLibro();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades libros = LISTA_LIBROS.resolveAllFor(actor);
        WebElementFacade libro = escogerItemAleatorio(libros);

        actor.attemptsTo(
                Scroll.to(libro),
                Click.on(libro)
        );
    }
}
