
package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProductos;
    private static final int MAX_PROD=10;
    
    public Orden(){
        
        this.idOrden=++Orden.contadorOrden;// por cada objeto que se crea
         this.productos=new Producto[Orden.MAX_PROD];
    }     
    // se le asinga un valor a  idOrden
      public void agregarProducto(Producto producto){
          if(this.contadorProductos < Orden.MAX_PROD){
              this. productos[this.contadorProductos++]=producto;
          }
          
      }
      public double calcularTotal(){
          double total=0;
          for (int i = 0; i <this.contadorProductos; i++) {
              Producto p= this.productos[i];// creo una variable local p del tipo Producto
              total +=p.getPrecio();
          }
          return total;
      }
      public void mostrarOrden(){
          System.out.println("id orden: "+this.idOrden);
          System.out.println("total orden: "+this.calcularTotal());
          System.out.println(" productos");
          for (int i = 0; i <this.contadorProductos; i++) {
              System.out.println(this.productos[i]);
              
          }
      }
}
