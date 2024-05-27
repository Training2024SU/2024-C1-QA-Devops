package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginaAutenticacion extends PageObject {
    public static final Target CAMPO_EMAIL = Target.
            the("campo email").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'signin_username']"));
    public static final Target BOTON_CONTINUAR_AUTENTICACION = Target.
            the("boton continuar").located(org.openqa.selenium.By.
                    xpath("//button[text()='Continuar']"));
    public static final Target CAMPO_PASSWORD_REGISTRADO = Target.
            the("campo password").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'signin_password']"));
    public static final Target BOTON_INGRESAR = Target.
            the("boton ingresar").located(org.openqa.selenium.By.
                    xpath("//button[text()='Ingresar']"));
}
