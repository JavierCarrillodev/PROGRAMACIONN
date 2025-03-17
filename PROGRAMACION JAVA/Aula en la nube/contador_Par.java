
public class contador_Par {
    public static void main(String[] args) {
    int contador = 2;
    int suma = 0;

    while (contador <=10) {
        suma += contador;
        contador+=2;
    }
        System.out.println("La suma de todos los numeros pares son: " + suma);

    }
}
