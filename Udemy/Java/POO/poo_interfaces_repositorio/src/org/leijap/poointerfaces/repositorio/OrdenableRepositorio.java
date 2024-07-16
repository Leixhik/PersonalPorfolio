/* Contiene métodos para ordenar la lista de clientes según un campo específico
y una dirección (ascendente o descendente)*/

package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
