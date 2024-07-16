import javax.swing.*;

/*
    Ask for a number (which must be between 0 and 10)
    and show the multiplication table of sid number.
 */
public class excersice16_tabla0y10 {
    public static void main(String[] args) {
         int num, multiplicacion;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor entre 0 y 10: "));
        if ( (num >= 0) && (10 >= num) ){
         for (int i=1; i<=10;i++){
                 while (i <=10){
                     multiplicacion = num * i;
                     System.out.println(num +" x "+i+" = " + multiplicacion);
                     i++;
                 }
             }
         }else {
            System.out.println("No se ha ingresado un valor entre 0 y 10");
        }
    }
}
