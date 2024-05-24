package co.com.sofkau.tasks.web;

import co.com.sofkau.models.TarjetaModel;
import co.com.sofkau.ui.PaginaCamposTarjeta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;



public class LlenarFormularioTarjeta implements Task {
    private TarjetaModel tarjetaModel;
    public LlenarFormularioTarjeta conLaTarjeta(TarjetaModel tarjetaModel){
        this.tarjetaModel = tarjetaModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tarjetaModel.getUserName()).into(PaginaCamposTarjeta.CAMPO_NOMBRE_TITULAR)
        );
    }


    public static LlenarFormularioTarjeta llenarFormularioTarjeta(){
        return new LlenarFormularioTarjeta();
    }
}
