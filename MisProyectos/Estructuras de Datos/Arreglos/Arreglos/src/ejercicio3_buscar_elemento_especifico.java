import javax.swing.*;

public class ejercicio3_buscar_elemento_especifico {
    //Busca un elemento específico en un Arreglo
    public static void main(String[] args) {
        int[] n = new int [10];
        int busqueda;

        for (int i = 0;i < n.length; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingresa un valor: "));
        }

        busqueda = Integer.parseInt(JOptionPane.showInputDialog("Qué elemento buscas en tu arreglo?: "));

        for (int i = 0; i< n.length; i++){
            if (n[i] == busqueda){
                JOptionPane.showMessageDialog(null, "El elemento " + n[i] + " fué encontrado en la posición " + i);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El elemento " + busqueda + " no fué encontrado o no existe");
                break;
            }
        }
    }

}
