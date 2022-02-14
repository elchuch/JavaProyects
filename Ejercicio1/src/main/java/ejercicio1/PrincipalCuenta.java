
package ejercicio1;

public class PrincipalCuenta {
    public static void main(String args[]){
        Cuenta cliente1= new Cuenta("Simia Vazquez",3000);
        Cuenta cliente2=new Cuenta("JESUS BEGA");
        cliente1.ingresar(2000);
        cliente2.ingresar(1000);
        cliente1.retirar(4000);
        cliente2.retirar(1200);
        System.out.println(cliente1);
        System.out.println(cliente2);
         
         
    }
}
