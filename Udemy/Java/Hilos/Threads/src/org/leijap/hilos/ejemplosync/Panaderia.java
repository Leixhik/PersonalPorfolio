package org.leijap.hilos.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible; // <-- current false

    /* Mientras haya pan disponible (es decir, disponible es true), el panadero espera.
    Esto evita que el panadero hornee nuevo pan si ya hay uno listo.*/
    public synchronized void hornear(String masa){
        while(disponible){ //<- false
            try {
                wait(); //el hilo del panadero se suspende hasta que otro hilo lo notifique.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true; // Pan disponible
        notify(); /*El panadero notifica al cliente de que hay nuevo pan disponible,
                    permitiendo que el cliente continúe con su tarea*/
    }

    //Mientras no haya pan disponible (es decir, disponible es false), el cliente espera.
    public synchronized String consumir(){
        while(!disponible){ //<- true
            try {
                wait(); /*El cliente se suspende hasta que el panadero notifique que hay nuevo pan.*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*Una vez notificado, el cliente consume el pan y establece disponible en false.*/
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false; // Pan no disponible
        notify();
        return pan;

        /* ↑↑ Los métodos hornear y consumir están sincronizados, lo que garantiza que solo un hilo
        (ya sea el panadero o el cliente) pueda acceder a las variables compartidas pan
        y disponible en un momento dado*/
    }
}
