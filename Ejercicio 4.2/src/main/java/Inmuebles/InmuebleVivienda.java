package Inmuebles;
public class InmuebleVivienda extends Inmueble{
   // Atributos
   protected int numeroHabitaciones;
   protected int numeroBanos;


   // Constructor
   public InmuebleVivienda(int identificadorInmobiliario, int area, String
           direccion, int numeroHabitaciones, int numeroBanos) {
       super(identificadorInmobiliario, area, direccion);
       this.numeroHabitaciones = numeroHabitaciones;
       this.numeroBanos = numeroBanos;
   }

   // Atributos
   void imprimir() {
       super.imprimir(); // Invoca al método imprimir de la clase padre
       System.out.println("Número de habitaciones = " + numeroHabitaciones);
       System.out.println("Número de baños = " + numeroBanos);
   }
}
