package co.com.sofkau.stepDefinitions;

import io.cucumber.java.en.Given;

import static co.com.sofkau.tasks.AbrirPaginaPrincipal.abrirPaginaPrincipal;
import static co.com.sofkau.utils.Constante.url_pagina_principal;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionStepDefinition extends SetUp {

    @Given("El usuario navega en internet usando el navegador {string}")
    public void elUsuarioNavegaEnInternetUsandoElNavegador(String navegador) {
        actorSetUpTheBrowser(navegador);
    }

    @Given("El usuario se encuentra en la página principal")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaPrincipal().conLaUrl(url_pagina_principal)
        );
    }
}
