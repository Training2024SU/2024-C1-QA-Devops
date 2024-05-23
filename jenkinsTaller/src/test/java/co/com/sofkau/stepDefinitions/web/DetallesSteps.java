package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.tasks.SeleccionarLibro;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Displayed;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.sofkau.ui.PaginaDetallesLibro.FICHA;
import static co.com.sofkau.ui.PaginaDetallesLibro.PRECIO;
import static co.com.sofkau.ui.PaginaDetallesLibro.TITULO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class DetallesSteps {
    @When("selecciona cualquier libro")
    public void seleccionaCualquierLibro() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarLibro.cualquiera()
        );
    }

    @Then("debería ver la información detallada de éste")
    public void deberiaVerLaInformacionDetalladaDeEste() {
        String tituloEsperado = theActorInTheSpotlight().recall("titulo_libro");
        theActorInTheSpotlight().should(
                seeThat(Text.of(TITULO), equalTo(tituloEsperado)),
                seeThat(Text.of(PRECIO), notNullValue()),
                seeThat(Displayed.of(FICHA)),
                seeThat(Visibility.of(FICHA))
        );
    }
}