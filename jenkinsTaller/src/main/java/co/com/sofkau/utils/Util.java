package co.com.sofkau.utils;

import co.com.sofkau.models.UsuarioModel;
import net.datafaker.Faker;

public class Util {
    public static UsuarioModel crearUsuario(){

        Faker faker = new Faker();

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
}
