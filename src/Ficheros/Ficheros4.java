package Ficheros;

import java.io.File;

public class Ficheros4 {
    public static void main(String[] args) {
        File d = new File("NuevoDir");
        File f1 = new File(d, "FICHERO1.TXT");
        System.out.println("INFORMACION DEL FICHERO:");
        System.out.println("Nombre del fichero: "+f1.getName());
        System.out.println("Ruta del fichero: "+ f1.getPath());
        System.out.println("Ruta absoluta del fichero: "+ f1.getAbsolutePath());
        System.out.println("Se puede leer: "+ f1.canRead());
        System.out.println("Se puede escribir: "+f1.canWrite());
        System.out.println("Tamaño del fichero: "+f1.length());
        System.out.println("Es un directorio: " + f1.isDirectory());
        System.out.println("Es un fichero: "+f1.isFile());
        System.out.println("Nombre del directorio padre: "+f1.getParent());
    }
}
