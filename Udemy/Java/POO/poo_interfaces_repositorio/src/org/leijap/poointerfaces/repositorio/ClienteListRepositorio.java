package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
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
            if(cli.getId().equals(id)) {
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
        return List.of();
    }

    /*Este método debería devolver una sublista de clientes, comenzando
    desde el índice desde y terminando en el índice hasta.*/
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }
}
