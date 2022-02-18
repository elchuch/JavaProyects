
package mx.com.gm.ventasTest;

import mx.com.gm.ventas.*;// uso asterisco para usar todas las clases

public class VentasTest {
    public static void main(String args[]){
        Producto producto=new Producto(" camisa",50.1);
        Producto producto2=new Producto("playera",900.67);
        Orden orden1=new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        // queda entendido
        
    }
}
