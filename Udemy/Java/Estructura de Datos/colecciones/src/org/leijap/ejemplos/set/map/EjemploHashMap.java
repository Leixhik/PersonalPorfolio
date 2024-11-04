package org.leijap.ejemplos.set.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        System.out.println("contiene elementos = " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put(null, "12345");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad" , "30");

        System.out.println("persona: " + persona);

        // Métodos Importantes de HashMap:

        String nombre = persona.get("nombre"); // Obtener value del Key nombre
        System.out.println("nombre: " + nombre);
        String apellido = persona.get("apellido"); // Obtener value del Key apellido
        System.out.println("apellido: " + apellido);

        System.out.println("========================");
        String apellidoPaterno = persona.remove("apellidoPaterno"); // apellidoPaterno fue removido
        boolean b = persona.remove("apellidoPaterno", "Roe"); // No se puede remover porque no hay un Key, Value preciso.
        System.out.println("eliminado = " + b);
        System.out.println("persona = " + persona);

        System.out.println("========================");
        boolean b2 = persona.containsKey("apellidoPaterno"); // False porque eliminamos el apellidoPaterno del Map
        System.out.println("b2 = " + b2);

        System.out.println("========================");
        b2 = persona.containsValue("Doe"); // True porque si existe el Doe en el Map
        System.out.println("b2 = " + b2);

        System.out.println("======================== values");
        // El orden del Collection es como el del Set.
        Collection<String> valores = persona.values(); // Mete lo que hay de Values de Personas en el Collection valores.
        for(String v : valores){
            System.out.println("v = " +v);
        }

        System.out.println("======================== keySet");
        Set<String> llaves = persona.keySet(); // Tomará los Key en formato Set
        for(String k: llaves){
            System.out.println("k = " + k);
        }

        // Iteraciones por for each
        System.out.println("======================== entrySet");
        for (Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("======================== keySet");
        for (String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("======================== java 8");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());
        // metodo 1 de replace:
        boolean b3 = persona.replace("nombre", "John", "Andrés");
        System.out.println("b3 = " + b3);
        // metodo 2 de replace:
        //persona.replace("nombre", "Andrés"); //( old Key, new key);
        System.out.println("persona = " + persona);
    }
}