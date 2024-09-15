package org.leijap.poointerfaces.repositorio;

import org.leijap.poointerfaces.modelo.BaseEntity;
import org.leijap.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.leijap.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements FullRepo<T>{ //Implementación de Multiples Interfaces

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    /*Devuelve la lista completa de clientes*/
    @Override
    public List<T> listar() {
        return dataSource;
    }

    /*Busca un cliente en la lista por su id.
    Usa un bucle for para recorrer la lista y devolver el cliente que coincide con el id.*/
    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if(id == 0 || id <= 0){
            throw new LecturaAccesoDatoException("ID inválido, debe ser > 0");
        }
        T resultado = null;
        for(T cli: dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) { //Validar que el id del cliente no sea null
                resultado = cli;
                break;
            }
        }
        if (resultado == null){
            throw new LecturaAccesoDatoException("No existe el registro con ID: " + id);
        }
        return resultado;
    }

    /*añadir el cliente proporcionado a la lista dataSource.*/
    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if (t == null){
            throw new EscrituraAccesoDatoException("Error, se insertó un objeto null");
        }
        this.dataSource.add(t);
    }

    /*eliminar el cliente por su id unico*/
    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException{
        this.dataSource.remove(this.porId(id)); //Se basa en el for de proID que está más arriba.
    }

    /*Este método debería devolver una sublista de clientes, comenzando
    desde el índice desde y terminando en el índice hasta.*/
    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
