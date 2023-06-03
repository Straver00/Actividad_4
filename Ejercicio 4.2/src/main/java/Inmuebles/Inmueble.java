package Inmuebles;

public class Inmueble {
    // Atributos
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    // Constructor
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    // Metodos
    double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }
    /**
     * Método que muestra en pantalla los datos de un inmueble
     */
    void imprimir() {
        System.out.println("Identificador inmobiliario = " +
                identificadorInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
