
package equipoFutbol;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    static Scanner entrada=new Scanner(System.in);
    static ArrayList<Persona> persona =new ArrayList<Persona>();
    static Persona  futbolista=  new Futbolista(9,"delantero","gonzalo","jesus",22);
    // instanciado un objeto futbolista del tipo persona 
    static Persona futbolista1=new Futbolista(12,"trasero","Ramirez","Hector",45);
    static Persona entrenador=new Entrenador("defensiva","Jesus","Torres",22);
    static Persona doctor=new Medico("lic en Medicia",24,"Alex","vega",55);
    
    public static void main(String args[]){
        persona.add(futbolista);
        persona.add(futbolista1);
        persona.add(entrenador);
        persona.add(doctor);
        menu();
        
    }
    public static void menu(){
        int opcion;
        do{
            System.out.println(" Menu");
            System.out.println("1-Viaje en equipo");
            System.out.println("2-Entrenamiento");
            System.out.println("3-Partido de futbol");
            System.out.println("4-Planificar entrenamiento");
            System.out.println("5-entrenamiento");
            System.out.println("6-curar lesion");
            System.out.println("salir--7");
            System.out.println("digitar opcion: ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1: viajarEquipo(); break;
                case 2: entrenarEquipo(); break;
                case 3:  partidoFubtol(); break;
                case 4: planificarEntrenamiento();break;
                case 5:darEntrevista(); break;
                case 6: break;
                case 7: break;
                default: System.out.println("se equivoco de opcion de menu");break;
                
              
            }
        }while(opcion!=7);
    }
    public static void viajarEquipo(){
        for( Persona i:persona){
            System.out.println(i.getApellido()+ "" +i.getNombre());
            i.viajar();
        }
    }
    public static void entrenarEquipo(){
        for(Persona i: persona){
            System.out.println(i.getApellido()+" "+i.getNombre());
            i.entrenamiento();
        }
    }
    public static void partidoFubtol(){
        for(Persona i: persona){
            System.out.println(i.getApellido()+" "+i.getNombre());
        }
    }
    public static void planificarEntrenamiento(){
        System.out.println(entrenador.nombre);
        ((Entrenador)entrenador).planificarEntrenamiento();// estoy haciendo downcating
        
    }
    public static void darEntrevista(){
        System.out.println(futbolista.getNombre());
        ((Futbolista)futbolista).entrevista();
    }
}
