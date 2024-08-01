package org.leijap.genericsclass;
/*
-Programación genérica: Permite crear clases y métodos que puedan trabajar con diferentes tipos de datos.
-Tipo genérico: Representa un tipo de dato que se especificará más tarde.
-Casting: Convertir un objeto de un tipo a otro.
-Bucle for-each: Iterar sobre los elementos de una colección.
-Instancia: Un objeto de una clase.*/

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a: camion){
            if (a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            }
            else if (a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
            else if (a instanceof Maquinaria) {
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }


    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5); //Máximo de Caballos en un Camión.
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);


        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));
        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Ferrari"));
        transAuto.add(new Automovil("Lamborghini"));
        transAuto.add(new Automovil("Chevrolet"));
        imprimirCamion(transAuto);
    }
}
