import java.util.Random;
import java.util.Scanner;

public class ejer_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int option;
        System.out.println("1.Actualizar");
        int num =10;
        int num2 =10;
        int suma = num + num2;
        System.out.println("2.Eliminar");
        int resta = 10 -5;
        System.out.println("3.Agregar");
        System.out.println("4.-Listar");
        System.out.println("5.-Salir");

        try {
            System.out.println("=============================");
        System.out.println("Elige una opcion:");
        option = sc.nextInt();




        switch (option){
            case 1:
                System.out.println("Actualizar");
                //Lamamos la variable o metodo que queremos que se ejecute
                System.out.println(num2);
                break;
            case 2:
                System.out.println("Eliminar");
                break;
            case 3:
                System.out.println("Agregar");
                break;
            case 4:
                System.out.println("Listar");
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Las opciones son entre 1 y 5");
        }
        }catch (Exception e){
            System.out.println("ERROR, Solo son validos numeros");
        }




    }
}
