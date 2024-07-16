package pilas;

import java.util.Stack;

public class pilas {

    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía: "+ pila);
        System.out.println("¿Está vacía?: "+pila.isEmpty());

        //Agregar (Apilar Recorridos)|
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido for each
        for (Integer pilita : pila){
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: "+pila);
        System.out.println("Pila vacía? "+pila.isEmpty());

        pila.pop(); // Eliminar el último registro que entró
        System.out.println("Está el 3? "+ pila.search(3)); // -1 en caso de no encontrarlo
        System.out.println("Último agregado: "+ pila.peek());
    }

}
