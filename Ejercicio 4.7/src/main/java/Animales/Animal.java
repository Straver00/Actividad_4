/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Animales;

/**
 *
 * @author jg702
 */
    public abstract class Animal {
    protected String sonido; 
    protected String alimentos; 
    protected String hábitat; 
    protected String nombreCientífico; 
    public abstract String getNombreCientífico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();
}
