package org.leijap.hilos.ejemplos.thread;

public class NombreThread extends Thread {
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() { /* <- Empieza el Thread */
        System.out.println("Se inició el método run del hilo " + getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
    }
}
