import java.util.Scanner;

public class MainCuadrado {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        // Pedimos las dimensiones de la tabla
        System.out.println("Ingrese la anchura de la tableta: ");
        int anchura = sc.nextInt();
        System.out.println("Ingrese la altura de la tableta: ");
        int altura = sc.nextInt();

        // Dibujamos la tabla con bordes
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                // Verificamos si estamos en un borde
                boolean estaEnBorde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);

                // Si estamos en el borde, dibujamos un asterisco
                if (estaEnBorde) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Si no estamos en el borde, dejamos espacio vacío
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
