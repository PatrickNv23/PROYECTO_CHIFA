package Clases;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Prueba_Principal {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //atributos de administardor
        String usuario;
        String contraseña;
        
        //EMPLEADOS
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado_Limpieza empleado1 = new Empleado_Limpieza("Pablo Navarro  ", 12456, "Masculino", 6);
        empleados.add(empleado1);
        Empleado_Limpieza empleado2 = new Empleado_Limpieza("Jaun Guarnizo  ", 25489, "Masculino", 6);
        empleados.add(empleado2);
        Mesero mesero1 = new Mesero("Luisa Llontop  ", 13248, "Femenino ",7);
        empleados.add(mesero1);
        Mesero mesero2 = new Mesero("Paolo Ramirez  ", 12248, "Masculino",7);
        empleados.add(mesero2);
        Cocinero chef = new Cocinero("Juan Gomez     ", 15976, "Masculino",7);
        empleados.add(chef);
        Administrador admi1 = new Administrador("Patrick Navarro", 12349, "Masculino",8);
        empleados.add(admi1);
        Administrador admi2 = new Administrador("Joselyn Lopez  ", 12349, "Masculino",8);
        empleados.add(admi2);
        Administrador admi3 = new Administrador("Profesor Vega  ", 12349, "Masculino",8);
        empleados.add(admi3);
        
        //PLATOS  
        Platoprincipal platos[];
        platos = new Platoprincipal[10];
        //cada arreglo tiene el nombre del plato, precio personal,precio familiar, y el indice
        platos[0] = new Platoprincipal("Tallarin saltado con Pollo          ", 14, 45, 1);
        platos[1] = new Platoprincipal("Tallarin saltado con trozos de pollo", 15, 43, 2);
        platos[2] = new Platoprincipal("Arroz chaufa con trozos de pollo    ", 13, 50, 3);
        platos[3] = new Platoprincipal("Arroz Chaufa con Mariscos           ", 20, 70, 4);
        platos[4] = new Platoprincipal("Pollo con verduras                  ", 16, 48, 5);
        platos[5] = new Platoprincipal("Pollo enrollado c/salsa de ostion   ", 15, 57, 6);
        platos[6] = new Platoprincipal("Pollo ChiJauKay con salsa agrudulce ", 12, 53, 7);
        platos[7] = new Platoprincipal("Pollo TiPaKay con salsa de ostion   ", 13, 47, 8);
        platos[8] = new Platoprincipal("Pollo con piña en salsa agridulce   ", 16, 62, 9);
        platos[9] = new Platoprincipal("Pollo con champiñones               ",17, 59, 10);
        Carta carta1 = new Carta(platos);

        char respuesta = ' ';
        int opc, opc1;
        do {
            opc = menu0();
            switch (opc) {
                case 1:   //el usuario es el administrador           (menu principal)
                    Administrador admip = new Administrador("PatrickNavarro", "123");
                    Administrador admij = new Administrador("JoselynLopez", "123");
                    Administrador admiv = new Administrador("ProfesorVega", "123");
                    Scanner leer1 = new Scanner(System.in);
                    System.out.println("Ingrese su usuario");                   
                    usuario = leer1.nextLine();
                    System.out.println("..................");
                    System.out.println("Ingrese su contraseña");
                    contraseña = leer1.nextLine();
                    System.out.println(".....................");                    
                    if (((usuario.equals(admip.getUsuario()) && contraseña.equals(admip.getContraseña()) || (usuario.equals(admij.getUsuario()) && contraseña.equals(admij.getContraseña()) || (usuario.equals(admiv.getUsuario()) && contraseña.equals(admiv.getContraseña())))))) {
                        do {
                            opc1 = menuAdmi();  //       menu donde accede el admistrador           (menu admi)
                            if (opc1 == 1) {    //       ver lista de empleados
                                mostrarEmpleados(empleados);
                            } else if (opc1 == 2) {  //       calcular sueldo de empleados
                                calcularSueldoEmpleados(empleados);
                            } else if (opc1 == 3){ //    horas extra xd
                                Empleado_Limpieza limpieza = empleado1;
                                System.out.println("EMPLEADO 1: Ingrese las horas extra"); int horas_extra = leer.nextInt();
                                limpieza.setHoras_extra(horas_extra); empleado1.calcularSueldoHorasExtra();
                                Empleado_Limpieza limpieza2 = empleado2;
                                System.out.println("EMPLEADO 2: Ingrese las horas extra"); int horas_extra2 = leer.nextInt();
                                limpieza2.setHoras_extra(horas_extra2); empleado2.calcularSueldoHorasExtra();
                                Mesero mesero_1 = mesero1;
                                 System.out.println("EMPLEADO 3: Ingrese las horas extra"); int horas_extra3 = leer.nextInt();
                                mesero_1.setHoras_extra(horas_extra3); mesero1.calcularSueldoHorasExtra();
                                Mesero mesero_2 = mesero2;
                                 System.out.println("EMPLEADO 4: Ingrese las horas extra"); int horas_extra4 = leer.nextInt();
                                mesero_2.setHoras_extra(horas_extra4); mesero2.calcularSueldoHorasExtra();
                                Cocinero chef1 = chef;
                                  System.out.println("EMPLEADO 5: Ingrese las horas extra"); int horas_extra5 = leer.nextInt();
                                chef1.setHoras_extra(horas_extra5); chef.calcularSueldoHorasExtra();
                                Administrador admi_1 = admi1;
                                 System.out.println("EMPLEADO 6: Ingrese las horas extra"); int horas_extra6 = leer.nextInt();
                                admi_1.setHoras_extra(horas_extra6); admi1.calcularSueldoHorasExtra();
                                Administrador admi_2 = admi2;
                                 System.out.println("EMPLEADO 7: Ingrese las horas extra"); int horas_extra7 = leer.nextInt();
                                admi_2.setHoras_extra(horas_extra7); admi2.calcularSueldoHorasExtra();
                                Administrador admi_3 = admi3;
                                 System.out.println("EMPLEADO 8: Ingrese las horas extra"); int horas_extra8 = leer.nextInt();
                                admi_3.setHoras_extra(horas_extra8); admi3.calcularSueldoHorasExtra();
                            }else if (opc1 == 4){
                                break;
                            }
                        } while (opc1 == 1 || opc1 == 2 || opc1 == 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no registrado ", "                              !!! ERROR ¡¡¡", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case 2:
                    Administrador admi = new Administrador();
                    Cliente titular = new Cliente();
                    Orden o = new Orden();
                    Producto producto = new Producto();
                    Scanner leer2 = new Scanner (System.in);
                    // el usuario es un cliente           (menu principal)
                    do {
                        opc1 = menuCliente();//menu donde accede el cliente           (menu cliente)
                        if (opc1 == 1) {        //mostrar carta
                            carta1.mostrarCarta();
                        } else if (opc1 == 2) {  //hacer pedido                          
                            System.out.println("Ingrese su nombre:");
                            String nombre = leer2.nextLine();
                            System.out.println("..................");
                            titular.setNombre(nombre);
                            o.calcularOrden(platos, admi,producto,titular);
                        } else if (opc1 == 3) {  //salir
                            break;
                        }
                    } while (opc1 < 1 || opc1 > 3);
                    break;
                case 3:  //salir            (menu principal)                 
                    break;
            }
            System.out.println("¿ Desea elegir otra opción  ? (s/n)");
            respuesta = leer.next().toUpperCase().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
    }
    public static void mostrarEmpleados(ArrayList<Empleado> e) {
        System.out.println("Listando empleados...");
        System.out.println(" NOMBRE                     CODIGO             GENERO           HORAS DIARIAS");
        System.out.println("-------------------------------------------------------------------------------");
        for (Empleado em : e) {
            em.mostrarDatos();
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
    public static void calcularSueldoEmpleados(ArrayList<Empleado> ee){
        System.out.println("Calculando sueldo.....");
        System.out.println("---------------------------------------------------------------------------------");
        for (Empleado en:ee) {
            en.calcularSueldo();
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
    
    public static int menu0() {
        int i = 0;
        int op = 0;
        String opcion = JOptionPane.showInputDialog(null, "    BIENVENIDO AL CHIFA PALERMO  "//escribir un numero ... input
                + "\n ==============================="
                + "\n TIPO DE USUARIO "
                + "\n ================="
                + "\n 1. ADMINISTRADOR"
                + "\n 2. CLIENTE"
                + "\n 3. SALIR"
                + "\n ================="
                + "\n Elija una opción: ", "Chifa Palermo", JOptionPane.INFORMATION_MESSAGE);
        do {
            try {
                op = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                while (i <= 1) {
                    JOptionPane.showMessageDialog(null, "Dato incorrecto " + e.getMessage());
                    //System.out.println("Dato incorrecto " + e.getMessage());i++;          tambien vale jiji
                    i++;
                }
                return op;
            }
        } while (op < 1 || op > 3);
        return op;
    }

    public static int menuAdmi() {
        int i = 0;
        int op = 0;
        String opcion = JOptionPane.showInputDialog("\n MENÚ DE OPCIONES "
                + "\n ============================"
                + "\n 1. Ver datos de empleados"
                + "\n 2. Ver sueldos de empleados"
                + "\n 3. Ingresar horas extras"
                + "\n 4. Salir"
                + "\n ==========================="
                + "\n Elija una opción: ");
        do {
            try {
                op = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                while (i <= 1) {
                    JOptionPane.showMessageDialog(null, "Dato incorrecto " + e.getMessage());
                    i++;
                }
                return op;
            }
        } while (op < 1 || op > 4);
        return op;
    }
    
    public static int menuCliente() {
        int i = 0;
        int op = 0;
        String opcion = JOptionPane.showInputDialog("\n MENÚ DE OPCIONES "
                + "\n ================================"
                + "\n 1. Ver la carta del restaurante"
                + "\n 2. Ingresar una orden"
                + "\n 3. Salir"
                + "\n ================================"
                + "\n Elija una opción: ");
        do {
            try {
                op = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                while (i <= 1) {
                    JOptionPane.showMessageDialog(null, "Dato incorrecto " + e.getMessage());
                    i++;
                }
                return op;
            }
        } while (op < 1 || op > 2);
        return op;
    }
}