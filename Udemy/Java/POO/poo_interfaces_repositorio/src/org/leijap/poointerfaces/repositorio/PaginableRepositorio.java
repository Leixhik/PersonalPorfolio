/* Esta interfaz proporciona métodos para paginar la lista de clientes, es decir,
dividir la lista en sublistas más pequeñas según un rango específico*/

package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta); //limite de tabla 0-9, 10-19...

}
