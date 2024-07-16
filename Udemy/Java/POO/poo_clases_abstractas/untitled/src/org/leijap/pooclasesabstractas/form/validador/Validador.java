package org.leijap.pooclasesabstractas.form.validador;

abstract public class Validador {

    protected  String mensaje;
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValidador(String valor);

}
