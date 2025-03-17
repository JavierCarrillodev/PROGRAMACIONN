package TablaDeVentas;

import java.util.ArrayList;
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
public class TablaVentas {
    private  int[][] tablaVentas;
    private  int prod1;
    private  int prod2;
    private  int prod3;

    public TablaVentas() {
        tablaVentas = new int[3][2];
    }
    public void introducirVentas() {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("PRIMER DIA: ");

        System.out.println("Ingrese las ventas del primer producto: ");
        int ventasProd1 = sc.nextInt();
        this.prod1 += ventasProd1;
        tablaVentas[0][0] = ventasProd1;

        System.out.println("Ingrese las ventas del segundo producto: ");
        int ventasProd2 = sc.nextInt();
        this.prod2 += ventasProd2;
        tablaVentas[1][0] = ventasProd2;

        System.out.println("Ingrese las ventas del tercer producto: ");
        int ventasProd3 = sc.nextInt();
        this.prod3 += ventasProd3;
        tablaVentas[2][0] = ventasProd3;

        System.out.println("SEGUNDO DE DIA:");
        System.out.println("Ingrese las ventas del primer producto: ");
        int ventasProd1Dia2 = sc.nextInt();
        this.prod1 += ventasProd1Dia2;
        tablaVentas[0][1] = ventasProd1Dia2;

        System.out.println("Ingrese las ventas del segundo producto: ");
        int ventasProd2Dia2 = sc.nextInt();
        this.prod2 += ventasProd2Dia2;
        tablaVentas[1][1] = ventasProd2Dia2;

        System.out.println("Ingrese las ventas del tercer producto: ");
        int ventasProd3Dia2 = sc.nextInt();
        this.prod3 += ventasProd3Dia2;
        tablaVentas[2][1] = ventasProd3Dia2;
    }

    public void mostrarVentas() {
        int dia = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                if(j==0){
                    dia = 1;
                }else {
                    dia = 2;
                }
                System.out.println("Dia " +dia + ":");
                System.out.println(tablaVentas[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void totalVentasProductos(){
        System.out.println("Total ventas producto 1: " + this.prod1);
        System.out.println("Total ventas producto 2: " + this.prod2);
        System.out.println("Total ventas producto 3: " + this.prod3);
    }
     public void productoMasVendido(){
         ArrayList<Integer> productos = new ArrayList<>();

         productos.add(1);
         productos.add(2);
         productos.add(3);

         int prodMasVendido = 0;
         for (int producto: productos) {
             if( producto > prodMasVendido){
                 prodMasVendido = producto;
             }
         }
         if (prodMasVendido == prod1){
             prodMasVendido = 1;
         } else if (prodMasVendido == prod2) {
             prodMasVendido = 2;
         }else if (prodMasVendido == prod3) {
             prodMasVendido = 3;
         }
         System.out.println("El producto mas vendido es: " + prodMasVendido);
     }








}
