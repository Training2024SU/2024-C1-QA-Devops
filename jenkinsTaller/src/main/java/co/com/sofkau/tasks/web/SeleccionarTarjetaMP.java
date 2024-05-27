package co.com.sofkau.tasks.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.sofkau.ui.PaginaMetodosPagoMercado.FORMA_DE_PAGO_TARJETA;


public class SeleccionarTarjetaMP implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FORMA_DE_PAGO_TARJETA),
                Switch.toNewWindow()
        );
    }


    public static SeleccionarTarjetaMP seleccionarTarjetaMP(){
        return new SeleccionarTarjetaMP();
    }
}