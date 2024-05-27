package co.com.sofkau.tasks.web;

import co.com.sofkau.models.FormularioDeEnvioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaCarrito.CONFIRMAR_COMPRA_BTN;
import static co.com.sofkau.ui.PaginaFormuarioDeEnvio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioDeEnvio implements Task {
    FormularioDeEnvioModel direccion = new FormularioDeEnvioModel();

    public LlenarFormularioDeEnvio conLosDatos(FormularioDeEnvioModel direccion) {
        this.direccion = direccion;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONFIRMAR_COMPRA_BTN),
                WaitUntil.the(SELECCIONAR_DEPARTAMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_LISTA_DEPARTAMENTO),
                Click.on(SELECCIONAR_DEPARTAMENTO),
                Click.on(SELECCIONAR_LISTA_CIUDAD),
                Click.on(SELECCIONAR_CIUDAD),
                Enter.theValue(direccion.getCedula()).into(CAMPO_CEDULA),
                Enter.theValue(direccion.getDestinatario()).into(CAMPO_DESTINATARIO),
                Enter.theValue(direccion.getDireccion()).into(CAMPO_DIRECCION),
                Enter.theValue(direccion.getDireccion()).into(CAMPO_TELEFONO),
                Scroll.to(BOTON_VALIDAR_DIRECCION),
                Click.on(BOTON_VALIDAR_DIRECCION),
                Scroll.to(BOTON_ENVIAR_AQUI),
                Click.on(BOTON_ENVIAR_AQUI)
        );
    }

    public static LlenarFormularioDeEnvio llenarFormularioDeEnvio(){
        return new LlenarFormularioDeEnvio();
    }
}
