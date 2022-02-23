
package com.gm.pcmundo;


public class Orden {
    private final int idOrden;
     private  static int contadorOrdenes;
    private Computadora computadoras[];
   private int  contadorComputadoras;
    private   static final int maxComputadoras=10;
     public Orden(){
         this.idOrden=++Orden.contadorOrdenes;
        this. computadoras=new Computadora[Orden.maxComputadoras];
     }
     public void agregarComputadora(Computadora computadora){
         
         if(this.contadorComputadoras<Orden.maxComputadoras){
             this.computadoras[this.contadorComputadoras++]=computadora;
         }else{
             System.out.println("limite superadp");
         }
     }
     public void mostrarOrden(){
         System.out.println("id orden: "+this.idOrden);
         for(int i=0; i<this.contadorComputadoras;i++){
             System.out.println(this.computadoras[i]);
             
         }
     }
}
