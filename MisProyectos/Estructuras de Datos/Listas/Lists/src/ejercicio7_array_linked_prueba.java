import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ejercicio7_array_linked_prueba {
    // Se creará un ArrayList y una LinkedList para experimentar sus tiempos reales
    // Se añadirá, eliminará y accederá a ambas listas al principio, final y en el medio.

    public static void main(String[] args) {
        int size = 1000000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Llenar las listas (puede ser por bucle for)
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 100));
            linkedList.add((int) (Math.random() * 100));
        }

        // Medir el tiempo de agregar al inicio
        long inicio = System.nanoTime();
        /*
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0,i);
        }
        */
        // ... agregar elementos al principio de ambas listas
        long fin = System.nanoTime();
        /*
        System.out.println("Agregar al principio (ArrayList): " + (fin - inicio) + " ns");
         */


        // ... repetir para LinkedList
       /*
       inicio = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,i);
        }
        fin = System.nanoTime();
        System.out.println("Agregar al principio (LinkedList): " + (fin - inicio) + " ns");
        */

        // ... repetir para otras operaciones (agregar al final, en el medio, eliminar, acceder, iterar).

        // Aquí estaré haciendo las pruebas

        /* 1. Medir el tiempo de buscar un elemento por valor*/
        int elementoaBuscar = 38;
        inicio = System.nanoTime();
        // ... buscar el elemento en arrayList
        fin = System.nanoTime();
        System.out.println("Buscar por valor (ArrayList): " + (fin - inicio) + " ns");

        if (arrayList.contains(elementoaBuscar)) {
            System.out.println("El elemento " + elementoaBuscar + " existe en el array");
        } else {
            System.out.println("La lista no contiene el elemento " + elementoaBuscar + " en el array");
        }

        System.out.println("----------------------");
        inicio = System.nanoTime();
        fin = System.nanoTime();
        System.out.println("Buscar por valor (LinkedList): " + (fin - inicio) + " ns");
        if (linkedList.contains(elementoaBuscar)) {
            System.out.println("El elemento " + elementoaBuscar + " existe en el array");
        } else {
            System.out.println("El elemento " + elementoaBuscar + " existe en el array");
        }
    }
}
