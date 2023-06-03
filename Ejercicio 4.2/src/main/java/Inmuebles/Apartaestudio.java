package Inmuebles;

public class Apartaestudio extends Apartamento{
    // Atributos
    protected static double valorArea = 1500000;

    // Constructor
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {

        super(identificadorInmobiliario, area, direccion,1 , 1);
    }

    // Metodos
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
