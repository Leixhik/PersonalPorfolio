package org.leijap.hilos.ejemplos.runnable;

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
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + nombre); //<- Mostrar el numero de ciclo + nombre del constructor
        }
        try {
            Thread.sleep((long)(Math.random() * 1000)); //<-- Convierte el tipo de dato double a long y hace un random de 1000
        } catch (InterruptedException e) {
            e.printStackTrace(); //<-- Muestra el error más simplificado.
        }
    }
}
