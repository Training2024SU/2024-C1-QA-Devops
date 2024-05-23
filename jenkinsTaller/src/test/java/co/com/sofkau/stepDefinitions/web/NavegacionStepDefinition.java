package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.stepDefinitions.SetUp;
import io.cucumber.java.en.Given;

import static co.com.sofkau.tasks.web.AbrirPaginaPrincipal.abrirPaginaPrincipal;
import static co.com.sofkau.utils.Constante.URL_PAGINA_PRINCIPAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionStepDefinition extends SetUp {

    @Given("El usuario navega en internet usando el navegador {string}")
    public void elUsuarioNavegaEnInternetUsandoElNavegador(String navegador) {
        actorSetUpTheBrowser(navegador);
    }

    @Given("El usuario se encuentra en la página principal")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaPrincipal().conLaUrl(URL_PAGINA_PRINCIPAL)
        );
    }
}
