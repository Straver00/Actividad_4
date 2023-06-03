package Inmuebles;

public class LocalComercial extends Local{
    // Atributos
    protected static double valorArea = 3000000;
    protected String centroComercial;

    // Constructor
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    // Metodos
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
