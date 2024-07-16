package org.leijap.pooclasesabstractas.form.elementos;

import org.leijap.pooclasesabstractas.form.validador.LargoValidador;
import org.leijap.pooclasesabstractas.form.validador.Validador;
import org.leijap.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    //Constructores
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if (!v.esValidador(this.valor)){
                if(v instanceof MensajeFormateable){
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(v.getMensaje(), nombre)); //Si está vacia retorna True
                 }
                }
        }
        return this.errores.isEmpty(); //Si no está vacia retorna False y la hace inválida.
    }

    //Método Abstracto
    abstract public String dibujarHtml();


}
