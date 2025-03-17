//Ejercicio 6. Escribe un programa que calcule el área de un triángulo.
import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la base");
        double base = sc.nextDouble();
        System.out.println("Indica la altura");
        double altura = sc.nextDouble();
        double area = (base * altura) /2;
        System.out.println("El area del triángulo es: " + area);
    }
}

