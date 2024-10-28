package org.leijap.ejemplos.set.set;

import org.leijap.ejemplos.set.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        //System.out.println(sa);

        System.out.println("Iterando usando un for each: ");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while e iterator: ");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a.getNombre()));

        //En caso de ser un List
        /*for(int i = 0; i < sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(sa.getNombre())
        }
        * */
    }
}
