package Ficheros;

import java.io.File;

public class Ficheros5 {
    public static void main(String[] args) {
        File e = new File("C:\\Ejercicio\\Sistemas");
        File[] lista = e.listFiles();
        for (int i = 0; i <= lista.length; i++) {
            System.out.println(i);
            System.out.println("Nombre: "+ lista[i].getName()+ "es fichero?: "+ lista[i].isFile()+ " es directorio"+ lista[i].isDirectory());
        }
    }
}