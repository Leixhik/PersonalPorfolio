package org.leijap.hilos.ejemplos;

import org.leijap.hilos.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("John Doe");
        hilo.start();
        /* Thread.sleep(1000); //<--- .sleep siempre requerirá de un throws + Agregará un TERMINATED en consola*/
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState()); // <-- NEW en consola, desaparace el msj cuando existe un .start();
    }
}
