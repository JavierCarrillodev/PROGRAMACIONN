//Ejercicio 1. Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.
import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1. Realiza un programa que pida dos números y que luego muestre el resultado
        //de su multiplicación.
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        int resultado = num * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
