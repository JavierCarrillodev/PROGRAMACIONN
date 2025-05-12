import javax.crypto.spec.DESedeKeySpec;
import java.awt.font.FontRenderContext;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class caracter {
    public static void main(String[] args) {

      Path origen = Paths.get("ejemplo1.txt") ;
      Path destino = Paths.get("Serializar_Y_Deserializar/ejemplo1.txt") ;

      try{
          Files.move(origen,destino,StandardCopyOption.REPLACE_EXISTING);
          System.out.println("Movido correctamente");
      }catch (Exception e){
          System.out.println("Error");
      }
    }
}
