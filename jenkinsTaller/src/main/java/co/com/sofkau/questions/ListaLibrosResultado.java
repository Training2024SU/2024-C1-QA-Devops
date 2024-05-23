package co.com.sofkau.questions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofkau.ui.PaginaResultadoBusqueda.LISTA_LIBROS;

public class ListaLibrosResultado implements Question<ListOfWebElementFacades> {
    public static ListaLibrosResultado todos() {
        return new ListaLibrosResultado();
    }

    @Override
    public ListOfWebElementFacades answeredBy(Actor actor) {
        return LISTA_LIBROS.resolveAllFor(actor);
    }
}
