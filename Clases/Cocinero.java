package Clases;
public class Cocinero extends Empleado implements Sueldoadicional{

    private double Sueldo;
    private int horas_extra;
    //constructor
    public Cocinero() {
    }
    public Cocinero(String nombre, int codigo_empleado, String genero, int num_horasdia) {
        super(nombre, codigo_empleado, genero, num_horasdia);
    }
    //
    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;    }
    //
    @Override
    public void mostrarDatos() {
        System.out.println(nombre + "             " + codigo_empleado + "             " + genero + "              " + num_horasdia);
    }
    @Override
    public void calcularSueldo() {
        Sueldo = (num_horasdia * precio_hora) * 30;
        System.out.println("El sueldo mensual para el cocinero " + nombre + " es de : " + Sueldo);
    }
    @Override
    public void calcularSueldoHorasExtra() {
        double nuevo_precio = Sueldo + (horas_extra * precio_hora * valor);
        System.out.println("El sueldo más horas extras para el cocinero " + nombre + " es : S/. " + nuevo_precio);
    }
}
