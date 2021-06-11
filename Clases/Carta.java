package Clases;
public class Carta {
    Platoprincipal platos[];
    
    public Carta(Platoprincipal platos[]){
        this.platos=platos;
    }
    //
    public void mostrarCarta(){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("NOMBRE                                  PRECIO PERSONAL        PRECIO FAMILIAR        INDICE");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Platoprincipal pla:platos){
            System.out.println(pla.getNombre()+"         S/."+pla.getPrecio_personal()+"               S/. "+pla.getPrecio_fam()+"              "+pla.getIndice());
        }
        System.out.println("---------------------------------------------------------------------------------------------"); 
    }
}
