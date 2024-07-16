/*
    Design a program that displays the product of the first 10 odd numbers.
 */

public class excersice11_10OddNum {

    public static void main(String[] args){
        long producto = 1;

        for (int i=1; i<=20; i+=2){
            producto *= i;
            System.out.println(producto);
        }
        System.out.println("El producto es: "+producto);
    }
}
