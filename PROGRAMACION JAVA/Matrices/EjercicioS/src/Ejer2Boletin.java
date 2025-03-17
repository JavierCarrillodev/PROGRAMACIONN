import java.util.Scanner;

public class Ejer2Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila = 4;
        int columna = 5;
        int[][] num = new int[fila][columna];

        System.out.println("Ingresa 20 numeros");

        // Introducir los números en la matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + ", columna " +  (j + 1) + ": ");
                num[i][j] = sc.nextInt();
            }
        }

        // Imprimir la matriz con las sumas parciales
        int sumaTotal = 0;
        for (int i = 0; i < fila; i++) {
            int sumarFilas = 0;
            for (int j = 0; j < columna; j++) {
                sumarFilas += num[i][j];  // Sumar elementos de cada fila
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumarFilas);
            sumaTotal += sumarFilas;  // Sumar al total general
        }

        // Imprimir las sumas de las columnas
        for (int j = 0; j < columna; j++) {
            int sumarColumnas = 0;
            for (int i = 0; i < fila; i++) {
                sumarColumnas += num[i][j];  // Sumar elementos de cada columna
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumarColumnas);
        }

        // Imprimir la matriz
        System.out.println("\nLa matriz que has introducido es: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir la suma total
        System.out.println("La suma total es: " + sumaTotal);
    }
}
