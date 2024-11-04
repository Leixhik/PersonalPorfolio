package org.leijap.ejemplos.set.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put(null, "12345");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad" , "30");

        System.out.println("persona: " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre: " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido: " + apellido);
    }
}
