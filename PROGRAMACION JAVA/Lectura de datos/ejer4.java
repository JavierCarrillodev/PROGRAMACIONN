/*Ejercicio 4. Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.*/
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de pesetas que quieres convertir a euros");
        int pesetas = sc.nextInt();
        double conversion = 166.386;
        double euros = pesetas / conversion;
        System.out.println("En euro es " + euros);

    }


}

