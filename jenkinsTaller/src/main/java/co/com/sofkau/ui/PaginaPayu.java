package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPayu extends PageObject {
    public static final Target BOTON_PAGAR_CON_EFECTY = Target.
            the("boton pagar con efecty").located(org.openqa.selenium.By.
                    id("pm-EFECTY"));
    public static final Target ACEPTAR_TERMINOS_Y_CONDICIONES = Target.
            the("aceptar terminos y condiciones").located(org.openqa.selenium.By.
                    xpath("//input[@id= 'tandc']//.."));

    public static final Target ACEPTAR_TERMINOS_Y_CONDICIONES_SIN_SELECCIONAR =Target.
            the("aceptar terminos y condiciones").located(org.openqa.selenium.By.
                    cssSelector("input.ng-invalid"));

    public static final Target BOTON_GENERAR_NUMERO_DE_PAGO = Target.
            the("generar numero de pago").located(org.openqa.selenium.By.
                    xpath("//button[@id='cash_button_pay']"));
}
