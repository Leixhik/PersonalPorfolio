package org.leijapl.personasCompania;

public class Cliente  extends Persona{
    private int clienteID;

    //Métodos

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteID = clienteID;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }
}
