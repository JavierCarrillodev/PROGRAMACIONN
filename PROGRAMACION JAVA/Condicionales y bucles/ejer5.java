/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
respecto a N*/
import java.util.Random;
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 13;
        do{
            System.out.println("Introduce numeros hasta adivinar el numero escondido");
            n = sc.nextInt();
            if (n > 13){
                System.out.println("El numero escondido es menor");
            }else if(n < 13){
                System.out.println("El numero escondido es mayor");
            }
        }while (n != 13);
        System.out.println("Has acertado!!! es 13");
        }
    }