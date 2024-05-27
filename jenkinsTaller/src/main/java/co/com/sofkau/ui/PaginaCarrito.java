package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;

public class PaginaCarrito extends PageObject {

    public static final Target LIBROS_AGREGADOS = Target.
            the("Los productos agregados").located(org.openqa.selenium.By.
                    xpath("//div[@class='row producto']")).waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CONFIRMAR_COMPRA_BTN = Target.
            the("El boton de confirmar compra").located(org.openqa.selenium.By.
                    xpath("//a[contains(text(), 'Finalizar compra')]")).waitingForNoMoreThan(Duration.ofSeconds(10));

}
