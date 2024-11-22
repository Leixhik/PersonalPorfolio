package org.leijap.hilos.ejemplos;

import org.leijap.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        /*/Lambda*/Runnable viaje = ()->/*new Runnable()*/ {
            /*@Override
            public void run() {*/
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName()); //<- Mostrar el numero de ciclo + nombre del constructor
                }
                try {
                    Thread.sleep((long)(Math.random() * 1000)); //<-- Convierte el tipo de dato double a long y hace un random de 1000
                } catch (InterruptedException e) {
                    e.printStackTrace(); //<-- Muestra el error más simplificado.
                }

            //}
        };


        // ↓↓↓ Esta función irá mostrando salidas con delay en un orden aleatorio, gracias al Thread.sleep()
        new Thread(viaje, "Isla del Padre").start(); //<--- Estructura que exige la interface Runnable.
        new Thread(viaje, "Cancun").start();
        new Thread(viaje, "Puerto Vallarta").start();
        new Thread(viaje, "Robinson Crusoe").start();
    }
}