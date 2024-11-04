package org.leijap.ejemplos.set.list;

import org.leijap.ejemplos.set.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        /* Maneras de Implementar la función Sort*/
        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));

        // sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));

        sa.sort(comparing(Alumno::getNota).reversed()); // Aquí solo es necesario usar el parámetro que deseas getNombre, getNota, etc.

        // System.out.println(sa);

        System.out.println("Iterando usando un for each: ");
        sa.forEach(System.out::println);
    }
}
