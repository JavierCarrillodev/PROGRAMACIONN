//Leer dos números A y B e intercambiar el valor de sus variables
public class intercambiar_valores {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Variables sin intercambiar: " + "a = " + a +" y " +"b = " + b);
        int intercambio = b;
        b = a;
        a = intercambio;
        System.out.println("Las variables ahora son: " + "a = " + a +" y " +"b = " + b);
    }
}
