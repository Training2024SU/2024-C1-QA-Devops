package co.com.sofkau.questions.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaEfecty.LOGO_EFECTY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerLogoEfecty implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LOGO_EFECTY, isVisible()).forNoMoreThan(15).seconds();
        return LOGO_EFECTY.resolveFor(actor).getText();
    }
    public static ObtenerLogoEfecty obtenerLogoEfecty(){
        return new ObtenerLogoEfecty();
    }
}
