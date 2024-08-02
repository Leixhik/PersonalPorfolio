/*La interfaz CrudRepositorio define los métodos básicos que cualquier repositorio
debe implementar para gestionar entidades de tipo Cliente. */

package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar(); //Devuelve lista de todos los clientes
    T porId(Integer id); // Devuelve un cliente qque coincida por el id
    void crear(T t); // Crea un nuevo cliente
    void editar(T t); //Modificar cliente en existencia
    void eliminar(Integer id); //Elimina a un cliente por su id
}

