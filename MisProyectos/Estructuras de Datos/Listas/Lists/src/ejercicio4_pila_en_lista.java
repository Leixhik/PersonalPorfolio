import java.util.ArrayList;
import java.util.List;

public class ejercicio4_pila_en_lista {
    public static class Pila{

        private List<Integer> elementos; //Utilizamos una lista para almacenar los elementos.

        public Pila(){
            elementos = new ArrayList<>();
        }

        public void push(int elemento){
            elementos.add(elemento); // Agregar al final de la lista (cima de la pila)
        }

        public int pop(){
            if (isEmpty()){
                throw new RuntimeException("Pila vacia");
            }
            return elementos.remove(elementos.size() - 1); // Elimina y devuelve el último elemento.
        }

        public int peek(){
            if (isEmpty()){
                throw new RuntimeException("Pila vacia");
            }
            return elementos.get(elementos.size() - 1); // Obtiene el último elemento sin quitarlo.
        }

        private boolean isEmpty() {
            return elementos.isEmpty(); // Verifica si el Stack está vacío.
        }
    }

    //Implementar una pila utilizando una lista.
    public static void main(String[] args) {
        Pila miPila = new Pila();
        miPila.push(10);
        miPila.push(5);
        System.out.println(miPila.peek()); // Imprime 5 (5 es el peek)
        int elemento = miPila.pop(); // Elimina y devuelve el 5.
    }



}
