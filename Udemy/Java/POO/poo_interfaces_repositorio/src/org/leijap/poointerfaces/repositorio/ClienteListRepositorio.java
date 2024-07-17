package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio{ //Implementación de Multiples Interfaces
    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    /*Devuelve la lista completa de clientes*/
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

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

    /*añadir el cliente proporcionado a la lista dataSource.*/
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }
    /*modificar el cliente proporcionado a la lista dataSource.*/
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre()); //Set para modificar y Get para agregar el nombre almacenado en el cliente.getID
        c.setApellido(cliente.getApellido()); // ""...
    }

    /*eliminar el cliente por su id unico*/
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id)); //Se basa en el for de proID que está más arriba.
    }

    /* Ordenar la lista de clientes según el campo especificado y dirección*/
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort((a, b) -> {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    switch (campo){
                        case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DESC) {
                    switch (campo){
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                                resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
        });
        return dataSource;
    }

    /*Este método debería devolver una sublista de clientes, comenzando
    desde el índice desde y terminando en el índice hasta.*/
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
