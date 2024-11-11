package org.leijap.vuelos.clases;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo> {
    // Atributos
    private String nombre;
    private String origen;
    private String destino;
    private Date fecha;
    private int pasajeros;

    // Métodos

    public Vuelo(String nombre, String origen, String destino, Date fecha, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public int compareTo(Vuelo o) {
        return 0;
    }
}
