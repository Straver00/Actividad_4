/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jg702
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private int tiempoTotal;
    private String paisEquipo;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.tiempoTotal = 0;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    public List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void calcularTiempoTotal() {
        tiempoTotal = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotal += ciclista.getTiempoAcumulado();
        }
    }

    public void listarNombresCiclistas() {
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre());
        }
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Tiempo total del equipo: " + tiempoTotal);
        System.out.println("Ciclistas del equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclista(int identificador) {
        boolean encontrado = false;
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                System.out.println("Datos del ciclista:");
                System.out.println("Identificador: " + ciclista.getIdentificador());
                System.out.println("Nombre: " + ciclista.getNombre());
                System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado());
                System.out.println(ciclista.imprimirTipo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ciclista no encontrado.");
        }
    }
}
