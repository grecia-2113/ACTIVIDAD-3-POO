package Vehiculos;

// Clase derivada que hereda de Vehiculo
public class Auto extends Vehiculo implements Conducible {

    private int puertas;

    public Auto(String marca, int velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
    }

    @Override
    public void frenar() {
        velocidad -= 5;
    }

    public String mostrarAuto() {
        return mostrarInfo() + "\nPuertas: " + puertas;
    }
}
