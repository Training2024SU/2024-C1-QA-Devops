package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginaRegistro extends PageObject {
    public static final Target CAMPO_CONFIRMA_EMAIL = Target.
            the("comfirmar email").located(org.openqa.selenium.By.
                    xpath("//*[@id = 'signup_email_confirm']"));
    public static final Target CAMPO_NOMBRE = Target.
            the("campo nombre").located(org.openqa.selenium.By.
                    xpath("//*[@id = 'signup_nombre']"));
    public static final Target CAMPO_APELLIDO = Target.
            the("campo apellido").located(org.openqa.selenium.By.
                    xpath("//*[@id = 'signup_apellido']"));
    public static final Target CAMPO_PASSWORD = Target.
            the("campo password").located(org.openqa.selenium.By.
                    xpath("//*[@id = 'signup_clave']"));
    public static final Target CAMPO_CONFIRMA_PASSWORD = Target.
            the("campo confirmar password").located(org.openqa.selenium.By.
                    xpath("//*[@id = 'signup_confirmar_clave']"));
    public static final Target BOTON_CREAR_CUENTA = Target.
            the("botón crear cuenta").located(org.openqa.selenium.By.
                    xpath("//button[text()='Crear cuenta']"));
}
