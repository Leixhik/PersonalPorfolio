package org.leijap.poointerfaces.repositorio.lista;

import org.leijap.poointerfaces.modelo.Cliente;
import org.leijap.poointerfaces.modelo.Producto;
import org.leijap.poointerfaces.repositorio.AbstractaListRepositorio;
import org.leijap.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public void editar(Producto producto) {
        Producto p = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    //Comparacion de clientes
    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "descripción" ->
                    resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" ->
                    resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
