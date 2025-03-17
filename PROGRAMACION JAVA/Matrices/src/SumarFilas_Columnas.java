public class SumarFilas_Columnas {
    public static void main(String[] args) {
        int sumarFila, sumarColumnas;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i = 0; i < a.length; i++){
            sumarColumnas = 0;
            sumarFila = 0;
            for(int j = 0; j < a[i].length; j++){
                sumarFila += a[i][j];
                sumarColumnas += a[j][i];
            }
            System.out.println("Total fila " + i + ": " + sumarFila);
            System.out.println("Total columna " + i + ": " + sumarColumnas);


        }

    }
}
