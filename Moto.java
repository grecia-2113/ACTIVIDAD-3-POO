package Vehiculos;

// Clase derivada que hereda de Vehiculo
public class Moto extends Vehiculo implements Conducible {

    private String tipo;

    public Moto(String marca, int velocidad, String tipo) {
        super(marca, velocidad);
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        velocidad += 15;
    }

    @Override
    public void frenar() {
        velocidad -= 7;
    }

    public String mostrarMoto() {
        return mostrarInfo() + "\nTipo: " + tipo;
    }
}