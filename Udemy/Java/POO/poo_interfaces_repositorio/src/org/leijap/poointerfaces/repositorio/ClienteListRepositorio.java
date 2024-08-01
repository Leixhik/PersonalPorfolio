package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente>{ //Implementación de Multiples Interfaces

    /*Busca un cliente en la lista por su id.
    Usa un bucle for para recorrer la lista y devolver el cliente que coincide con el id.*/
    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) { //Validar que el id del cliente no sea null
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    /*modificar el cliente proporcionado a la lista dataSource.*/
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre()); //Set para modificar y Get para agregar el nombre almacenado en el cliente.getID
        c.setApellido(cliente.getApellido()); // ""...
    }

    /* Ordenar la lista de clientes según el campo especificado y dirección*/
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
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
    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
