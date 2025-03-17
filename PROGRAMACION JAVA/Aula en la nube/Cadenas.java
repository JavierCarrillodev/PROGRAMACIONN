public class Cadenas {

    public static void main(String[] args) {
        
        String cadena = "   Curso Java  ";
        cadena = cadena.trim(); //Eliminar espacios
        int longitud = cadena.length();
        char letraFinal = cadena.charAt(cadena.length()-1); //Que te diga cual es la ultima letra siempre, con-1
        String cadenaMayusculas = cadena.toUpperCase(); //Poner letras en mayusculas
        String cadenaMinusculas = cadena.toLowerCase(); //Poner letras en minusculas
        String palabra = cadena.substring(0,  5); //Que te diga cual es la primera y la ultima palabra segun el numero que tu le pongas


        System.out.println("["+cadena+"] tiene "+longitud+" letras ");
        System.out.println("La letra final es: "+letraFinal);
        System.out.println("["+cadena+"] en mayusculas es ["+cadenaMayusculas+"]");
        System.out.println("["+cadena+"] en minusculas es ["+cadenaMinusculas+"]");
        System.out.println("La primera palabra es ["+palabra+"]");





    }

}
