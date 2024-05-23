package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.sofkau.ui.PaginaPrincipal.BARRA_BUSQUEDA;

public class BuscarPorTexto implements Task {
    private final String texto;

    public BuscarPorTexto(String texto) {
        this.texto = texto;
    }

    public static BuscarPorTexto con(String texto) {
        return new BuscarPorTexto(texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(texto).into(BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }
}
