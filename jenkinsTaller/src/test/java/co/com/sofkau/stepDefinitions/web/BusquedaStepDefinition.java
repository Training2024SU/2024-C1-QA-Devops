package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.questions.web.ListaLibrosResultado;
import co.com.sofkau.tasks.web.BuscarPorTexto;
import co.com.sofkau.tasks.web.SeleccionarCategoria;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sofkau.ui.PaginaResultadoBusqueda.TITULO_BUSQUEDA;
import static co.com.sofkau.ui.PaginaResultadoBusqueda.TITULO_BUSQUEDA_TEXTO;
import static co.com.sofkau.utils.Util.obtenerTituloAleatorio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class BusquedaStepDefinition {
    @When("selecciona una categoría cualquiera")
    public void seleccionaUnaCategoriaCualquiera() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoria.cualquiera()
        );
    }

    @Then("debería ver productos relacionados a esa categoría")
    public void deberiaVerProductosRelacionadosAEsaCategoria() {
        String categoria = theActorInTheSpotlight().recall("categoria");
        String tituloEsperado = "Libros de " + categoria;
        theActorInTheSpotlight().should(
                seeThat(Text.of(TITULO_BUSQUEDA), equalToIgnoringCase(tituloEsperado)),
                seeThat(ListaLibrosResultado.todos(), is(not(emptyIterable())))
        );
    }

    @When("realiza una búsqueda por texto")
    public void realizaUnaBusquedaPorTexto() {
        String textoBusqueda = obtenerTituloAleatorio();
        theActorInTheSpotlight().remember("textoBusqueda", textoBusqueda);

        theActorInTheSpotlight().attemptsTo(
                BuscarPorTexto.con(textoBusqueda)
        );
    }

    @Then("debería ver productos relevantes en los resultados de la búsqueda")
    public void deberiaVerProductosRelevantesEnLosResultadosDeLaBusqueda() {
        String textoBusqueda = theActorInTheSpotlight().recall("textoBusqueda");
        String tituloEsperado = "Libros para " + textoBusqueda;

        System.err.println(Text.of(TITULO_BUSQUEDA_TEXTO).answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat(Text.of(TITULO_BUSQUEDA_TEXTO), endsWithIgnoringCase(tituloEsperado)),
                seeThat(ListaLibrosResultado.todos(), is(not(emptyIterable())))
        );
    }
}