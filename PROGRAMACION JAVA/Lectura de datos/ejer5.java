//Ejercicio 5. Escribe un programa que calcule el área de un rectángulo.
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la base");
        double base = sc.nextDouble();
        System.out.println("Indica la altura");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El area del rectángulo es: " + area);
    }
}
