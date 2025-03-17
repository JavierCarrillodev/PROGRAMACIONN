//2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.//
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el radio del circulo; ");
        int radio = sc.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);

    }
}
