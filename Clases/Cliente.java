package Clases;
public class Cliente {
    private String nombre;
    private int num_pedidos;
    private String pedido;
    private double dinero_pago;
    private Producto producto;
    //getters
    public String getNombre() {
        return nombre;    }
    public int getNum_pedidos() {
        return num_pedidos;    }
    public String getPedido() {
        return pedido;    }
    public double getDinero_pago() {
        return dinero_pago;    }
    //setters
    public void setDinero_pago(double dinero_pago) {
        this.dinero_pago = dinero_pago;    }
    public void setNombre(String nombre) {
        this.nombre = nombre;    }    
}
