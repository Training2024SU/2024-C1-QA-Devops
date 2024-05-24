package co.com.sofkau.questions.service;

import org.jetbrains.annotations.NotNull;

import static co.com.sofkau.utils.ArchivosUtil.readFile;

public class GetBodyXml {
    private GetBodyXml() {
        throw new IllegalStateException("Utility Class");
    }

    public static @NotNull String getBody(String numero, String service) {
        return String.format(readFile("src/test/resources/archivosxml/" + service), numero);
    }
}
