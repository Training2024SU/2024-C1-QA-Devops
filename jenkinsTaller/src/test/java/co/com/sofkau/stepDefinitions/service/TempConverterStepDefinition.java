package co.com.sofkau.stepDefinitions.service;

import co.com.sofkau.stepDefinitions.SetupService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofkau.tasks.service.DoSoap.doSoap;

public class TempConverterStepDefinition extends SetupService {

    String valor;


    @Given("que el es usuario quiere convertir {int} celsius a fahrenheit en {string}")
    public void queElEsUsuarioQuiereConvertirCelsiusAFahrenheitEn(Integer int1, String urlBase) {
        super.setupService(urlBase);
        valor= String.valueOf(int1);

    }

//    @When("realiza la peticion de tipo soap con el recurso {string}")
//    public void hace_la_peticion_de_tipo_soap_con_el_recurso(String resource) {
//        actor.attemptsTo(
//                doSoap().withTheResource(resource)
//                        .andHeaders(super.headers())
//                        .andTheBody(getBody(codigoISO))
//        );
//    }

    @Then("deberia obtener el el valor {string} en grados fahrenheit")
    public void deberiaObtenerElElValorEnGradosFahrenheit(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
