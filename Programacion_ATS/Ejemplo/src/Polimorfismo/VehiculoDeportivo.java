package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    //Getter
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    @Override //Sobre escribir Datos
    public String mostrarDatos() {
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNúmero de Cilindros: "+cilindrada;
    }
}
