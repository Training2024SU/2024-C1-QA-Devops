package co.com.sofkau.questions.service;

import org.jetbrains.annotations.NotNull;

import static co.com.sofkau.utils.ArchivosUtil.readFile;

public class GetBodyXml {
    public static @NotNull String getBody(String numero, String service) {
        String cuerpo = String.format(readFile("src/test/resources/archivosxml/"+service),numero);
        return cuerpo;
    }
}
