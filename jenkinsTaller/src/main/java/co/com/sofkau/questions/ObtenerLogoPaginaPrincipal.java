package co.com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaPrincipal.LOGO_PAGINA_PRINCIPAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerLogoPaginaPrincipal implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LOGO_PAGINA_PRINCIPAL, isVisible()).forNoMoreThan(10).seconds();
        return LOGO_PAGINA_PRINCIPAL.resolveFor(actor).getText();
    }
    public static ObtenerLogoPaginaPrincipal obtenerLogoPaginaPrincipal(){
        return new ObtenerLogoPaginaPrincipal();
    }
}
