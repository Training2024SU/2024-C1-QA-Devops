package co.com.sofkau.questions.web;

import co.com.sofkau.ui.PaginaCamposTarjeta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SaldoTotalTarjeta  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PaginaCamposTarjeta.SALDO_TOTAL.resolveFor(actor).getText();
    }

    public static SaldoTotalTarjeta saldoTotalTarjeta(){
        return new SaldoTotalTarjeta();
    }
}
