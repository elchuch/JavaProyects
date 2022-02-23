
package mundopc;

import com.gm.pcmundo.*;

public class MundoPC {
    public static void main(String args[]){
        Monitor monitorHP=new Monitor("hp",13);
        Teclado  tecladHp =new Teclado("bluetoo","hp");
        Raton ratonHp=new Raton("blutoo","hp");
        Computadora computadora=new Computadora("hp", monitorHP, tecladHp, ratonHp);
        //-------------------------------
        Monitor monitorGamer=new Monitor("gamer",13);
        Teclado  tecladGamer =new Teclado("bluetoo","gamer");
        Raton ratonGamer=new Raton("blutoo","gamer");
        Computadora computadoraGamer=new Computadora("gamer", monitorGamer, tecladGamer, ratonGamer);
        
        Orden orden1=new Orden();
        orden1.agregarComputadora(computadora);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
    
}
