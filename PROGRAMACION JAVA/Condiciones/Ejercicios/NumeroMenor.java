package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Crear una clase con el metodo main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
         usando la clase Scanner ingresar la cantidad de números a comparar, luego
         utilizando una sentencia for iterar el numero de veces (ingresado) para
         pedir el numero entero, entonces se requiere:

        Calcular el menor número e imprimir el valor.
        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!.
        si no, imprimir el numero menor es igual o mayor que 10!".*/

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = sc.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = sc.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}