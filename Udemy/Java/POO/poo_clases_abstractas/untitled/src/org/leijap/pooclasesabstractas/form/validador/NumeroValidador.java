package org.leijap.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo %s debe ser número";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValidador(String valor) {
        try{
            Integer.parseInt(valor); //Lo convierte a entero y valida.
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
