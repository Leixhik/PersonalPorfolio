package org.leijap.appFacturas.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;

    // Métodos

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte(){ // Cantidad del Producto * el Precio
        return this.cantidad * this.producto.getPrecio();
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
=======
>>>>>>> 652a7569e0ddf56d37ea274370873e092694a8ae
}
