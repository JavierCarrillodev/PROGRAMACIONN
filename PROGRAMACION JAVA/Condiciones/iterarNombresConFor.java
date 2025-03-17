import javax.swing.*;

public class iterarNombresConFor {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Perez", "Daniel", "Lucas"};
        int count = nombres.length;

        //Iteramos sobres los nombres
        for (int i = 0; i < count; i++) {
            //Con esto lo que hacemos es decirle que ignore los siguientes nombres
            if (nombres[i].equalsIgnoreCase("JUan") ||
                nombres[i].equalsIgnoreCase("Daniel")){
                //El continue evita que los nombres "Juan" y "Daniel" sean impresos
                //IMPORTANTE. Lo que hace es saltarse y pasar al siguiente
                continue;
            }
            //Llamamos a la variable que contiene la lista de nombre y llamamos también a i
            //Para que la recorra
            System.out.println(i + ".-" +nombres[i]);
        }
        try {
            String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Juan\"Pepe\"Daniel\":");
            System.out.println("Buscar = " + buscar);

            boolean encontrado = false;
            for (int i = 0; i < count; i++){
                if (nombres[i].equalsIgnoreCase(buscar)) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado){
                JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
            }else{
                JOptionPane.showMessageDialog(null, buscar + " no fue encontrado");

            }

        } catch (NumberFormatException e){
            System.out.println("Solo valido nombres");
        }
    }

}
