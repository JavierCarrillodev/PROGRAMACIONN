import java.util.Scanner;

public class MainAutomovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Automovil auto = new Automovil("Ford, "," Focus, ", " verde, ",2.0, 55);

        Automovil auto2 = new Automovil("yo", "ella", "verde rojo", 2.0);
        System.out.println("Son iguales? " + (auto == auto2));
        System.out.println("Son iguales con equals? " + (auto.equals(auto2)));


        System.out.println("auto.color = " + auto.getColor());

        Automovil cochazo = new Automovil();
        cochazo.setColor(Automovil.COLOR_VERDE);
        cochazo.setModelo("tesla");
        cochazo.setFabricante("yo");
        cochazo.setColor("nissan");
        System.out.println("cochazo.fabricante = " + cochazo.getFabricante());
        System.out.println("cochazo.color = " + cochazo.getColor());
        System.out.println("cochazo.modelo = " + cochazo.getModelo());
        System.out.println("cochazo.cilindrada = " + cochazo.getCilindrada());

        System.out.println(auto.acelerarFrenar(4500));

        System.out.println("Litros gastado por kilometros = " + auto.calcularConsumo(200,0.3));
        System.out.println("Litros gastado por kilometros = " + Automovil.calcularConsumoEstatico(200,60.6));


        System.out.println();

        int opciones;
        try {
            do{

                System.out.println("Para metodo detalles pulsa 1");

                System.out.println("Para metodo acelerar pulsa 2");

                System.out.println("Para frenar pulsa 3");

                System.out.println("Para metodo acelerarFrenar pulsa 4");

                System.out.println("Para metodo calcularConsumo pulsa 5");

                System.out.println("Para terminar pulse 6");

                System.out.println("Por favor introduce una opcion: ");
                opciones = sc.nextInt();


                switch (opciones) {
                    case 1:
                        System.out.print(auto.detalles());
                        break;
                    case 2:
                        System.out.println(auto.acelerar(1000));
                        break;
                    case 3:
                        System.out.println(auto.frenar());
                        break;
                    case 4:
                        System.out.println(auto.acelerarFrenar(2000));
                        break;
                    case 5:
                        System.out.println(auto.calcularConsumo(30, 10));
                        break;
                    case 6:
                        System.out.println("Cerrando programa...");
                        break;
                    default:
                        System.out.println("Las opciones son del 1 - 6");
                }
            } while(opciones !=6);

        }catch(Exception e){
            System.out.println("ERROR \nSolo puedes introducir numeros");
        }


    }


}
