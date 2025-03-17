import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_usuario {
    public static void main(String[] args) {
        String numerito = "123";
        System.out.println(numerito);
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();


            if (numero >= 5) {
                System.out.println("Aprobado");
            } else
                System.out.println("Suspensoo");
        }catch (InputMismatchException e) {
            System.out.println("Solo son validos los numeros");
        }
    }
}
