package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.models.TarjetaModel;
import co.com.sofkau.questions.web.SaldoTotalTarjeta;
import co.com.sofkau.stepDefinitions.SetUp;
import co.com.sofkau.tasks.web.LlenarFormularioTarjeta;
import co.com.sofkau.tasks.web.SeleccionMercadoPago;
import co.com.sofkau.tasks.web.SeleccionarTarjetaMP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.sofkau.utils.Util.crearTarjeta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CompraRegistroTarjetaStepDefinition extends SetUp {
    TarjetaModel tarjetaModel = crearTarjeta();

    @And("confirma la compra llenando los datos de la tarjeta")
    public void confirmaLaCompraLlenandoLosDatosDeLaTarjeta() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionMercadoPago.seleccionMercadoPago(),
                SeleccionarTarjetaMP.seleccionarTarjetaMP(),
                LlenarFormularioTarjeta.llenarFormularioTarjeta().conLaTarjeta(tarjetaModel)
        );

    }

    @Then("deberia visualizar su información ingresada en la tarjeta")
    public void deberiaVisualizarSuInformaciónIngresadaEnLaTarjeta() {
        Actor actor = OnStage.theActorInTheSpotlight();

        String saldo = SaldoTotalTarjeta.saldoTotalTarjeta().answeredBy(actor);

        actor.should(
                seeThat("El saldo total de la tarjeta no debe ser nulo",
                        SaldoTotalTarjeta.saldoTotalTarjeta(),
                        notNullValue())
        );

        actor.should(
                seeThat("El saldo total de la tarjeta debe contener el símbolo de dólar",
                        SaldoTotalTarjeta.saldoTotalTarjeta(),
                        containsString("$"))
        );

        double saldoValor = Double.parseDouble(saldo.replace("$", ""));

        assertThat("El saldo total de la tarjeta debe ser mayor que 0",
                saldoValor,
                is(greaterThan(0.0)));
    }

}
