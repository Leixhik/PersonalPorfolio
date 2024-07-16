package org.leijap.pooherencia;

public class AlumnoInternacional extends Alumno{ //Extiende desde Alumno, Persona hasta Object
    private String pais;
    private double notaIdiomas;

    // Métodos
    public AlumnoInternacional(){
        System.out.println("Alumno inter: inicializando constructor");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + ", soy extranjero del país " + getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
        return ((super.calcularPromedio()*3)+notaIdiomas)/4;
    }
}
