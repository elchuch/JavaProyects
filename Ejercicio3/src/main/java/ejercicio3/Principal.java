
package ejercicio3;

import java.util.Scanner;


public class Principal {
    public static  void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int longitud;
        String contraseña;
        
        
        Password p1=new Password(8,"abropgt");
        Password p2=new Password(8,"ottjuiop");
        Password p3=new Password(8,"aopqkitf");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
    }
}
