package org.leijap.hilos.ejemplos;

import org.leijap.hilos.ejemplos.runnable.ViajeTarea;
import org.leijap.hilos.ejemplos.thread.NombreThread;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        // ↓↓↓ Esta función irá mostrando salidas con delay en un orden aleatorio, gracias al Thread.sleep()
        new Thread(new ViajeTarea("Isla del Padre")).start(); //<--- Estructura que exige la interface Runnable.
        new Thread(new ViajeTarea("Cancun")).start();
        new Thread(new ViajeTarea("Puerto Vallarta")).start();
        new Thread(new ViajeTarea("Robinson Crusoe")).start();
    }
}