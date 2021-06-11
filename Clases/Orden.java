package Clases;
import java.util.ArrayList;
import java.util.Scanner;
public class Orden {

    Scanner leer = new Scanner(System.in);
    // atributos    
    double total = 0;
    private Platoprincipal platos[];
    private String pedido;
    private double pago;
    private int indice_tipoplato;
    private int indice;
    private int cantidad_platos;
    private char respuesta_operaciones;
    int alter;
    int cont = 0;
    
    ArrayList<Producto> produc = new ArrayList<Producto>();
    
    
    public double getTotal() {
        return total;
    }
    public double getPago() {
        return pago;
    }
    public ArrayList<Producto> getProduc() {
        return produc;
    }
    //metodos    
    public void calcularOrden(Platoprincipal platos[], Administrador admi, Producto producto, Cliente titular) {
        do {
            producto = new Producto();
            Scanner leer1 = new Scanner(System.in);
            System.out.println("Seleccione lo que desea pedir");
            //ingresamos el pedido
            pedido = leer1.nextLine();
            System.out.println(".............................");
            producto.setNombre(pedido);
            System.out.println("¿Cuantos platos desea?");
            //ingresamos la cantidad de platos
            cantidad_platos = leer1.nextInt();
            System.out.println(".......................");
            producto.setCantidad_plato(cantidad_platos);
            System.out.println("Ingrese el indice del plato");
            // ingrese el indice del plato segun la carta
            indice = leer1.nextInt();
            System.out.println("-------------------------------------------");
            System.out.println(" | El plato es personal o familiar (1/2) | ");
            System.out.println(" |       1. Personal    2. Familiar      | ");
            System.out.println("-------------------------------------------");
            indice_tipoplato = leer1.nextInt();
            for (int i = 0; i < platos.length; i++) {
                double personal = 0, familiar = 0;
                if (indice == platos[i].getIndice()) {
                    if (indice_tipoplato == 1) {
                        //ystem.out.println(platos[i].getPrecio_personal());
                        System.out.println("Cantidad de platos : " + cantidad_platos);
                        personal = cantidad_platos * platos[i].getPrecio_personal();
                        System.out.println("Precio Total: S/." + personal);
                        producto.setPreciogeneral(platos[i].getPrecio_personal());
                    } else if (indice_tipoplato == 2) {
                        System.out.println("Cantidad de platos : " + cantidad_platos);
                        familiar = cantidad_platos * platos[i].getPrecio_fam();
                        System.out.println("Precio Total: S/." + familiar);
                        producto.setPreciogeneral(platos[i].getPrecio_fam());
                    }
                    total += (personal + familiar);
                }
            }
            produc.add(producto);
            cont += 1;
            System.out.println("¿Desea pedir otro plato? (s/n)");
            respuesta_operaciones = leer1.next().charAt(0);
        } while (respuesta_operaciones == 's' || respuesta_operaciones == 'S');
        System.out.println("El total es: S/. " + total);
        //
        System.out.println("Ingrese el pago");
        pago = leer.nextDouble();
        if (pago < total) {
            System.out.println("Saldo insuficiente, abone mas dinero");
        } else if (pago == total) {
            System.out.println("Gracias por su compra");
            System.out.println("Vuelto: S/. " + admi.calcularVuelto(pago, total));
            System.out.println("----------------------------");
            System.out.println("  |¿Desea recibir boleta?| ");
            System.out.println("  |   1. SI       2. NO  | ");
            System.out.println("----------------------------");
            alter = leer.nextInt();
            if (alter == 1) {
                listarProductos(produc, titular, admi);
            } else {
                System.out.println("Eso es todo, pronto recibira su pedido!!!");
            }
        } else if (pago > total) {
            System.out.println("Vuelto: S/. " + admi.calcularVuelto(pago, total));
            System.out.println("----------------------------");
            System.out.println(" |¿Desea recibir boleta?| ");
            System.out.println(" |   1. SI       2. NO  | ");
            System.out.println("----------------------------");
            alter = leer.nextInt();
            if (alter == 1) {
                listarProductos(produc, titular, admi);
            } else {
                System.out.println("Eso es todo, pronto recibira su pedido!!!");
            }
        }
    }
    
    public void listarProductos(ArrayList<Producto> pro, Cliente titular, Administrador admi) {
        Restaurante rest = new Restaurante();
        System.out.println("=================================== BOLETA " + rest.getNombre() + " ===================================");
        System.out.println("                                    Dirección : " + rest.getDireccion());
        System.out.println("                                     Número de contacto : " + rest.getNum_contacto());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("CLIENTE : " + titular.getNombre());
        System.out.println("          PRODUCTOS                           PRECIO DEL PLATO     CANTIDAD PLATOS        PRECIO TOTAL");
        for (Producto prod : pro) {
            prod.mostrarDatosproducto();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("TOTAL   :                                                                                    S/. " + total);
        System.out.println("IMPORTE :                                                                                    S/. " + pago);
        System.out.println("VUELTO  :                                                                                    S/. " + admi.calcularVuelto(pago, total));
    }
}