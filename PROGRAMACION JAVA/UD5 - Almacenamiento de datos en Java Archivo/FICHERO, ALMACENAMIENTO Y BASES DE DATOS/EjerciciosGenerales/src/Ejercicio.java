/*EJERCICIO
 Crea un producto con nombre y precio. Guardalo en JSON y volver a leerlo
 Pasos:(modularizar convenientemente)
 1. Crear clase de producto
 2. Crer objeto producto en un programa Main
 3. Guardar el objeto o los objetos en un JSON
 4. Leer el archivo
 5. Mostrar en consola los datos
 */


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("pepsi",20));
        productos.add(new Producto("lasaña",20));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/pepito.json"), productos);
        System.out.println("Producto guardado en JSON: " + productos);

        //Leer JSON
        List<Producto> productosLeidos = mapper.readValue(new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/pepito.json"),
                mapper.getTypeFactory().constructCollectionType(List.class, Producto.class));

        for (Producto p : productosLeidos){
            System.out.println(p);
        }
    }
}
