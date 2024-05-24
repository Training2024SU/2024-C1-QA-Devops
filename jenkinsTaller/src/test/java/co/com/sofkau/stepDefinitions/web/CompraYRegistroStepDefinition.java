package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.models.UsuarioModel;
import co.com.sofkau.stepDefinitions.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static co.com.sofkau.tasks.web.AbrirPaginaPrincipal.abrirPaginaPrincipal;
import static co.com.sofkau.tasks.web.IrAlCarrito.irAlCarrito;
import static co.com.sofkau.tasks.web.LlenarAutenticacion.llenarAutenticacion;
import static co.com.sofkau.tasks.web.LlenarFormularioDeEnvio.llenarFormularioDeEnvio;
import static co.com.sofkau.tasks.web.LlenarRegistro.llenarRegistro;
import static co.com.sofkau.tasks.web.NavegarAAutenticacion.navegarAAutenticacion;
import static co.com.sofkau.utils.Constante.URL_PAGINA_PRINCIPAL;
import static co.com.sofkau.utils.Util.crearDireccionDeEnvio;
import static co.com.sofkau.utils.Util.crearUsuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraYRegistroStepDefinition extends SetUp {

    @Given("que el usuario selecciona el navegador {string} y se registra en el sitio web")
    public void que_el_usuario_selecciona_el_navegador_e_ingresa_al_sitio_web(String navegador) {
        actorSetUpTheBrowser(navegador);
        UsuarioModel usuario = crearUsuario();

        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaPrincipal().conLaUrl(URL_PAGINA_PRINCIPAL),
                navegarAAutenticacion(),
                llenarAutenticacion().conElCorreo(usuario),
                llenarRegistro().conElUsuario(usuario)
        );
    }

    @When("confirma los productos llenando los formularios requeridos para el envio")
    public void confirmaLosProductosLlenandoLosFormuariosRequeridosParaElEnvio() {
        theActorInTheSpotlight().attemptsTo(
                irAlCarrito(),
                llenarFormularioDeEnvio().conLosDatos(crearDireccionDeEnvio())
        );
    }

    @Then("deberia visualizar un mensaje confirmando la orden de compra")
    public void deberiaVisualizarUnMensajeConfirmandoLaOrdenDeCompra() {

    }

}
