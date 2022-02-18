package ejercicio3;

public class Password {

    // constante
    private static final int LONGITUD = 8;
    private static int contador;
    //atributos
    private int longitud;
    private String contraseña;
    // constructor

     public Password(int longitud, String contraseña) {
        int password;
        this.longitud = longitud;
        this.contraseña = contraseña;
        Password.contador++;
        password=Password.contador;
        this.contraseña=this.contraseña+Integer.toString(password);
        
        
        
               
    }

    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrase\u00f1a=" + contraseña + '}';
    }
     
    

}
