/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jg702
 */
public class Velocista extends Ciclista {
   
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}

