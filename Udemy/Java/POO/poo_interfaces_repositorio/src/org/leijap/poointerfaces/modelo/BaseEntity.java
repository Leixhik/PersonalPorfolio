package org.leijap.poointerfaces.modelo;

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
}
