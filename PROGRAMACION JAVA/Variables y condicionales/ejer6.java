//6. Pedir dos números y decir si uno es múltiplo del otro.//
import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        System.out.println("Ingrese otro primer numero");
        int num2 = sc.nextInt();

        if (num % num2 == 0) {
            System.out.println("Es multiplo");

        }else{
            System.out.println("No es multiplo");
        }
    }
}
