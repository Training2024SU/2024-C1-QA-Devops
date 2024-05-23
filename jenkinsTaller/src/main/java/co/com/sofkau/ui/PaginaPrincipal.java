package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PaginaPrincipal {
    public static Target BOTON_MI_CUENTA = Target.
            the("boton mi cuenta").located(org.openqa.selenium.By.
                    xpath("//div[@class = 'micuenta deslogeado']"));
    public static final Target MENSAJE_CONFIRMACION_INICIO_SESION = Target.the("mensaje de confirmacion inicio de sesion despues de registro")
            .located(By.xpath("//div[@class = 'micuenta logeado']"));
    public static final Target LOGO_PAGINA_PRINCIPAL = Target.the("logo buscalibre")
            .located(By.xpath("//a[@title='Buscalibre.com' and contains(@class, 'logo')]"));
}
