package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaPrincipal.BOTON_MI_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavegarAAutenticacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MI_CUENTA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MI_CUENTA)
        );
    }

    public static NavegarAAutenticacion navegarAAutenticacion(){
        return new NavegarAAutenticacion();
    }
}
