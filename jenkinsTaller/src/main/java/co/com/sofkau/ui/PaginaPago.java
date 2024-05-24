package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class PaginaPago extends PageObject {
    public static final Target FORMA_DE_PAGO_PAYU = Target.
            the("forma de pago payU").located(org.openqa.selenium.By.
                    xpath("//h6[text()='PayU']"));

    public static final Target FORMA_DE_PAGO_MERCADOPAGO = Target.
            the("forma de pago MercadoPago").located(org.openqa.selenium.By.
                    xpath("//h6[text()='MercadoPago']")).waitingForNoMoreThan(Duration.ofSeconds(15));
}