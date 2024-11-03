package org.leijap.ejemplos.set.set;

import org.leijap.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.add(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero =" + enlazada.peekFirst()); // getFirst pero dará un Exception si está vacía
        System.out.println("Ultimo =" + enlazada.peekLast()); // getLast pero dará un Exception si está vacía
        System.out.println("Indice 2 = " + enlazada.get(2));

        /* Obtener y eliminar el primer alumno y asignarlo a la variable zeus
        Alumno zeus = enlazada.removeFirst(); // pollFirst
        Alumno zeus = enlazada.pop();*/

        /* Obtener y eliminar el último alumno, pero no guardarlo
        enlazada.removeLast(); // pollLast*/

        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.add(a);
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());


    }
}
