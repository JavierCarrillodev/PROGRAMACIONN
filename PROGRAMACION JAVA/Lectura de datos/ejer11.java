/*Ejercicio 11. Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%*/
import java.util.Scanner;
public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primer_examen = 40;
        int segundo_examen = 60;
        System.out.println("Que nota quieres sacar en el primer examen?: ");
        int examen = sc.nextInt();
        int cuenta = (primer_examen * examen) / 100;
        int cuenta2 = (cuenta * segundo_examen) / 100;
        System.out.println("El primer examen " + cuenta2);

    }
}
