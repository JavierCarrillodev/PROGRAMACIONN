//3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.//
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia");
        int radio = sc.nextInt();
        double longitud = 2 * Math.PI * (radio);
        System.out.println("La longitud de la circunferencia " + longitud);

    }
}
