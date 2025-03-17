package Enum;

public class Usando_Enum {
    public static void main(String[] args) {

        for (Ejemplo_Enum mes: Ejemplo_Enum.values()) {
            System.out.println("El mes " + mes.name() + " tiene " + mes.getDias() + " dias");

        }
    }
}
