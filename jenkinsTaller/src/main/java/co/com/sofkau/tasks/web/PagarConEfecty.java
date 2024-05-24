package co.com.sofkau.tasks.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofkau.ui.PaginaPago.PAGAR_CON_PAYU;
import static co.com.sofkau.ui.PaginaPayu.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PagarConEfecty implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(PAGAR_CON_PAYU, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PAGAR_CON_PAYU),
                WaitUntil.the(BOTON_PAGAR_CON_EFECTY, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BOTON_PAGAR_CON_EFECTY),
                Click.on(BOTON_PAGAR_CON_EFECTY),
                WaitUntil.the(ACEPTAR_TERMINOS_Y_CONDICIONES, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(ACEPTAR_TERMINOS_Y_CONDICIONES)
        );

        if (ACEPTAR_TERMINOS_Y_CONDICIONES_SIN_SELECCIONAR.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(ACEPTAR_TERMINOS_Y_CONDICIONES)
            );
        } else {
            // checkbox ya seleccionado
        }
        actor.attemptsTo(
                Click.on(BOTON_GENERAR_NUMERO_DE_PAGO)
        );
    }
    public static PagarConEfecty pagarConEfecty(){
        return new PagarConEfecty();
    }

}
