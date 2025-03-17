import javax.swing.*;

public class switchCase {
    public static void main(String[] args) {

        /*Cuando queremos introducir un numero con el JOptionPane
        tenemos que ponerle delante el Integer.parseInt*/
        int num = Integer.parseInt (JOptionPane.showInputDialog("Introduce un numero"));

        switch (num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es 1");
                break;
            case 2:
                System.out.println("El num es 2");
                break;
            case 3:
                System.out.println("El num es 3");
                break;
                /*El default sirve para cuando el numero que introduzcamos no se encuentre.
                  Y nos salga el mensaje que nosotros le indiquemos*/
            default:
                System.out.println("Numero no encontrado");
        }

        String nombre = JOptionPane.showInputDialog("Introduce un nombre");
        switch (nombre){
            case "javi":
                System.out.println("El nombre es javi");
                break;
            case "victoria":
                System.out.println("El nombre es victoria");
                break;
            default:
                System.out.println("Nombre no encontrado");
        }

    }
}
