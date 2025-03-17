import javax.swing.*;

public class amor {
    public static void main(String[] args) {
        String[] nombres = {"Javi"};


            String buscar = JOptionPane.showInputDialog("Ingresa un nombre");
            System.out.println("Buscar " + buscar);

            boolean encontrado = false;
            int count = nombres.length;
            for (int i = 0; i < count; i++) {
                if (nombres[i].equalsIgnoreCase(buscar)) {
                    encontrado = true;
                    break;
                }

            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, buscar + " Ama muchísimo a Victoria");
            } else {
                JOptionPane.showMessageDialog(null, buscar + " ama a javi pero no tanto como el a ella");
            }

    }
}
