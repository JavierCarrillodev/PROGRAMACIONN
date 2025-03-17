package Parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Parkingg parkingg = new Parkingg("Corte Ingles",30);


    try {
        int opciones;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1.-Entrada de coche");
            System.out.println("2.-Salida de coche");
            System.out.println("3.-Mostrar Parking");
            System.out.println("4.-Salir del programa");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    parkingg.entrada("1244f", 23);
                    break;
                case 2:
                    parkingg.salida("1244f");
                    break;
                case 3:
                    System.out.println(parkingg.getPlazasTotales());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("tiene que ser entre 1 y 4");
            }

        } while (opciones != 4);

    }catch (Exception e){
        System.out.println("Solo se puede introducir numeros");
    }
    }
}
