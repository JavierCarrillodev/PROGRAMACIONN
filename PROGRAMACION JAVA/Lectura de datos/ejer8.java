/*Ejercicio 8. Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora*/
import java.util.Scanner;
public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado esta semana");
        int horas = sc.nextInt();

        double tarifa_hora = 12;

        double salario = horas * tarifa_hora;
        System.out.println("El salario es " + salario);


    }
}
