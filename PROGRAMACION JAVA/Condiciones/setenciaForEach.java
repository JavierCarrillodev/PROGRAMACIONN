public class setenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,7,10,15};

        //ForEach lo que hace es recorrer la lista y mostrarte lo que tiene dentro iterando
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Javi","Pedro","Nevado", "Lola"};
        for (String nombre : nombres){
            System.out.println("Nombre = " + nombre);
        }
    }
}
