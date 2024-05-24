package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class PaginaMetodosPagoMercado extends PageObject {
    public static final Target FORMA_DE_PAGO_TARJETA = Target.
            the("forma de pago con tarjeta").located(By.
                    xpath("//span[normalize-space()='Crédito, Visa Débito o Mastercard Débito']"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

}
