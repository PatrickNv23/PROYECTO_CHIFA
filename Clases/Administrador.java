package Clases;
public class Administrador extends Empleado implements Sueldoadicional{    
    private String Usuario;
    private String Contraseña;
    private double Sueldo;
    private int horas_extra;
    
    public Administrador() {
    }
    public Administrador(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }   
    public Administrador(String nombre, int codigo_empleado, String genero,int num_horasdia) {
        super(nombre, codigo_empleado, genero,num_horasdia);
    }
    //getters
    public String getContraseña() {
        return Contraseña;    }
    public String getUsuario() {
        return Usuario;    }
    public int getHoras_extra() {
        return horas_extra;    }    
    //
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;    }
    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;    }
    //
    @Override
     public void mostrarDatos(){
         System.out.println(nombre+"             "+codigo_empleado+"             "+genero+"              "+num_horasdia);
    }    
    public double calcularVuelto(double pago, double total){
        double vuelto;
        vuelto = pago - total;
        return vuelto;
    }  
    @Override
    public void calcularSueldo(){
        Sueldo = ((num_horasdia*precio_hora)*30)+800;
        System.out.println("El sueldo mensual para el administrador " +nombre+ " es de : " +Sueldo);
    }    
    @Override
    public void calcularSueldoHorasExtra(){
        double nuevo_precio = this.Sueldo + (this.horas_extra*precio_hora*valor);
        System.out.println("El sueldo más horas extras para el administrador " +nombre+ " es : S/. " +nuevo_precio);
    }    
}
