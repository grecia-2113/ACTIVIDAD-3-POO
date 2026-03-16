package Vehiculos;

// Clase base para todos los vehículos
public class Vehiculo {

    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String mostrarInfo() {
        return "Marca: " + marca + "\nVelocidad: " + velocidad;
    }
}