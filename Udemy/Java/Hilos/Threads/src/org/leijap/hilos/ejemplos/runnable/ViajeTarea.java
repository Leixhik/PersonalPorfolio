package org.leijap.hilos.ejemplos.runnable;

import org.w3c.dom.ls.LSOutput;

public class ViajeTarea implements Runnable {
    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
    }

}
