package co.com.sofkau.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static co.com.sofkau.ui.PaginaPrincipal.BARRA_BUSQUEDA;
import static co.com.sofkau.ui.PaginaResultadoBusqueda.*;


public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        List<WebElementFacade> booksElements = LISTA_PRODUCTS_CON_BOTON.resolveAllFor(actor);
        int randomIndex = random.nextInt(booksElements.size());

        actor.attemptsTo(
                Scroll.to(booksElements.get(randomIndex)),
                MoveMouse.to(booksElements.get(randomIndex)),
                Click.on(By.xpath(String.format(AGREGAR_CARRITO_STRING, randomIndex + 1))),
                Scroll.to(BARRA_BUSQUEDA)
        );

    }

    public static AgregarProducto agregarProducto() {
        return new AgregarProducto();
    }
}