package EjerciciosAD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Persona persona1=new Persona("Miguel", "17459908X", 1,18 );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File persona1= new File("persona1");
        FileOutputStream fileOutputStream=new FileOutputStream("persona1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fileOutputStream);
        fileOutputStream.close();
    }
}
