//11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
import java.util.Arrays;
import java.util.Scanner;
public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 0 al 999 ");
        int n = sc.nextInt();
        int Cifras = String.valueOf(n).length();
        System.out.println("El numero " + n + " contiene " + Cifras + " cifras");
    }
}
