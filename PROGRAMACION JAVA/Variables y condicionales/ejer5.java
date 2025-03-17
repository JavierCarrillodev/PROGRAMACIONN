//5. Pedir un número e indicar si es positivo o negativo.//
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero ");
        int num = sc.nextInt();

        if (num >0 ) {
            System.out.println("El numero es positivo");

        }else
            System.out.println("El numero es negativo");
    }
}
