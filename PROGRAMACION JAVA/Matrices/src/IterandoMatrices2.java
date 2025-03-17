public class IterandoMatrices2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe", "Pepa"}, {"Juan", "juanito"},{"victoria","lola"}};

        for (String[] fila : nombres){
            for (String nombre : fila){
                System.out.print(nombre+ "\t");
            }
            System.out.println();
        }
    }
}
