package co.com.sofkau.questions.web;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.sofkau.ui.PaginaCarrito.LIBROS_AGREGADOS;

public class CantidadLibrosAgregados implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        List<WebElementFacade> librosAgregados = LIBROS_AGREGADOS.resolveAllFor(actor);
        return librosAgregados.size();
    }

    public static CantidadLibrosAgregados cantidadLibrosAgregados(){
        return new CantidadLibrosAgregados();
    }
}
