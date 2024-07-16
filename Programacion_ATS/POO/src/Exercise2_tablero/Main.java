package Exercise2_tablero;

import java.lang.management.MonitorInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Movimiento coord;
        int x,y;
        char tecla; //Movimiento

        System.out.print("Ingresa las coordenadas de inicio\nIngresa x: ");
        x = lector.nextInt();
        System.out.print("Ingresa y: ");
        y = lector.nextInt();

        coord = new Movimiento(x,y); //Coordenada inicial

        do {
            System.out.println("ARRIBA = W\nABAJO = S\nIZQUIERDA = A\nDERECHA = D\nPOSICIÓN ACTUAL = V\nSALIR = X\n\nDigita hacia donde quieres moverte: ");
            tecla = lector.next().charAt(0);
            switch(tecla){
                case 'W':
                case 'w':
                    coord.arriba();
                    System.out.println("ARRIBA");
                    System.out.println("x= "+coord.getX()+", y= "+coord.getY()+"\n"); //Movimiento de Coordenada
                    break;

                case 'S':
                case 's':
                    coord.abajo();
                    System.out.println("ABAJO");
                    System.out.println("x= "+coord.getX()+", y= "+coord.getY()+"\n");
                    break;

                case 'A':
                case 'a':
                    coord.izquierda();
                    System.out.println("IZQUIERDA");
                    System.out.println("x= "+coord.getX()+", y= "+coord.getY()+"\n");
                    break;

                case 'D':
                case 'd':
                    coord.derecha();
                    System.out.println("DERECHA");
                    System.out.println("x= "+coord.getX()+", y= "+coord.getY()+"\n");
                    break;

                case 'V':
                case 'v':
                    System.out.println("POSICIÓN ACTUAL");
                    System.out.println("x= "+coord.getX()+", y= "+coord.getY()+"\n");
            }
        }while (tecla!='x');
    }
}
