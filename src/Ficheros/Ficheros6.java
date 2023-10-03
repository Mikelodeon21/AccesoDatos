package Ficheros;

import java.io.File;
import java.io.IOException;

public class Ficheros6 {
    public static void main(String[] args) throws IOException {
        File directorio=new File("Ejercicio6");
        File f1=new File(directorio,"FICHERO1.TXT");
        File f2=new File(directorio,"FICHERO2.TXT");
        directorio.mkdir();
        f1.createNewFile();
        f2.createNewFile();

        File[] array=directorio.listFiles();
        for (int i=0;i<array.length;i++){
            for (int j=0;j<args.length;j++) {
                if (array[i].getName().equals(args[j])){
                    System.out.println("Nombre del fichero: "+array[i].getName()+" ,es fichero?: "+array[i].isFile()+",es un directorio?: "+array[i].isDirectory());
                }
            }
        }
    }
}
