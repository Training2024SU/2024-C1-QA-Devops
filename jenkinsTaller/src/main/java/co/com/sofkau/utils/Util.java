package co.com.sofkau.utils;

import co.com.sofkau.models.FormularioDeEnvioModel;
import co.com.sofkau.models.TarjetaModel;
import co.com.sofkau.models.UsuarioModel;
import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {
    private static final Faker faker = new Faker();

    private Util() {
        throw new IllegalStateException("Utility Class");
    }

    public static UsuarioModel crearUsuario() {

        UsuarioModel usuarioModel = new UsuarioModel();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        usuarioModel.setNombre(faker.name().firstName());
        usuarioModel.setApellido(faker.name().lastName());
        usuarioModel.setEmail(email);
        usuarioModel.setConfirmarEmail(email);
        usuarioModel.setPassword(password);
        usuarioModel.setConfirmarPassword(password);

        return usuarioModel;

    }

    public static <T> T escogerItemAleatorio(List<T> list) {
        int randomIdx = (int) Math.floor(Math.random() * list.size());
        return list.get(randomIdx);
    }

    public static <T> int escogerIndexAleatorio(List<T> list) {
        Random random = new Random();
        return random.nextInt(list.size());
    }


    public static String obtenerTituloAleatorio() {
        List<String> libros = Arrays.asList(
                "La Sombra del Viento",
                "Cien Años de Soledad",
                "1984",
                "El Alquimista",
                "Crónica de una Muerte Anunciada",
                "El Nombre de la Rosa",
                "Don Quijote de la Mancha",
                "El Principito",
                "Los Miserables",
                "Orgullo y Prejuicio",
                "Matar a un Ruiseñor",
                "Harry Potter y la Piedra Filosofal",
                "La Casa de los Espíritus",
                "El Gran Gatsby",
                "El Señor de los Anillos: La Comunidad del Anillo",
                "Cumbres Borrascosas",
                "El Diario de Ana Frank",
                "Rayuela",
                "La Metamorfosis",
                "La Divina Comedia"
        );
        return escogerItemAleatorio(libros);
    }

    public static FormularioDeEnvioModel crearDireccionDeEnvio(){
        FormularioDeEnvioModel formularioDeEnvioModel = new FormularioDeEnvioModel();
        formularioDeEnvioModel.setCedula(faker.numerify("1#########"));
        formularioDeEnvioModel.setDestinatario(faker.name().fullName());
        formularioDeEnvioModel.setDireccion(faker.address().streetAddress());
        formularioDeEnvioModel.setTelefono(faker.phoneNumber().cellPhone());

        return formularioDeEnvioModel;
    }

    public static TarjetaModel crearTarjeta(){

        int month = faker.number().numberBetween(1,13);
        String monthString = month > 9 ? String.valueOf(month) : "0" + month;
        String yearString  = String.valueOf(faker.number().numberBetween(LocalDate.now().getYear() + 1, LocalDate.now().getYear() + 6));

        return new TarjetaModel(
                "5011054488597827",
                faker.name().fullName(),
                monthString,
                yearString,
                faker.bothify("###"),
                ("1" + faker.bothify("##########"))
        );
    }


    public static String id(){
        Random random = new Random();
        int randomNumber = random.nextInt(22) + 1;
        return Integer.toString(randomNumber);
    }
}
