package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaEfecty extends PageObject {
    public static final Target LOGO_EFECTY = Target.
            the("logo efecty").located(org.openqa.selenium.By.
                    xpath("//img[@src= 'https://s02cdn.payulatam.com/5.42.0/app/dist/images/sprite_source/lg/big/EFECTY.png']"));
    public static final Target MENSAJE_NUMERO_DE_PAGO = Target.
            the("mensaje numero de pago").located(org.openqa.selenium.By.
                    xpath("//div[@class = 'payment-id b-bottom ng-scope']//strong"));
}
