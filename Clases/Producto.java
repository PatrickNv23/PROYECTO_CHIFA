package Clases;
public class Producto {
    //atributos
    private String nombre;
    private int cantidad_plato;
    private double preciogeneral;
    private Cliente titular;
    //constructor
    public Producto() {
    }
    //getter y setter de nombre
    public String getNombre() {
        return nombre;    }
    public void setNombre(String nombre) {
        this.nombre = nombre;    }
    //getter y setter camtidad de platos
    public int getCantidad_plato() {
        return cantidad_plato;    }
    public void setCantidad_plato(int cantidad_plato) {
        this.cantidad_plato = cantidad_plato;    }
    //setter precio general
    public void setPreciogeneral(double preciogeneral) {
        this.preciogeneral = preciogeneral;    }
    //metodo
    public void mostrarDatosproducto() {
        System.out.println("          " + nombre + "              S/. "+ + preciogeneral + "               " + cantidad_plato + "                  S/. " + (preciogeneral * cantidad_plato));
    }
}
