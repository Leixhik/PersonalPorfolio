package RetornoDeVariables;

import ClasesYObjetos.Operacion;

import javax.swing.*;

public class Main {
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro número: "));

    Operaciones op = new Operaciones();

       int suma = op.sumar(n1,n2);
       int resta = op.restar(n1,n2);
       int mult = op.multiplicar(n1,n2);
       int divi =  op.dividir(n1,n2);

       int res = op.mostrarResultados(suma, resta, mult, divi);
}
