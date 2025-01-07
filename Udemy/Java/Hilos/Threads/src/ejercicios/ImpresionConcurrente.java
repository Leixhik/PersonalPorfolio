// 1. Impresión Concurrente: Crea dos hilos que impriman números del 1 al 10.
// Un hilo debe imprimir los números pares y otro los impares. Asegúrate de que
// la salida sea intercalada (ej. 1, 2, 3, 4...). (Usa Runnable).

package ejercicios;

public class ImpresionConcurrente {
    private int par = 0;
    private boolean impar;

    public synchronized void setPar(int numero){
        while(impar){
            try{
                wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        this.par = numero;
        System.out.println("Número par: " + this.par);
        this.impar = true;
        notify();
    }

    public synchronized int getPar(){
        while(!impar){
            try {
                wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Número impar: " + this.par);
        this.impar = false;
        notify();
        return par;


    }
}
