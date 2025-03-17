import java.util.Scanner;

public class MainJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Juego juego1 = new Juego();
        juego1.setNombre("Spiderman");
        juego1.setHistoria("Super Heroe");
        juego1.setDificultad("Facil");
        juego1.setPrecio(60);

        Juego juego2 = new Juego();
        juego2.setNombre("GTA6");
        juego2.setHistoria("LOCURA");
        juego2.setDificultad("IMPRESIONANTE");
        juego2.setPrecio(100);

        Juego juego3 = new Juego();
        juego3.setNombre("Batman");
        juego3.setHistoria("Hero/villano");
        juego3.setDificultad("Dificil");
        juego3.setPrecio(30);



        int opciones;

        try {
            do {
                System.out.println("1.-Detalles del juego1");
                System.out.println("2.-Detalles del juego2");
                System.out.println("3.-Detalles del juego que te cabrea");
                System.out.println("4.-Cerrar programa");
                opciones = sc.nextInt();

                switch (opciones){
                    case 1:
                        System.out.println(juego1.Detalles());
                        break;
                    case 2:
                        System.out.println(juego2.Detalles());
                        break;
                    case 3:
                        System.out.println(juego3.Detalles());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Solo validos las opciones del 1 - 4");
                }

            } while(opciones !=4);

        }catch (Exception e){
            System.out.println("ERROR \nPor favor introduce solo numeros ");
        }

    }
}
