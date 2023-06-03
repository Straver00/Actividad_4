package Inmuebles;

public class Local extends Inmueble{
    // Atributos
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;


    // Constructor
    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    // Metodos
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
