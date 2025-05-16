import java.io.File;

public class crearVariosDirectorio {
    public static void main(String[] args) {
                // Lista de rutas a crear
                String[] rutas = {"EjerciciosFicheros/NUEVODIRECTorio/CASA/COCINA/datos/clientes/jefe/capitan"
                };

                for (String ruta : rutas) {
                    File dir = new File(ruta);
                    if (dir.mkdirs()) {
                        System.out.println("Directorio creado: " + ruta);
                    } else {
                        System.out.println("Ya existe o no se pudo crear: " + ruta);
                    }
                }
            }
        }