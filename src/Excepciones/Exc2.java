package Excepciones;

import java.util.InputMismatchException;

public class Exc2 extends InputMismatchException {
    public static void main(String[] args) {

        try {
        }catch (InputMismatchException e){
            System.out.println("Esta mal");
        }
    }
}
