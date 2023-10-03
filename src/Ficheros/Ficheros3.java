package Ficheros;

import java.io.File;

public class Ficheros3 {
    public static void main(String[] args) {
            File carpeta = new File("Piters");
        String[] listado = carpeta.list();
        // Este if es para saber si hay elementos dentro de la carpeta, de no ser este caso se abre un bucle for para realizar el contador de archivos dentro de la carpeta
        if (listado.length == 0) {
            System.out.println("No hay elementos");
        } else {
            for (int i=0; i< listado.length; i++) {
                System.out.println(listado[i]);
            }
        }
    }
}
