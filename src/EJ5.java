import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        int i = 0;
        int numaleatorio = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Dime un numero del 1 al 100");
            num = sc.nextInt();
            if (num>numaleatorio){
                System.out.println("Es menor");
            }
            else if (num<numaleatorio){
                System.out.println("Es mayor");

            }
            else if (num==numaleatorio){
                System.out.println("Es el mismo" + " lo has intentado " + i + " veces");
            }
            i++;
        }

        while (numaleatorio != num);
    }
}
