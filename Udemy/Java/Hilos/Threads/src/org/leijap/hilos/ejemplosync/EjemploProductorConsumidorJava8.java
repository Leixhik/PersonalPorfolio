package org.leijap.hilos.ejemplosync;


import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(()->{
            for (int i = 0; i < 10; i++){
                p.hornear("Pan n. " + i); // Constructor String masa le pasa el string al this.pan
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.consumir(); //<- Retorna un String.
            }
        }).start();
    }
}
