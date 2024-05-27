package co.com.sofkau.utils;

public class Constante {
    private Constante() {
        throw new IllegalStateException();
    }

    public static final String URL_PAGINA_PRINCIPAL = "https://www.buscalibre.com.co/";
    public static final String MENSAJE_ESPERADO_DE_LOGIN = "Hola ";
    public static final String CORREO_REGISTRADO = "correotest2025@gmail.com";
    public static final String PASSWORD_REGISTRADO = "Prueba2024*";

    public static final String MENSAJE_ESPERADO_DE_ORDEN_DE_COMPRA = "Número de pago:";


    // SERVICIOS
    public static final String MARVEL_BASE = "https://gateway.marvel.com";

    public static final String CHARACTERS_ENDPOINT = "/v1/public/characters";
    public static final String COMIC_ENDPOINT = "/v1/public/comics/{id}";

}
