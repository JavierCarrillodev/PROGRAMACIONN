//4. Pedir dos números y decir si son iguales o no.//
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero: ");
        int nm1 = sc.nextInt();
        System.out.println("Indica otro numero: ");
        int nm2 = sc.nextInt();

        if (nm1 == nm2) {
            System.out.println("Es igual");

        }else{
            System.out.println("No son iguales");
        }
    }
}
