package POO.Tabla_de_ventas;

import java.util.Scanner;

/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 *
 */
public class Ventas {
    public static void main(String[] args) {
        int[][] Ventas1 = new int[3][2];
        int[][] ventas ={
            {1,2},
            {4,5},
            {7,8}
        };

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese ventas para productos" + (i+1) +" del dia"
                + (j+1)+ ":");
                Ventas1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Ingrese un numero del tabla: ");


    }




}
