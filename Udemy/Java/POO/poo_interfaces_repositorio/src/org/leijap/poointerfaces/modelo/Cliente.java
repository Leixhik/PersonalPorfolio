/*La clase Cliente representa a un cliente con un identificador único, nombre y apellido*/

package org.leijap.poointerfaces.modelo;

import java.util.Objects;

public class Cliente extends BaseEntity{

    // Atributos
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        super(); //Invoca al Constructor Vacío de la clase Padre
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

}
