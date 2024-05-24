package co.com.sofkau.questions.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofkau.ui.PaginaEfecty.MENSAJE_NUMERO_DE_PAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerMensajeOrdenDeCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE_NUMERO_DE_PAGO, isVisible()).forNoMoreThan(10).seconds();
        return MENSAJE_NUMERO_DE_PAGO.resolveFor(actor).getText();
    }
    public static ObtenerMensajeOrdenDeCompra obtenerMensajeOrdenDeCompra(){
        return new ObtenerMensajeOrdenDeCompra();
    }
}

