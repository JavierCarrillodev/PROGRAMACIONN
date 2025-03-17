import java.util.Scanner;

public class String_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nombre:");
        String nombre = sc.nextLine();


        System.out.println("(LENGTH)Contar cada caracter = " + nombre.length());
        System.out.println("(TOUPPERCASE)Nombre en mayusculas = " + nombre.toUpperCase());
        System.out.println("(TOLOWERCASE)Nombre en minusculas = " + nombre.toLowerCase());
        System.out.println("(EQUALS)Comparando nombre = " + nombre.equals("Jesus"));
        System.out.println("(EQUAL)Comparando nombre teniendo en cuenta mayusculas = " + nombre.equals("jesus"));
        System.out.println("(EQUAL)Comparando nombre ignorando mayusculas = " + nombre.equals("Jesus"));
        System.out.println("(COMPARETO)Comparando nombre con compare = " + nombre.compareTo("Jesus"));
        System.out.println("(COMPARETO)Comparando nombre con compare = " + nombre.compareTo("Pepe"));
        System.out.println("(CHARTAT)Buscas el caracter que quieras = " + nombre.charAt(2 ));
        System.out.println("(SUBSTRING)Te indica todo lo que hay a partir de ese caracter = " + nombre.substring(2 ));


        String trabalenguas = "trabalenguas";
        System.out.println("(REPLACE)Cambia los caracteres que le indiques = " + trabalenguas.replace("a", "."));
        System.out.println("(INDEXOF)Me indica en que numero se encuentra ese caracter = " + trabalenguas.indexOf("a"));
    }
}
