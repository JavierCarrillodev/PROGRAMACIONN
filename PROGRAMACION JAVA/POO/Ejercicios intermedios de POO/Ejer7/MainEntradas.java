package Ejer7;

import java.util.Scanner;

public class MainEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Entradas principal = new Entradas(1000);
        Entradas CompraVenta = new Entradas(200);
        Entradas VIP = new Entradas(25);

        boolean finPrograma = true;

        while (finPrograma){
            System.out.println("Introduce una opcion");

            System.out.println("1.- Mostrar numeros de entradas libres");
            System.out.println("2.- Comprar entradas");
            System.out.println("3.- Salir");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("En la zona principal hay " + principal.getEntradas()+ " entradas");
                    System.out.println("En la zona compra-venta hay" + CompraVenta.getEntradas()+ " entradas");
                    System.out.println("En la zona VIP hay " + VIP.getEntradas()+ " entradas");
                    break;

                case 2:
                    System.out.println("Que zona deseas?");
                    System.out.println("1.- Zona principa");
                    System.out.println("2.- Zona Compra venta");
                    System.out.println("3.- Zona Vip");
                    int zonaDeseada = sc.nextInt();

                    System.out.println("Cuantas entradas deseas comprar: ");
                    int entradasDeseadas = sc.nextInt();

                    switch (zonaDeseada){
                        case 1:
                            principal.ventaEntradas(entradasDeseadas);
                            break;
                        case 2:
                            CompraVenta.ventaEntradas(entradasDeseadas);
                            break;
                        case 3:
                            VIP.ventaEntradas(entradasDeseadas);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    finPrograma = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    }



            }
        }



}