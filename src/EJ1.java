import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=sc.next();
        System.out.println("Dime tu edad");
        int edad=sc.nextInt();
        System.out.println("Buenos dias " + nombre + " con "+ edad + " años");
    }
}