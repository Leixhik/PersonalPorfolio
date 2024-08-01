package org.leijap.poointerfaces.repositorio;

public interface FullRepo<T> extends OrdenableRepositorio<T>,
        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio{
}
