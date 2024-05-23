package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDetallesLibro extends PageObject {
    public static final Target TITULO = Target.the("Titulo del libro")
            .located(By.cssSelector(".tituloProducto"));
    public static final Target PRECIO = Target.the("Precio del libro")
            .located(By.cssSelector(".precioAhora span"));
    public static final Target FICHA = Target.the("Ficha con detalles")
            .located(By.cssSelector(".ficha"));
}
