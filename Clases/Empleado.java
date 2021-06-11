package Clases;
public abstract class Empleado{
    protected String nombre;
    protected int codigo_empleado; 
    protected String genero;
    protected int num_horasdia;
    
    public Empleado() {
    }
    public Empleado(String nombre, int codigo_empleado, String genero,int num_horasdia) {
        this.nombre = nombre;
        this.codigo_empleado = codigo_empleado;
        this.genero = genero;
        this.num_horasdia = num_horasdia;
    } 
    //getter y setter de nombre
    public String getNombre() {
        return nombre;    }
    public void setNombre(String nombre) {
        this.nombre = nombre;    }
    //getter y setter de codigo empleado
    public int getCodigo_empleado() {
        return codigo_empleado;    }
    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;    }
    //getter y setter de genero
    public String getGenero() {
        return genero;    }
    public void setGenero(String genero) {
        this.genero = genero;    }
    //getter y setter de horas al dia
    public int getNum_horasdia() {
        return num_horasdia;    }
    public void setNum_horasdia(int num_horasdia) {
        this.num_horasdia = num_horasdia;    }
    

    //metodos abstractos
    public abstract void mostrarDatos();    
    public abstract void calcularSueldo();   
}
