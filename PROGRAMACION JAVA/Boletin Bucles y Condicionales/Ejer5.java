//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
//pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
//respecto a N. El proceso termina cuando el usuario acierta.
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("JUGUEMOS A UN JUEGOO!!");
        System.out.println("Indica un numero y yo tendré que adivinarlo");
        int n = sc.nextInt();

            while (true) {
                System.out.println("Indica un numero");
                int numero = sc.nextInt();
                if (numero > n){
                    System.out.println("El numero está mas abajo");
                }else if(numero < n){
                    System.out.println("El numero es mayor");
                }else {
                    System.out.println("Lo adivinastes el numero " + n  + " es el correctoo!!!");
                    break;
                }


            }
        }catch (Exception e) {
            System.out.println("ERROR, Por favor introduce un numero ");
        }

    }
}
