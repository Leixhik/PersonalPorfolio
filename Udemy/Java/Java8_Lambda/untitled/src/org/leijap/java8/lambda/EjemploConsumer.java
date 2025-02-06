package org.leijap.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi =  (nombre, edad) ->
            System.out.println(nombre + " tiene " + edad + " años!");

        consumidorBi.accept("Pepe", 20);

        Consumer<String> consumidor2 = System.out::println; // Expresión lambda reducida.
        consumidor2.accept("Hola mundo lambda!");
    }
}
