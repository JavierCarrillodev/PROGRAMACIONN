package TerminalMovil;

public class Main {
    public static void main(String[] args) {


        Movil m1 = new Movil("678 11 22 33", "rata");
        Movil m2 = new Movil("644 74 44 69", "mono");
        Movil m3 = new Movil("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llamar(m2, 720);
        m1.llamar(m2, 1000);
        m2.llamar(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
