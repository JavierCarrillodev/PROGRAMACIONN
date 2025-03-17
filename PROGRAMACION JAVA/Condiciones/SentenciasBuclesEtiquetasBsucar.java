public class SentenciasBuclesEtiquetasBsucar {
    public static void main(String[] args) {

        String frase = "Tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        buscar:
        //Este bucle recorre la frase, uno a uno, empezando desde el primer carácter (índice i = 0).
        for (int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                /*Si en algún momento los caracteres de la frase y la palabra no coinciden, se ejecuta continue buscar,
                 lo que hace que el programa salte al siguiente valor de i en el bucle exterior.
                 Es decir, vuelve a empezar la búsqueda en una nueva posición de la frase.*/
                if(frase.charAt(k++) !=  palabra.charAt(j)){
                    continue buscar;

                }

            }
            //Si todos los caracteres coinciden, aumenta el contador
            cantidad ++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase ");
    }
}
