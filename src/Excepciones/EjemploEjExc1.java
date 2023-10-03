package Excepciones;

public class EjemploEjExc1 extends ArithmeticException{
    public static void main(String[] args) {
        int num=10;
        int num1=0;

        try {
            System.out.println(num/num1);

        }catch (ArithmeticException e){
            System.out.println("Algo tienes mal");
        }

    }
}
