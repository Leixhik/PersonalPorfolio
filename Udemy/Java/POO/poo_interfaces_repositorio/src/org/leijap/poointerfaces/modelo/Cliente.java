/*La clase Cliente representa a un cliente con un identificador único, nombre y apellido*/

package org.leijap.poointerfaces.modelo;

import java.util.Objects;

public class Cliente {

    // Atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    // Contructores
    public Cliente() {
        this.id = ++ ultimoId; //Incrementa el ID para asignar valor ++ al nuevo id
    }

    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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


    //Equals y hasCode que Comparan todos los objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Si son iguales retorna true
        if (o == null || getClass() != o.getClass()) return false; // Si son objetos diferentes de tipo cliente etc, return false
        Cliente cliente = (Cliente) o; /*Si todo se cumple comparará los clientes*/
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
