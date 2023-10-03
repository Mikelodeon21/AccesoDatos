import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int num1=sc.nextInt();
        System.out.println("Dame el segundo numero");
        int num2=sc.nextInt();
        System.out.println("Dame el tercer numero");
        int num3=sc.nextInt();
        if(num1>num2) {
            if(num1>num3) {
                if(num2>num3) {
                    System.out.println("Orden Ascendente: " + num3 + " , " + num2 + " , " + num1);
                }else {
                    System.out.println("Orden Ascendente: " + num1 + " , " + num3 + " , " + num2);
                }
            }else {
                System.out.println("Orden Ascendente: " + num2 + " , " + num1 + " , " + num3);
            }
        }else {
            if(num2>num3) {
                if(num1>num3) {
                    System.out.println("Orden Ascendente: " + num3 + " , " + num1 + " , " + num2);
                }else {
                    System.out.println("Orden Ascendente: " + num1 + " , " + num3 + " , " + num2);
                }
            }else {
                System.out.println("Orden Ascendente: " + num1 + " , " + num2 + " , " + num3);
            }
        }
    }
}
