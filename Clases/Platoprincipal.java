package Clases;
public class Platoprincipal {
    //atributos
    private String nombre;
    private double precio_personal;
    private double precio_fam;
    private int indice;
    private int cantidad_plato;
    //constructor
    public Platoprincipal(String nombre, double precio_personal,double precio_fam,int indice) {
        this.nombre = nombre;
        this.precio_personal = precio_personal;
        this.precio_fam=precio_fam;
        this.indice=indice;
    }          
    //getters
    public String getNombre() {
        return nombre;    }
    public double getPrecio_personal() {
        return precio_personal;    }
    public double getPrecio_fam() {
        return precio_fam;    }       
    public int getIndice(){
        return indice;    }
    public double getCantidad_plato() {
        return cantidad_plato;    }  
    //
}
