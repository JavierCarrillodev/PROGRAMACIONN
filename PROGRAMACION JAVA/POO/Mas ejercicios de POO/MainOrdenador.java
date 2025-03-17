import java.util.Scanner;

public class MainOrdenador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Ordenador ordenador = new Ordenador();
        Ordenador ordenador2 = new Ordenador();
        ordenador.setMarca("Nissan");
        ordenador2.setMarca("Nissan");
        ordenador.setModelo("Mbbape");
        ordenador2.setModelo("Mbbape");
        System.out.println( ordenador.toString());
        System.out.println(ordenador2.toString());




        int opciones;
        do {
            System.out.println();
            System.out.println("Introduce una opcion");
            System.out.println();

            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Transferir Archivos");
            System.out.println("4. Eliminar Archivos");
            System.out.println("5. Comparar ordenadores");
            System.out.println("6. Mostrar metodo toString");
            System.out.println("7. Salir");
            opciones = entrada.nextInt();

            switch (opciones) {
                case 1:
                    ordenador.encender();
                    break;
                case 2:
                    ordenador.apagar();
                    break;
                case 3:
                    ordenador.transferirArchivos(30);
                    break;
                case 4:
                    ordenador.eliminarArchivos(10);
                    break;
                case 5:
                  if (ordenador.equals(ordenador2)) {
                      System.out.println("Los ordenadores son iguales");
                  }else {
                      System.out.println("Los ordenadores son diferentes");
                  }
                    break;
                case 6:
                    System.out.println(ordenador.toString());
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                    default:
                        System.out.println("Opcion no valida introduce una opcion");
            }

        }while (opciones!=7);

    }






}
