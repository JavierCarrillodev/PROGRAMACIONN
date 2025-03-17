import javax.swing.*;

public class interfaz {
    public static void main(String[] args) {
        //Con JOptionPane.showInputDialog hacemos que nos salga una interfaz en nuestra pantalla
        String numeroStr = JOptionPane.showInputDialog(null,"Ingres el numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numero decimal =" + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b1110;
        System.out.println("numeroBinario = " + numeroBinario);
    }
}
