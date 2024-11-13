package org.leijap.vuelos.modelo;

import org.leijap.vuelos.clases.Vuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploVuelo {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("EEE, d MMM HH:mm yyyy");

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", df.parse("Mon, 29 Aug 05:39 2021"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("Mon, 31 Aug 04:45 2021"), 47));
        vuelos.add(new Vuelo("SKU 621", "Río de Janeiro", "Santiago", df.parse("Mon, 30 Aug 16:00 2021"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", df.parse("Mon, 29 Aug 13:22 2021"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogotá", "Santiago", df.parse("Mon, 31 Aug 14:05 2021"), 25));
        vuelos.add(new Vuelo("AMX 10", "México City", "Santiago", df.parse("Mon, 31 Aug 05:20 2021"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", df.parse("Mon, 30 Aug 08:45 2021"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", df.parse("Mon, 29 Aug 07:41 2021"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", df.parse("Mon, 30 Aug 10:35 2021"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", df.parse("Mon, 29 Aug 09:14 2021"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", df.parse("Mon, 31 Aug 08:33 2021"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panamá City", "Santiago", df.parse("Mon, 31 Aug 15:15 2021"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", df.parse("Mon, 30 Aug 08:14 2021"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", df.parse("Mon, 29 Aug 22:53 2021"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", df.parse("Mon, 31 Aug 09:57 2021"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", df.parse("Mon, 31 Aug 04:00 2021"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", df.parse("Mon, 29 Aug 07:45 2021"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("Mon, 30 Aug 07:12 2021"), 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", df.parse("Mon, 29 Aug 18:29 2021"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", df.parse("Mon, 30 Aug 15:45 2021"), 39));

        vuelos.sort((v1, v2) -> v2.getFechaYHora().compareTo(v1.getFechaYHora()));
        System.out.println("====Lista de Vuelos de Forma Ascendente====");
        vuelos.forEach(System.out::println);

        System.out.println("===================");
        Vuelo ultimoVuelo = vuelos.get(0);
        System.out.println("El último vuelo en llegar es: " + ultimoVuelo.getNombre() + " - " + ultimoVuelo.getOrigen() + " - " + ultimoVuelo.getFechaYHora());

        System.out.println("===================");
        vuelos.sort((v1,v2) -> Integer.valueOf(v2.getPasajeros()).compareTo(v1.getPasajeros()));
        Vuelo menorCantidadPasajeros = new LinkedList<>(vuelos).peekLast();
        System.out.println("El vuelo con menor cantidad es el " + menorCantidadPasajeros.getNombre() + ": "+ menorCantidadPasajeros.getOrigen() + ", " + menorCantidadPasajeros.getPasajeros() + " pasajeros.");

    }
}
