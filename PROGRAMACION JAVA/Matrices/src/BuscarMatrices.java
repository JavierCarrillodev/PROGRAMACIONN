public class BuscarMatrices {
    public static void main(String[] args) {

        int [][] matrizEntero = {
                {23,34,23,2323},
                {42343,34,3,4},
                {15,34,3,4},
                {55,32,534,1}
        };

        int elementoBuscar =55 ;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for ( i = 0; i < matrizEntero.length; i++){
            for(j = 0; j < matrizEntero[i].length; j++) {
                if (matrizEntero[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        }else {
            System.out.println(elementoBuscar + " No ha sido encontrado");
        }
    }
}
