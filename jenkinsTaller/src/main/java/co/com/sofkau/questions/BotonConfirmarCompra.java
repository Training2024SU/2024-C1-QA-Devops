package co.com.sofkau.questions;

import co.com.sofkau.ui.PaginaCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;

public class BotonConfirmarCompra implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaCarrito.CONFIRMAR_COMPRA_BTN.resolveFor(actor).isEnabled();
    }

    public static BotonConfirmarCompra botonConfirmarCompra(){
        return new BotonConfirmarCompra();
    }

}
