package co.com.sofkau.tasks;

import co.com.sofkau.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofkau.ui.PaginaRegistro.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarRegistro implements Task {
    UsuarioModel usuario = new UsuarioModel();
    public LlenarRegistro conElUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CAMPO_CONFIRMA_EMAIL, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario.getConfirmarEmail()).into(CAMPO_CONFIRMA_EMAIL),
                Enter.theValue(usuario.getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(usuario.getApellido()).into(CAMPO_APELLIDO),
                Scroll.to(CAMPO_PASSWORD),
                Enter.theValue(usuario.getPassword()).into(CAMPO_PASSWORD),
                Enter.theValue(usuario.getConfirmarPassword()).into(CAMPO_CONFIRMA_PASSWORD),
                Scroll.to(BOTON_CREAR_CUENTA),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }
    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();
    }
}
