package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class PaginaCamposTarjeta extends PageObject {
    public static final Target FORMA_DE_PAGO_TARJETA = Target.
            the("forma de pago con tarjeta").located(By.
                    xpath("//span[normalize-space()='Crédito, Visa Débito o Mastercard Débito']"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CAMPO_NUMERO_TARJETA = Target.
            the("campo numero de tarjeta").located(By.
                    id("cardNumber"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CAMPO_NOMBRE_TITULAR = Target.
            the("campo nombre titular").located(By.
                    id("fullname"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CAMPO_FECHA_EXPIRACION = Target.
            the("campo fecha de expiracion").located(By.
                    id("expirationDate"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CAMPO_CODIGO_SEGURIDAD = Target.
            the("campo codigo de seguridad").located(By.
                    id("securityCode"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));


    public static final Target SALDO_TOTAL = Target.
            the("el texto con el saldo total").located(By.
                    xpath("//span[contains(text(),'$')]"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

}
