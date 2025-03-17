/* Realiza un programa que pinte una tableta de turron con un bocado realizado de forma aleatoria.
El ancho y el alto de la tableta se pide por teclado.El bocado se da alrededo del turron, obviamente no se puede dar
un bocado en el mendio de la tableta */
import java.util.Scanner;
public class Tableta_Turron {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("La altura de la tableta");
        int valor = sc.nextInt();



        for (int fila = 1; fila <= valor; fila++) {
            for (int columna = 1; columna <= valor; columna++)
                System.out.print("*");

            System.out.println();
        }

    }

}