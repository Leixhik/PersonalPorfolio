package org.leijap.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>(); /*Cada que algo se duplique se guardará en duplicados*/
        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        /*Con esto hacemos una separación de elementos que no han sido clonados y elementos clonados al menos una vez*/

        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
