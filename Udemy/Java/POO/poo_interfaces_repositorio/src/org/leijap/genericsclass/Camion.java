package org.leijap.genericsclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion <T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto) {
        if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio."); //Manejo de error.
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}