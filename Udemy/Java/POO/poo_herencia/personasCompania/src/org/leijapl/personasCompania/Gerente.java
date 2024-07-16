package org.leijapl.personasCompania;

public class Gerente extends Empleado{
    private double presupuestoID;

    // Métodos


    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoID, double presupuestoID) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoID);
        this.presupuestoID = presupuestoID;
    }

    public double getPresupuestoID() {
        return presupuestoID;
    }

    public void setPresupuestoID(double presupuestoID) {
        this.presupuestoID = presupuestoID;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "presupuestoID=" + presupuestoID +
                '}';
    }
}
