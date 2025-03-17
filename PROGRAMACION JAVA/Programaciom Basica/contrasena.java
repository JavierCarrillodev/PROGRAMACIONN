import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*usuarios [0] = " javi";
        passwords [0] = "javi";

        usuarios [1] = "vic";
        password [1] = "vic13";*/

        String[] usuarios = {"javi","vic"};
        String[] passwords = {"javivi","vic13"};

        String usu = JOptionPane.showInputDialog(null, "Ingresa el usuario");

        String pass = JOptionPane.showInputDialog(null, "Ingresa la contrasena");

        boolean esAutenticados = false;

        for( int i = 0; i < usuarios.length; i++ ){
            esAutenticados = (usuarios[i].equals(usu) && passwords[i].equals(pass))? true: esAutenticados;


            /*if ( (usuarios[i].equals(usu) && passwords[i].equals(pass))){
                esAutenticados = true;
                break;

            }*/
        }

        String mensaje = esAutenticados ? "Bienvenido usuario ".concat(usu).concat("!"):
                "Usuario o contrasena incorrecta! \nLo sentimos, requiere autenticacion";
        System.out.println(mensaje);

        /*if (esAutenticados) {
            System.out.println("Bienvenido usuario " .concat(usu).concat("!"));
        }else{
            System.out.println("Username o contrasena incorrecta");
            System.out.println("Lo siento, requiere atutenticacion");
        }*/

    }

}
