/* Contiene métodos para ordenar la lista de clientes según un campo específico
y una dirección (ascendente o descendente)*/

package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);

}
