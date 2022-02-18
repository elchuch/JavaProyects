
package ejercicio4;


public class Main {
   public static void main(String args[]){
         
          Television tv1= new Television(798.89, 34.89);
          Electrodomestico e=new Television(28.889,56.9);
          Lavadora lava[]=new Lavadora[6];// cre un arreglo de objetos de la clase lavadora
          Television arregloTv[]=new Television[2];
          lava[0]=new Lavadora();
          lava[1]=new Lavadora(45,78);
           arregloTv[0]=new Television(34, 90);
           arregloTv[1]=new Television(890, -7898);
         System.out.println(tv1);
         System.out.println(e);
         System.out.println(arregloTv[0]);
         System.out.println(arregloTv[1]);
         
         
       
       
    }

}
