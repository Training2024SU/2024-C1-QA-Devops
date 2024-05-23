package co.com.sofkau.stepDefinitions.web;

import co.com.sofkau.stepDefinitions.SetUp;
import io.cucumber.java.en.When;

import static co.com.sofkau.tasks.LlenarAutenticacionLogin.llenarAutenticacionLogin;
import static co.com.sofkau.tasks.NavegarAAutenticacion.navegarAAutenticacion;
import static co.com.sofkau.utils.Constante.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition extends SetUp {
    @When("ingresa sus credenciales de usuario registrado correctamente")
    public void ingresaSusCredencialesDeUsuarioRegistrado() {
        theActorInTheSpotlight().wasAbleTo(
                navegarAAutenticacion(),
                llenarAutenticacionLogin()
                        .conLasCredenciales(CORREO_REGISTRADO, PASSWORD_REGISTRADO)
        );
    }
}
