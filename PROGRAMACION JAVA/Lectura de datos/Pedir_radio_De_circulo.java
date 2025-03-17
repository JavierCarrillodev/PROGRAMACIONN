import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Pedir el radio de un circulo y calcular su área. A=PI*relevado a 2 */
public class Pedir_radio_De_circulo {
    public static void main(String[] args) {
        BufferedReader calcular = new BufferedReader(new InputStreamReader(System.in));

        double radio;
        try {
            System.out.println("Introduce el radio del circulo: ");
            radio = Double.parseDouble(calcular.readLine());

            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + area);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());

        }
    }

}
