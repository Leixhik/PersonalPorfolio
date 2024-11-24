package org.leijap.hilos.ejemplos;

import org.leijap.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
/*Lambda*/Runnable viaje = ()->{ /*new Runnable() en caso de no ser lambda e iniciar desde una interface*/
            /*@Override
            public void run() {*/
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName()); //<- Mostrar el numero de ciclo + nombre del constructor
                    try {
                        Thread.sleep((long)(Math.random() * 1000)); //<-- Convierte el tipo de dato double a long y hace un random de 1000
                    } catch (InterruptedException e) {
                        e.printStackTrace(); //<-- Muestra el error más simplificado.
                    }
                }
                System.out.println("Finalmente me voy a de viaje a: " + Thread.currentThread().getName());
                System.out.println(main.getState());
            //}
        };


        // ↓↓↓ Esta función irá mostrando salidas con delay en un orden aleatorio, gracias al Thread.sleep()
        Thread v1 = new Thread(viaje, "Isla del Padre"); //<--- Estructura que exige la interface Runnable.
        Thread v2 = new Thread(viaje, "Cancun");
        Thread v3 = new Thread(viaje, "Puerto Vallarta");
        Thread v4 = new Thread(viaje, "Robinson Crusoe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Thread.sleep(10000);
        System.out.println("Continuando con la ejecución del método main: " + main.getName());
    }
}