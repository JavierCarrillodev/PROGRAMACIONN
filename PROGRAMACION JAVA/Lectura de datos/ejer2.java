//Ejercicio 2. Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
//convertir debe ser introducida por teclado.
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas");
        int euros = sc.nextInt();
        double conversion = 166.386;
        double pesetas = euros * conversion;
        System.out.println("El peseta es " + pesetas);

    }
}
