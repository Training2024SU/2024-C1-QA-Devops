package co.com.sofkau.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivosUtil {
    private ArchivosUtil() {
        throw new IllegalStateException();
    }

    public static boolean verifyIfFileExist(String filePath){
        File file = new File(filePath);
        return file.isFile();
    }

    public static boolean deleteFileOrDirectory(String filePath) {
        File object = new File(filePath);
        boolean deleted = false;

        if(object.exists()) {
            deleted = object.delete();
        }

        return deleted;
    }

    public static String readFile(String filePath) {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            while ((line = br.readLine()) != null)
                stringBuilder.append(line).append("\n");
        } catch (IOException ignored) {
        }
        return stringBuilder.toString();
    }

}
