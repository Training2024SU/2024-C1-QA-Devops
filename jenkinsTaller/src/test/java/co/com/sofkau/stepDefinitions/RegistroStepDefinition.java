package co.com.sofkau.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofkau.tasks.AbrirPaginaPrincipal.abrirPaginaPrincipal;
import static co.com.sofkau.utils.Constante.url_pagina_principal;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition extends SetUp{
    @Given("que el usuario selecciona el navegador {string} e ingresa al sitio web")
    public void que_el_usuario_selecciona_el_navegador_e_ingresa_al_sitio_web(String navegador) {
        actorSetUpTheBrowser(navegador);
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaPrincipal().conLaUrl(url_pagina_principal)
        );
    }
    @When("ingresa su informacion correctamente para crear su cuenta")
    public void ingresa_su_informacion_correctamente_para_crear_su_cuenta() {
    }
    @Then("deberia ser redirigido a la pagina principal con la sesion iniciada")
    public void deberia_ser_redirigido_a_la_pagina_principal_con_la_sesion_iniciada() {
    }
}
