/*La interfaz CrudRepositorio define los métodos básicos que cualquier repositorio
debe implementar para gestionar entidades de tipo Cliente. */

package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar(); //Devuelve lista de todos los clientes
    Cliente porId(Integer id); // Devuelve un cliente qque coincida por el id
    void crear(Cliente cliente); // Crea un nuevo cliente
    void editar(Cliente cliente); //Modificar cliente en existencia
    void eliminar(Integer id); //Elimina a un cliente por su id
}

