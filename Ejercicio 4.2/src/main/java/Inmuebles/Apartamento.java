package Inmuebles;

public class Apartamento extends InmuebleVivienda{
    // Constructor
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }

    // Metodos
    void imprimir() {
        super.imprimir();
    }
}
