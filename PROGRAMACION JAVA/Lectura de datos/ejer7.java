/*Ejercicio 7. Escribe un programa que calcule el total de una factura a partir de la base
imponible.*/
import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base imponible:");
        int base_imponible = sc.nextInt();
        System.out.println("Precio del producto");
        double precio_producto = sc.nextDouble();

        double total_factura = (base_imponible * precio_producto) /100 + precio_producto;
        System.out.println("El precio del producto es: " + total_factura);


    }
}
