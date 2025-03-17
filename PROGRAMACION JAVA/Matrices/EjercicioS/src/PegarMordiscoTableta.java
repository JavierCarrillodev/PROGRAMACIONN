import java.util.Scanner;

public class PegarMordiscoTableta {
    public static void TabletaMordisco() {
        Scanner sc = new Scanner(System.in);

        // Pedimos las dimensiones de la tabla
        System.out.println("Ingrese la anchura de la tablera: ");
        int anchura = sc.nextInt();
        System.out.println("Ingrese la altura de la tablera: ");
        int altura = sc.nextInt();

        // Tamaño y posición del mordisco
        int tamanoMordisco = 1;
        int totalBordes = 2 * (anchura + altura - 2); // Perímetro de la tabla
        int posicionMordisco = (int) (Math.random() * totalBordes);

        // Dibujamos la tabla
        int posicion = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                // Verificamos si estamos en un borde
                boolean estaEnBorde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);

                // Si estamos en el borde y la posición es la del mordisco, dejamos espacio en lugar de un asterisco
                if (estaEnBorde && (posicion == posicionMordisco)) {
                    System.out.print("  "); // Mordisco
                } else if (estaEnBorde) {
                    System.out.print("* "); // Borde
                } else {
                    System.out.print("  "); // Interior vacío
                }

                // Incrementamos la posición solo si estamos en el borde
                if (estaEnBorde) {
                    posicion++;
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    public static void main(String[] args) {
        TabletaMordisco(); // Llamamos al metodo para ejecutar el código
    }
}
