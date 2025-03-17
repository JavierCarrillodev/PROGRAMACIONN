import java.util.Scanner;

//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Introduce un numero");
           int numeros = sc.nextInt();

            if (numeros == 0){
                System.out.println("Saliendo del programa");
                break;
            }
            if (numeros % 2 == 0){
                System.out.println("El numero es par");
            }else {
                System.out.println("Es impar");
            }

        }

    }
}
