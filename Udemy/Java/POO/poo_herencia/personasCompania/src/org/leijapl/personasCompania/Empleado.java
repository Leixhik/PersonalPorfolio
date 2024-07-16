package org.leijapl.personasCompania;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoID;

    //Métodos
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoID = empleadoID;
    }


    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    @Override
    public String toString() {
        return "====Empleado====="
                + "\nID de Empleado: " + empleadoID
                + "\tSalario: " + remuneracion ;
    }
}
