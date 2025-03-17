import javax.swing.*;

public class operadores_Aritmeticos {
    public static void main(String[] args) {
        try {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (numero % 2 == 0){
                System.out.println("El numero " + numero  + " es par");
            }else{
                System.out.println("El numero " + numero  + " es impar");
            }
        }catch (NumberFormatException e){
            System.out.println("Solo son validos numeros");
        }

    }
}
