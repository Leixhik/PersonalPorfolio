package org.leijap.poointerfaces.modelo;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;

    private static int ultimoId;

    // Contructores
    public BaseEntity() {
        this.id = ++ ultimoId; //Incrementa el ID para asignar valor ++ al nuevo id
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //Equals y hasCode que Comparan todos los objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Si son iguales retorna true
        if (o == null || getClass() != o.getClass()) return false; // Si son objetos diferentes de tipo cliente etc, return false
        BaseEntity base = (BaseEntity) o; /*Si todo se cumple comparará los clientes*/
        return Objects.equals(id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
