package org.leijap.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "el campo %s tiene un formato de email inválido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$"; //^ <-- Valida que esé al comienzo de la cadena y al final -->$
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
        return valor.matches(EMAIL_REGEX); /* Te traes el validador de arriba y esta función se encarga de validar la condición el email de usuario*/
    }
}
