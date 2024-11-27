package org.leijap.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        Timer timer = new Timer(); //<- Creamos el objeto Timer
        timer.schedule(new TimerTask() { //<- Creamos el objeto TimerTask

            @Override //<- Sobreescribimos el metodo run por ser TimerTask una abstractClass
            public void run() {
                System.out.println("Tarea realizada en: " + new Date() + " nombre del Thread: "
                + Thread.currentThread().getName());//<- Tarea que mostrará la fecha de impresión y el nombre
                // del Thread
                System.out.println("Finaliza el tiempo");
                timer.cancel(); //<- Cierre del Timer
            }
        }, 5000); //<- Delay de 5 segundos (milli:5000)

        System.out.println("Agendamos una tarea para 5 segundos más ..."); //mensaje sin delay
    }
}
