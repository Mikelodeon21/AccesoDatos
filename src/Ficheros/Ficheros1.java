package Ficheros;

import java.io.File;
import java.io.IOException;

public class Ficheros1 {
    public static void main(String[] args) {
        File d = new File("NuevoDir");
        File f1 = new File(d, "FICHERO1.TXT");
        File f2 = new File(d, "FICHERO2.TXT");


        try {
            d.mkdir();
            if (f1.createNewFile()) {
                System.out.println("Se ha creado correctamente....");
            }
            else {
                System.out.println("No se ha creado correctamente....");
            }
            if (f2.createNewFile()) {
                System.out.println("Se ha creado correctamente....");
            }
            else {
                System.out.println("No se ha creado correctamente....");
            }

            f1.renameTo(new File(d, "FICHEROS_COPIA.TXT"));
        } catch (IOException e) {
            System.out.println("mal");
        }
    }
}
