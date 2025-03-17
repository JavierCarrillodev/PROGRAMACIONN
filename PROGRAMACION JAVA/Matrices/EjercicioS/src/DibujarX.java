import java.awt.font.FontRenderContext;

public class DibujarX {

    public static void main(String[] args) {

        String[][] n =  {
                {"X","_","_","_","X"},
                {"_","X","_","X","_"},
                {"_","_","X","_","_"},
                {"_","X","_","X","_"},
                {"X","_","_","_","X"}
        };

        for (String[] fila : n){
          for (String elemento : fila){
              System.out.print(elemento + "\t");
          }
            System.out.println();
        }



    }
}
