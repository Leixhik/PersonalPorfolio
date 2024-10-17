package org.leijap.ejemplos.set.modelo;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno() {

    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota ;
    }

    @Override
    public int compareTo(Alumno a) {
       /* if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);*/
       /* if (this.nota.equals(a.nota)){
            return 0;
        }
        if (this.nota > a.nota){
            return 1;
        }else {
            return -1;
        }
        */
        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }
}
