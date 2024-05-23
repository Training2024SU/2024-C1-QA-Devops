package co.com.sofkau.tasks.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofkau.ui.PaginaAutenticacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarAutenticacionLogin implements Task {
    String emailRegistrado;
    String passwordRegistrado;

    public LlenarAutenticacionLogin conLasCredenciales(String emailRegistrado, String passwordRegistrado){
        this.emailRegistrado = emailRegistrado;
        this.passwordRegistrado = passwordRegistrado;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(emailRegistrado).into(CAMPO_EMAIL),
                Click.on(BOTON_CONTINUAR_AUTENTICACION),
                WaitUntil.the(CAMPO_PASSWORD_REGISTRADO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(passwordRegistrado).into(CAMPO_PASSWORD_REGISTRADO),
                Click.on(BOTON_INGRESAR)
        );
    }
    public static LlenarAutenticacionLogin llenarAutenticacionLogin(){
        return new LlenarAutenticacionLogin();
    }
}
