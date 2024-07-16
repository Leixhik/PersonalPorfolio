package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    //Constructor
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    //Getter
    public int getCarga() {
        return carga;
    }

    @Override //Sobre escribir
    public String mostrarDatos() {
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCapacidad de Carga: "+carga;
    }
}
