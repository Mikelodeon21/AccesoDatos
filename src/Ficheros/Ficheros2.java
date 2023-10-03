package Ficheros;

import java.io.File;
import java.io.IOException;

public class Ficheros2 {
    public static void main(String[] args) {
        // creamos la carpeta y los ficheros
        File d = new File("NuevoDir");
        File f1 = new File(d, "FICHERO1.TXT");
        File f2 = new File(d, "FICHERO2.TXT");
        d.mkdir();
        try {
            f1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            f2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Aqui eliminamos todos los elementos
        f1.delete();
        f2.delete();
        d.delete();
    }
}
