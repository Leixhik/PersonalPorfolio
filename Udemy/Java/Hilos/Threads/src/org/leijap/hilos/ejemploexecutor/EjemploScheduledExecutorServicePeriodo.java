package org.leijap.hilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        // Instancia de cuenta regresiva
//        CountDownLatch lock = new CountDownLatch(5);

        AtomicInteger contador = new AtomicInteger(5);

        Future<?> future =  executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000); // Simular una tarea que tarda 1 segundo
//                lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1000 ,2000, TimeUnit.MILLISECONDS);

//        lock.await();
//        future.cancel(true);
//        TimeUnit.SECONDS.sleep(10); // La tarea se ejecuta durante 10 segundos y después se apaga
        while(contador.get() >= 0){
            if (contador.get() == 0) {
                future.cancel(true);
                contador.getAndDecrement();
            }
        }

        System.out.println("Alguna otra tarea en el main ...");
        executor.shutdown();
    }
}
