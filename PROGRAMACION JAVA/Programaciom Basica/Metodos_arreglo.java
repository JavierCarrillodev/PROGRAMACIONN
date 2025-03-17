public class Metodos_arreglo {
    public static void main(String[] args) {
        String nombre = "pepe";
        char[] arreglo = nombre.toCharArray();
        int largo = nombre.length();
        System.out.println("largo " + largo);
        for (int i = 0; i < largo; i++){
        System.out.println(arreglo[i]);
    }
    }
}
