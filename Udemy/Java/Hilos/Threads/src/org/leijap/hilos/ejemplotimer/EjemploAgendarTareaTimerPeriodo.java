package org.leijap.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer(); //<- Creamos el objeto Timer
        timer.schedule(new TimerTask() { //<- Creamos el objeto TimerTask
            //prívate int contador = 3;

            @Override //<- Sobreescribimos el metodo run por ser TimerTask una abstractClass
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if (i > 0){
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periódica realizada en: " + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());//<- Tarea que mostrará la fecha de impresión y el nombre
                    // del Thread

                }else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel(); //<- Cierre del Timer
                }
            }
        }, 0, 10000); //<- Delay de 5 segundos (milli:5000)

        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos ..."); //mensaje sin delay
    }
}
