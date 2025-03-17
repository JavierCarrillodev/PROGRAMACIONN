package Ejer9;

import java.util.Scanner;

public class MainTerminal {
    public static void main(String[] args) {

        Terminal t1 = new Terminal(123121213);
        Terminal t2 = new Terminal(111111111);
        Terminal t3 = new Terminal(121507363);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos segundos dura la llamada");
        int tiempoLlamada = sc.nextInt();

        t1.llama(t2, tiempoLlamada);

        System.out.println("Datos post de la llamada");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("Cuantos segundos dura la llamada");
        int tiempoLlamada2 = sc.nextInt();

        t1.llama(t3, tiempoLlamada2);

        System.out.println("Datos post de la llamada");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("Cuantos segundos dura la llamada");
        int tiempoLlamada3 = sc.nextInt();

        t2.llama(t1, tiempoLlamada3);

        System.out.println("Datos post de la llamada");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
