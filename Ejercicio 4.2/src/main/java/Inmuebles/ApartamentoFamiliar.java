package Inmuebles;

public class ApartamentoFamiliar extends Apartamento{
    // Atributos
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    // Constructor
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int valorAdministracion) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    // Metodos
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();
    }
}
