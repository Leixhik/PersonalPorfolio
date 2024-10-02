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
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0,i);
        }
        // ... agregar elementos al principio de ambas listas
        long fin = System.nanoTime();
        System.out.println("Agregar al principio (ArrayList): " + (fin - inicio) + " ns");


        // ... repetir para LinkedList
        inicio = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,i);
        }
        fin = System.nanoTime();
        System.out.println("Agregar al principio (LinkedList): " + (fin - inicio) + " ns");

        // ... repetir para otras operaciones (agregar al final, en el medio, eliminar, acceder, iterar).

    }
}
