package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class PaginaResultadoBusqueda extends PageObject {
    public static final Target LISTA_LIBROS = Target.the("Listado de libros")
            .located(By.cssSelector("div[data-id_producto]"));
    public static final Target TITULO_BUSQUEDA = Target.the("Titulo resultado de busqueda")
            .located(By.cssSelector("#content h1"));
    public static final Target TITULO_BUSQUEDA_TEXTO = Target.the("Titulo resultado de busqueda por texto")
            .located(By.cssSelector(".cantidadProductos h2")).waitingForNoMoreThan(Duration.ofSeconds(10));



    public static Target LISTA_PRODUCTS_CON_BOTON = Target.the("Listado de libros con boton")
            .located(By.xpath("//div[contains(@class, 'box-producto')]")).waitingForNoMoreThan(Duration.ofSeconds(15));


    public static String AGREGAR_CARRITO_STRING = "(//a[contains(text(), 'Agregar')])[%s]";

}
