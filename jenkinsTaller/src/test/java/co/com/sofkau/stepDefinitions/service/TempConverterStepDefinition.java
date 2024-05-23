package co.com.sofkau.stepDefinitions.service;

import co.com.sofkau.stepDefinitions.SetupService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofkau.questions.service.GetBodyXml.getBody;
import static co.com.sofkau.questions.service.ResponseSoap.responseSoap;
import static co.com.sofkau.tasks.service.DoSoap.doSoap;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TempConverterStepDefinition extends SetupService {

    String valor;
    String respuesta;

    @Given("que el es usuario quiere convertir {int} celsius a fahrenheit en {string}")
    public void queElEsUsuarioQuiereConvertirCelsiusAFahrenheitEn(Integer int1, String urlBase) {
        super.setupService(urlBase);
        valor= String.valueOf(int1);
    }

    @When("realiza la peticion de tipo soap con el recurso {string}")
    public void realiza_la_peticion_de_tipo_soap_con_el_recurso(String resource) {
        actor.attemptsTo(
                doSoap().withTheResource(resource)
                        .andHeaders(super.headers("https://www.w3schools.com/xml/CelsiusToFahrenheit"))
                        .andTheBody(getBody(valor,"CelsiusToFahrenheit.xml"))
        );
    }

    @Then("deberia obtener el el valor {string} en grados fahrenheit")
    public void deberiaObtenerElElValorEnGradosFahrenheit(String string) {
        respuesta = string;
        actor.should(
                seeThat(
                        "El codigo de pais es",
                        responseSoap().delServicio("CelsiusToFahrenheitResult"),
                        equalTo(string)
                )
        );
    }

}
