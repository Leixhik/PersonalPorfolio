import java.util.ArrayList;
import java.util.List;

public class estructuraLista {
    public static void main(String[] args) {

        //Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        //Agregar elementos
        numeros.add(10);
        numeros.add(5);
        numeros.add(15);

        //Acceder a un elemento por su número de índice
        int primerNumero = numeros.get(0);

        //Modificar elemento(índice, nuevoElemento)
        numeros.set(1, 20);

        //Eliminar elemento(índice)
        numeros.remove(2);

        //Iterando(mostrarel contenido) sobre una Lista
        for (int numero : numeros){
            System.out.println(numero);
        }
    }
}
