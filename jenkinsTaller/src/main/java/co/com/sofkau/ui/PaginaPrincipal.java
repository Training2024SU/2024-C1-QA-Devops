package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {
    public static final Target BOTON_MI_CUENTA = Target.
            the("boton mi cuenta").located(org.openqa.selenium.By.
                    xpath("//div[@class = 'micuenta deslogeado']"));
    public static final Target MENSAJE_CONFIRMACION_INICIO_SESION = Target.the("mensaje de confirmacion inicio de sesion despues de registro")
            .located(By.xpath("//div[@class = 'micuenta logeado']"));
    public static final Target LOGO_PAGINA_PRINCIPAL = Target.the("logo buscalibre")
            .located(By.xpath("//a[@title='Buscalibre.com' and contains(@class, 'logo')]"));

    public static final Target BARRA_BUSQUEDA = Target.the("Barra de búsqueda")
            .located(By.cssSelector("#buscador input"));
    public static final Target CATEGORIAS = Target.the("Categorías de libros")
            .located(By.cssSelector("#categoriasdeployed ul li"));

    public static Target URL_CARRITO = Target.the("El boton del carrito")
            .located(By.xpath("//a[@class='carrito ']"));

}
