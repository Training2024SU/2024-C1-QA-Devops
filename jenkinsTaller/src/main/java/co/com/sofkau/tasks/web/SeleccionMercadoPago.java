package co.com.sofkau.tasks.web;

import co.com.sofkau.ui.PaginaPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofkau.ui.PaginaPago.FORMA_DE_PAGO_MERCADOPAGO;

public class SeleccionMercadoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FORMA_DE_PAGO_MERCADOPAGO)
        );
    }


    public static SeleccionMercadoPago seleccionMercadoPago(){
        return new SeleccionMercadoPago();
    }
}
