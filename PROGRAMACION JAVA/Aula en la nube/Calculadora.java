public class Calculadora {

    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        // Llamada a las funciones dentro del método main

        int suma = sumar(10, 5);
        int resta = restar(10, 5);


        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);

    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
    public static int main(String[] args) {

    }
}
