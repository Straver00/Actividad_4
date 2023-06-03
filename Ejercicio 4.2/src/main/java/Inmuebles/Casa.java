package Inmuebles;

public class Casa extends InmuebleVivienda{
    // Atributos
    protected int numeroPisos;

    //Constructor
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    // Metodos
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + numeroPisos);
    }
}

