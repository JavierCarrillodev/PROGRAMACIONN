import java.util.Scanner;

public class ArrayBidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int producto = 5;
      int ventas = 5;

        int[][] array = new int[producto][ventas];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Ingrese un numero del producto y venta");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
