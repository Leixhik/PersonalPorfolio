package org.leijap.pooclasesabstractas.form.elementos;

import org.leijap.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    // Métodos //
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion); //Se incrementa el arreglo de forma automática
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones){ //por cada.opcion se crea un elemento HTML.
            sb.append("\n<option value= '")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){ //Si está seleccionado se le agrega el " selected"
                sb.append(" selected"); //Funciona como una bandera de un elemento.
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("<option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
