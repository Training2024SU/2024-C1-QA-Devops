package co.com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaFormuarioDeEnvio extends PageObject {

    public static final Target SELECCIONAR_LISTA_DEPARTAMENTO = Target.
            the("seleccionar lista departamentos").located(org.openqa.selenium.By.
                    xpath("//select[@id = 'direccion_c_region']"));
    public static final Target SELECCIONAR_DEPARTAMENTO = Target.
            the("seleccionar departamento").located(org.openqa.selenium.By.
                    xpath("//select[@id = 'direccion_c_region']/option[3]"));
    public static final Target SELECCIONAR_LISTA_CIUDAD = Target.
            the("seleccionar lista ciudades").located(org.openqa.selenium.By.
                    xpath("//select[@id = 'direccion_c_comuna']"));
    public static final Target SELECCIONAR_CIUDAD = Target.
            the("seleccionar ciudad").located(org.openqa.selenium.By.
                    xpath("//select[@id = 'direccion_c_comuna']/option[4]"));
    public static final Target CAMPO_CEDULA = Target.
            the("campo cedula").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'direccion_rut']"));
    public static final Target CAMPO_DESTINATARIO = Target.
            the("campo destinatario").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'direccion_destinatario']"));
    public static final Target CAMPO_DIRECCION = Target.
            the("campo direccion").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'direccion_calle']"));
    public static final Target CAMPO_TELEFONO = Target.
            the("campo telefono").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'direccion_telefono']"));
    public static final Target BOTON_VALIDAR_DIRECCION = Target.
            the("botón validar dirección").located(org.openqa.selenium.By.
                    xpath("//button[text()='Validar Dirección']"));
    public static final Target BOTON_ENVIAR_AQUI = Target.
            the("botón enviar").located(org.openqa.selenium.By.
                    xpath("//button[text()='ENVIAR AQUÍ']"));
}
