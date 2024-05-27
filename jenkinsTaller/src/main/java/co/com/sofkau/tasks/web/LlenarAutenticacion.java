package co.com.sofkau.tasks.web;

import co.com.sofkau.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofkau.ui.PaginaAutenticacion.BOTON_CONTINUAR_AUTENTICACION;
import static co.com.sofkau.ui.PaginaAutenticacion.CAMPO_EMAIL;

public class LlenarAutenticacion  implements Task {
    UsuarioModel usuario = new UsuarioModel();

    public LlenarAutenticacion conElCorreo(UsuarioModel usuario) {
        this.usuario = usuario;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getEmail()).into(CAMPO_EMAIL),
                Click.on(BOTON_CONTINUAR_AUTENTICACION)
        );
    }
    public static LlenarAutenticacion llenarAutenticacion(){
        return new LlenarAutenticacion();
    }
}
