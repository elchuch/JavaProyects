
package ejercicio4;


public class Television  extends Electrodomestico{
    private static final boolean TDT=false;
     private  int  resolucion;
     private boolean tdt ;
     
     public Television(){
          
      }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion, boolean tdt, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }
      
     
}
