import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
            System.out.println("1.Suma");

            int num =10;
            int num2 =10;
            int suma = num + num2;
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.-Division");

            try {
                System.out.println("Por favor introduce una opcion:");
                opcion = leer.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("suma");
                        break;
                    case 2:
                        System.out.println("Buenas loco");
                        break;
                    case 3:
                        System.out.println("Buenas locaaa");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }
            }catch (InputMismatchException e){
                System.out.println("Debes introducir un numero");
            }

    }

}
