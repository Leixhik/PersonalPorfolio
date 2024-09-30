import java.util.LinkedList;
import java.util.List;

public class ejercicio6_cola_en_lista {
    //Implementar una cola por medio de una lista

    public static void main(String[] args) {
       //Crear Cola
        Cola miQueue = new Cola();

        // Agregar elementos a la cola
        miQueue.encolar(10);
        miQueue.encolar(5);
        miQueue.encolar(15);

        // Mostrar el primer elemento sin eliminarlo
        System.out.println("El primer elemento es: " + miQueue.primero());

        // Eliminar y mostrar el primer elemento
        System.out.println("Eliminamos: " + miQueue.desencolar());

        // Verificar si la cola está vacía
        System.out.println("La cola está vacía: " + miQueue.isEmpty());
    }

    public static class Cola{
        private List<Integer> elementos;

        public Cola(){
            elementos = new LinkedList<>();
        }

        public void encolar(int elemento){
            elementos.add(elemento); // Agregar elementos al final de la lista (final de la cola)
        }

        public int desencolar(){
            if (isEmpty()){
                throw new RuntimeException("Cola vacía");
            }
            return elementos.remove(0); // Eliminar y devolver el primer elemento.
        }

        public int primero(){
            if (isEmpty()){
                throw new RuntimeException("Cola vacia");
            }
            return elementos.get(0); // Obtener el primer elemento sin eliminarlo.
        }
        private boolean isEmpty() {
            return elementos.isEmpty();
        }
    }


}
