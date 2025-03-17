package Cubo;

public class cubo {
    int cantidad;
    int capacidad;
    int contenido;
    Cubo(int c){
        this.cantidad=c;
    }
    int getCapacidad(){
        return this.cantidad;
    }
    int getContenido(int c){
        return this.capacidad;
    }
    void setCapacidad(int c){
        this.capacidad = c;
    }
    void llena(){
        this.contenido = this.capacidad;
    }
    void vacio(){
        this.contenido=0;
    }
    void pinta(){
        for(int i=0; i < this.capacidad; i++){

        }
    }
    void vuelcaEn(Cubo destino){
        int libres = destino.getCapacidad() - destino.getContenido();

        if(libres > 0){
            destino.setContenido(destino.getContenido() + this.contenido);
        }
    }
}
