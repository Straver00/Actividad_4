/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jg702
 */
public class Escalador extends Ciclista {
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionPromedioSubida, float gradoRampaSoportada) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    public float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    public void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    public float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
}
    