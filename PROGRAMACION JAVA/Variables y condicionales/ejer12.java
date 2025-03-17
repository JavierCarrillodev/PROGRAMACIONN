//12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cifra de 0 al 9.999 ");
        int cifra = sc.nextInt();

        String numerosString = Integer.toString(cifra);
        String numeroreverse = new StringBuilder(numerosString).reverse().toString();
        System.out.println(numeroreverse);
    }
}
