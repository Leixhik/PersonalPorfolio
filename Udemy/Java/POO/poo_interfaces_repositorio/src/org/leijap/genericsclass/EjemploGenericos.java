package org.leijap.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion transporteCaballos = new Camion(5); //Máximo de Caballos en un Camión.
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));
        for (Object o: transporteCaballos){
            Animal a = (Animal) o; // Un cast para convertir a hacia o.
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        Camion transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));
        for (Object o: transMaquinas){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.add(new Automovil("Ferrari"));
        transAuto.add(new Automovil("Lamborghini"));
        transAuto.add(new Automovil("Chevrolet"));
        for(Object o: transAuto){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());

        }
    }
}
