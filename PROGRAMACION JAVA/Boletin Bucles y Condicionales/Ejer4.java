import java.util.Scanner;

//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        while(true) {

            System.out.println("Indica numeros, y si quieres acabar pon uno negativo");
            int numeros = sc.nextInt();


            if (numeros < 0){
                System.out.println("Saliendo del programa");
                System.out.println("Los numeros introducidos son : " + contador);

                break;

            }
            contador++;

        }


    }
}
