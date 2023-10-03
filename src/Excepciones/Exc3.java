package Excepciones;

import java.util.InputMismatchException;

public class Exc3 extends InputMismatchException {
    public static void main(String[] args) {
        try {
        } catch (InputMismatchException e) {
            System.out.println("Esta fatal");
        }
    }
}