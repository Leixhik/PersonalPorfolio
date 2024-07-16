package org.leijap.appFacturas.modelo;

public class Producto {
    // Atributos
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;


    //Métodos

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
=======
>>>>>>> 652a7569e0ddf56d37ea274370873e092694a8ae
}
